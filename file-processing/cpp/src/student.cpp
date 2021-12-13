#include "student.hpp"

std::istream& operator >> (std::istream &input, Student &me) {
	const bool is_terminal = (&input == &std::cin);
	if (!is_terminal) {
		input >> me.my_id;
		input.ignore(1, '\n');
		std::getline(input, me.registration_date);
	}
	if (is_terminal) std::cout << "Entre com o primeiro nome: ";
	std::getline(input, me.first_name);
	if (is_terminal) std::cout << "Entre com o ultimo nome: ";
	std::getline(input, me.last_name);
	if (is_terminal) std::cout << "Entre com o tipo de documento: ";
	std::getline(input, me.document_type);
	if (is_terminal) std::cout << "Entre com os numeros do documento: ";
	std::getline(input, me.document);
	if (is_terminal) std::cout << "Entre com os numeros do telefone: ";
	std::getline(input, me.phone);
	if (is_terminal) std::cout << "Entre com o email: ";
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