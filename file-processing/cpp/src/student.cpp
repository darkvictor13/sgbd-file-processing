#include "student.hpp"

std::istream& operator >> (std::istream &input, Student &me) {
	//const bool is_terminal = (&input == &std::cin);
	input >> me.my_id;
	input.ignore(1, '\n');
	std::getline(input, me.registration_date);
	std::getline(input, me.first_name);
	std::getline(input, me.last_name);
	std::getline(input, me.document_type);
	std::getline(input, me.document);
	std::getline(input, me.phone);
	std::getline(input, me.email);
	input >> me.city_id;
	return input;
}

std::ostream& operator << (std::ostream &output, const Student &me) {
	const bool is_terminal = (&output == &std::cout);

	output << (is_terminal? "Id:                  " : "") <<
		me.my_id << '\n';

	output << (is_terminal? "Data de registro:    " : "") <<
		me.registration_date << '\n';
	
	output << (is_terminal? "Primeiro Nome:       " : "") <<
		me.first_name << '\n';
	
	output << (is_terminal? "Ultimo Nome:         " : "") <<
		me.last_name << '\n';
	
	output << (is_terminal? "Tipo do documento:   " : "") <<
		me.document_type << '\n';
	
	output << (is_terminal? "Numero do documento: " : "") <<
		me.document << '\n';
	
	output << (is_terminal? "Numero de telefone:  " : "") <<
		me.phone << '\n';
	
	output << (is_terminal? "Email:               " : "") <<
		me.email << '\n';
	
	output << (is_terminal? "Id da cidade:        " : "") <<
		me.city_id << '\n';
	return output;
}