#ifndef STUDENT
#define STUDENT

#include <iostream>
#include <string>
#include <fstream>

struct Student {
	uint16_t my_id;
	std::string registration_date;
	std::string first_name;
	std::string last_name;
	std::string document_type;
	std::string document;
	std::string phone;
	std::string email;
    std::string city;

	friend std::istream& operator >> (std::istream &input, Student &me);
	friend std::ostream& operator << (std::ostream &output, const Student &me);
};

#endif // STUDENT
