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

	def read(self, file: TextIOWrapper) -> bool:
		temp = file.readline()
		if (not temp):
			return False

		self.my_id = int(temp)
		self.registration_date = file.readline()
		self.first_name = file.readline()
		self.last_name = file.readline()
		self.document_type = file.readline()
		self.document = file.readline()
		self.phone = file.readline()
		self.email = file.readline()
		self.city = file.readline()
		return True

