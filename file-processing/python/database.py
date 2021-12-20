from os import read
from datetime import datetime
from student import Student

class Databse:
	# dados
	file_path: str = ''
	data: list = list()

	# construtor
	def __init__(self, file_path: str):
		self.file_path = file_path
		self.read()

	def read(self):
		temp = Student()
		file = open(self.file_path, 'r')

		size = int(file.readline())
		while temp.read(file):
			self.data.append(temp)
	
	def write(self):
		file = open(self.file_path, 'w')
		for it in self.data:
			it.write(file)

	def insert(self, student: Student):
		student.my_id = len(self.data)
		now = datetime.now()
		student.registration_date = now.strftime('%m/%d/%Y')
		self.data.append(student)

	def show(self):
		for it in self.data:
			print(it)

	def alter(self):
		pass

	def remove(self):
		pass
