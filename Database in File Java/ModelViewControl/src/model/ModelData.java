package model;

import java.util.List;

import singleton.SingletonFactory;
import utils.Parameter;
import utils.Parameter.Operator;

public class ModelData extends Model {
	protected Integer idData;
	protected String firstName;
	protected String lastName;
	protected String registryDate;
	protected String documentType;
	protected String document;
	protected String phone;
	protected String email;
	protected String city;

	public ModelData() {
		super("data", "studentFirstName ASC");
		this.idData = null;
	}

	public Integer getIdData() {
		return idData;
	}

	public void setIdData(Integer idData) {
		this.idData = idData;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRegistryDate() {
		return registryDate;
	}

	public void setRegistryDate(String registryDate) {
		this.registryDate = registryDate;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Id: " + idData + "\n" + 
			   "Nome: " + firstName + "\n" +
			   "Sobrenome: " + lastName + "\n" +
			   "Data de registro: " + registryDate + "\n" +
			   "Tipo de documento: " + documentType + "\n" +
			   "Documento: " + document + "\n" +
			   "Telefone: " + phone + "\n" +
			   "Email: " + email + "\n" +
			   "Cidade: " + city + "\n";
	}
	
	public static void main(String[] args) {
		ModelData data_01 = new ModelData();
		data_01.setIdData(111111);
		data_01.setFirstName("Teste");
		
		System.out.println(data_01);
		
		try{
			data_01.set("nome", "Luis");
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		
		List<String> list = data_01.getClassAttribute();
		
		for(String string : list) {
			try{
				System.out.println(string + ": " + data_01.get(string));
			}catch(Exception exception) {
				exception.printStackTrace();
			}
		}
		
		Model data_02 = data_01.clone();
		
		System.out.println(data_02);
		
		try{
			System.out.println(SingletonFactory.getInstance().getSQLInsert(data_02));
		}catch(Exception exception) {
			exception.printStackTrace();
		}
	}
}
