#ifndef STUDENT
#define STUDENT

#include <iostream>
#include <string>
#include <fstream>

class Student {
private:
	std::string name;
	std::string cpf;
public:
	Student();
	Student(const std::string &name, const std::string &cpf);

	friend std::istream& operator >> (std::istream &input, Student &me);
	friend std::ostream& operator << (std::ostream &output, const Student &me);

	~Student();
};

#endif // STUDENT
