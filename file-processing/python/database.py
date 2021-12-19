from os import read
from student import Student

class Databse:
	# dados
	file_path: str = ''
	data: list = list()

	# construtor
	def __init__(self, file_path: str) -> None:
		self.file_path = file_path
		self.read()

	def read(self) -> None:
		temp = Student()
		file = open(self.file_path, 'r')

		size = int(file.readline())
		print('Tamanho do vetor = {}' .format(size))
		while temp.read(file):
			self.data.append(temp)