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
		file = open(self.file_path, 'r')

		size = int(file.readline())
		temp = Student.read(file)
		while 1:
			if (temp.my_id != -1):
				self.insert(temp)
			else:
				break
			temp = Student.read(file)
	
	def write(self):
		file = open(self.file_path, 'w')
		file.write(str(len(self.data)) + '\n')
		for it in self.data:
			it.write(file)

	def insert(self, student: Student) -> None:
		student.my_id = len(self.data)
		if not student.registration_date:
			now = datetime.now()
			student.registration_date = now.strftime('%m/%d/%Y')
		self.data.append(student)

	def show(self):
		for it in self.data:
			it.print()

	def alter(self, id: int, student: Student):
		student.my_id = id
		if not student.registration_date:
			now = datetime.now()
			student.registration_date = now.strftime('%m/%d/%Y')
		self.data[id] = student

	def remove(self, id: int):
		del self.data[id]
