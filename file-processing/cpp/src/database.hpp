#ifndef DATABASE
#define DATABASE

#include <unordered_map>
#include <string>

#include "student.hpp"

#define DATABASE_PATH "database.txt"

class Database {
private:
	const std::string file_path;
	std::unordered_map<uint16_t, Student> map;
public:
	Database(const char *file_path = DATABASE_PATH);

	void read();

	void chageData(const std::unordered_map<uint16_t, Student> &data);
	void addData(const Student &student);

	void write();

	~Database();
};

#endif // DATABASE