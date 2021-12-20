import os
from database import *

database_path = '../cpp/build/database.txt'

def getUserInput() -> int:
	os.system('clear')
	while True:
		resp = int (
			input(
				'|-----------------------------------|\n' +
				'| Operações sobre a lista de alunos |\n' +
				'|-----------------------------------|\n' +
				'| 1 - Inserir                       |\n' +
				'| 2 - Listar                        |\n' +
				'| 3 - Alterar                       |\n' +
				'| 4 - Remover                       |\n' +
				'| 5 - Sair                          |\n' +
				'|-----------------------------------|\n' +
				' -> '
			)
		)
		if (0 < resp and resp < 6):
			return resp
		input('Reposta inválida aperte enter para continuar')

def main():
	d = Databse(database_path)
	response = getUserInput()
	while response != 5:
		if response == 1:
			d.insert(Student.readFromTerminal())
		elif response == 2:
			d.show()
		elif response == 3:
			pass
		elif response == 4:
			pass

		input('Aperte enter para continuar')
		response = getUserInput()

	#s = Student.readFromTerminal()
	d.write()

if __name__ == "__main__":
	main()