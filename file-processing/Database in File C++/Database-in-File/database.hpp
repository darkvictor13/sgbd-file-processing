#ifndef DATABASE
#define DATABASE

#include <vector>
#include <string>
#include <ctime>

#include "student.hpp"

#define DATABASE_PATH "database.txt"

class Database {
public:
    const std::string file_path;
    std::vector<Student> data;

	Database(const char *file_path = DATABASE_PATH);

    const std::vector<Student> &getDataList() const;

	void read();

    void addData(Student &student, int position = -1);

	void write();

    void remove(uint16_t my_id);

	void showDatabase();

	~Database();
};

#endif // DATABASE
