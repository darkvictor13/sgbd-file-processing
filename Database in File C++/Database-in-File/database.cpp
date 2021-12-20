#include "database.hpp"

Database::Database(const char *file_path) : file_path(file_path) {
    read();
}

const std::vector<Student> &Database::getDataList() const {
    return data;
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
            if(temp.my_id != UINT16_MAX)
                addData(temp);
		}
	} 

	database_read.close();
}

void Database::addData(Student &student, int position) {
    if (position == -1) {
        char buffer[12];
        time_t t = time(0);
        strftime(buffer, 12, "%m/%d/%Y", localtime(&t));
        student.my_id = data.size();
        student.registration_date = buffer;
        data.push_back(student);
    } else
        data.at(position) = student;
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

void Database::remove(uint16_t my_id) {
    auto toRemove = data.begin() + my_id;
    data.erase(toRemove);
}

Database::~Database() {

}
