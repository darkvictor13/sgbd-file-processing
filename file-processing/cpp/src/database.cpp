#include "database.hpp"


Database::Database(const char *file_path) : file_path(file_path) {
	read();
}

void Database::read() {
	uint16_t temp_id;
	std::string temp_name, temp_cpf;
	std::ifstream database_read(file_path);

	while (!database_read.eof()) {
		database_read >> temp_id >> temp_name >> temp_cpf;
		map[temp_id] = Student(temp_name, temp_cpf);
	}

	database_read.close();
}

void Database::write() {
	std::ofstream database_write(file_path);
	for (const auto &it : map) {
		database_write << it.first << '\n' << it.second;
	}
	database_write.close();
}

Database::~Database() {
    
}
