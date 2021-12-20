import os
from database import *

database_path = '../Database in File C++/Database-in-File/database.txt'

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
	databse = Databse(database_path)
	response = getUserInput()
	while response != 5:
		if response == 1:
			databse.insert(Student.readFromTerminal())
		elif response == 2:
			databse.show()
		elif response == 3:
			databse.alter (
				int(input('Entre com o id do elemento a ser alterado: ')),
				Student.readFromTerminal()
			)
		elif response == 4:
			databse.remove(
				int(input('Entre com o id do elemento a ser removido: '))
			)

		input('\n\nAperte enter para continuar')
		response = getUserInput()

	databse.write()

if __name__ == "__main__":
	main()
