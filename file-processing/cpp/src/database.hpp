#ifndef DATABASE
#define DATABASE

#include <vector>
#include <string>

#include "student.hpp"

#define DATABASE_PATH "database.txt"

class Database {
private:
	const std::string file_path;
	std::vector<Student> data;
public:
	Database(const char *file_path = DATABASE_PATH);

	void read();

	void addData(Student &student);

	void write();
	void showDatabase();

	~Database();
};

#endif // DATABASE