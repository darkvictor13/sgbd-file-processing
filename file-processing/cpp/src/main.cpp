#include <algorithm>
#include <vector>

#include "student.hpp"
#include "database.hpp"

using namespace std;

//int main(int argc, char const **argv) {
int main() {
	string name = "Aaaaaaaaaaaa";
	string cpf = "092.111.111-00";
	unordered_map<uint16_t, Student> map;
	vector<uint16_t> ids = {15, 17, 22, 664, 567, 822, 7, 904, 88, 100};

	cout << "Inserindo elementos\n";
	for (const uint16_t id : ids) {
		map[id] = Student(name, cpf);
		name[0]++;
		cpf[0]++;
	}

	cout << "Escrevendo elementos\n";
	ofstream database_write(DATABASE_PATH);
	for (const pair<uint16_t, Student> &it : map) {
		database_write << it.first << '\n' << it.second;
	}
	database_write.close();

	cout << "Lendo Elementos\n";
	uint16_t id;
	unordered_map<uint16_t, Student> leitura;
	ifstream database_read(DATABASE_PATH);
	while (!database_read.eof()) {
		database_read >> id >> name >> cpf;
		leitura[id] = Student(name, cpf);
	}
	database_read.close();
	for (const auto &it : leitura) {
		cout << it.first << '\n' << it.second << '\n';
	}

	return 0;
}
