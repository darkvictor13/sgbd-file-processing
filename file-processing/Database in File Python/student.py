from dataclasses import dataclass
from io import TextIOWrapper

@dataclass()
class Student:
	my_id: int = 0
	registration_date: str = ''
	first_name: str = ''
	last_name: str = ''
	document_type: str = ''
	document: str = ''
	phone: str = ''
	email: str = ''
	city: str = ''

	def readFromTerminal():
		s = Student()
		s.first_name = input('Entre com o primeiro nome: ')
		s.last_name = input('Entre com o ultimo nome: ')
		s.document_type = input('Entre com o tipo de documento: ')
		s.document = input('Entre com os numeros do documento: ')
		s.phone = input('Entre com os numeros do telefone: ')
		s.email = input('Entre com o email: ')
		s.city = input('Entre com a cidade: ')
		return s

	def read(file: TextIOWrapper):
		s = Student()
		s.my_id = -1
		temp = file.readline()[:-1]
		if (not temp):
			return s

		s.my_id = int(temp)
		s.registration_date = file.readline()[:-1]
		s.first_name = file.readline()[:-1]
		s.last_name = file.readline()[:-1]
		s.document_type = file.readline()[:-1]
		s.document = file.readline()[:-1]
		s.phone = file.readline()[:-1]
		s.email = file.readline()[:-1]
		s.city = file.readline()[:-1]
		return s

	def write(self, file: TextIOWrapper) -> None:
		file.write(str(self.my_id) + '\n')
		file.write(self.registration_date + '\n')
		file.write(self.first_name + '\n')
		file.write(self.last_name + '\n')
		file.write(self.document_type + '\n')
		file.write(self.document + '\n')
		file.write(self.phone + '\n')
		file.write(self.email + '\n')
		file.write(self.city + '\n')

	def print(self):
		print('\nStudent {')
		print('  Id:                  {}'.format(self.my_id))
		print('  Data de registro:    ' + self.registration_date)
		print('  Primeiro Nome:       ' + self.first_name)
		print('  Ultimo Nome:         ' + self.last_name)
		print('  Tipo do documento:   ' + self.document_type)
		print('  Numero do documento: ' + self.document)
		print('  Numero de telefone:  ' + self.phone)
		print('  Email:               ' + self.email)
		print('  Nome da cidade:      ' + self.city)
		print('}')

