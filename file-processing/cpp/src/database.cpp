#include "database.hpp"


Database::Database(const char *file_path) : file_path(file_path) {
	read();
}

void Database::read() {
	int size;
	Student temp;
	std::ifstream database_read(file_path);

	if (database_read) {
		database_read >> size;
		data.reserve(size);
		while (!database_read.eof()) {
			database_read >> temp;
			addData(temp);
		}
	} 

	database_read.close();
}

void Database::addData(Student &student) {
	student.my_id = data.size();
	data.push_back(student);
}

void Database::write() {
	std::ofstream database_write(file_path);
	database_write << data.size() << '\n';
	for (const auto &it : data) {
		database_write << it;
	}
	database_write.close();
}

void Database::showDatabase() {
	for (const auto &it : data) {
		std::cout << it << '\n';
	}
}

Database::~Database() {
    
}
