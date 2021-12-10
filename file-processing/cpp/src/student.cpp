#include "student.hpp"

Student::Student() : name(), cpf() {}

Student::Student(const std::string &name, const std::string &cpf) :
				name(name), cpf(cpf) {}

std::istream& operator >> (std::istream &input, Student &me) {
	std::getline(input, me.name);
	std::getline(input, me.cpf);
	return input;
}

std::ostream& operator << (std::ostream &output, const Student &me) {
	const bool is_terminal = (&output == &std::cout);

	output << (is_terminal? "Nome: " : "") << me.name << '\n';
	output << (is_terminal? "CPF: "  : "") << me.cpf << '\n';
	return output;
}

Student::~Student() {
    
}
