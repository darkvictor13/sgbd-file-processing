package singleton;

import java.util.List;

import model.Model;
import utils.Parameter;

public class SingletonFactory {

	private static SingletonFactory me = new SingletonFactory();
	
	private SingletonFactory() {}

	public static SingletonFactory getInstance() {
		return me;
	}

	private String getFieldList(Model model) {
		String fieldList = "";
		String separador = "";
		List<String> attributeList = model.getClassAttribute();
		for(String field : attributeList) {
			fieldList += separador + field;
			separador = ",";
		}
		return fieldList;
	}

	private String getValueList(Model model) throws Exception {
		String valueList = "";
		String separador = "";
		List<String> attributeList = model.getClassAttribute();
		for(String field : attributeList) {
			if(model.get(field) == null) {
				valueList += separador + model.get(field);
			}else{
				valueList += separador + "'" + model.get(field) + "'";
			}
			separador = ",";
		}
		return valueList;
	}

	private String getFieldValue(Model model) throws Exception {
		String fieldValue = "";
		String separador = "";
		List<String> attributeList = model.getClassAttribute();
		for(String field : attributeList) {
			fieldValue += separador + field + "='" + model.get(field) + "'";
			separador = ",";
		}
		return fieldValue;
	}

	private String getWhere(Model model, Parameter... parameters) {
		String where = "";
		String separador = " WHERE ";
		for(Parameter parameter : parameters) {
			switch(parameter.getOperator()) {
			case EQUAL:
				where += separador + parameter.getName() + "='" +
					 parameter.getValue() +"'";
				break;
			case LIKE:
				where += separador + parameter.getName() + " LIKE '%" +
				     parameter.getValue() +"%' ";
				break;
			default:
				break;
			}
			separador = " AND ";
		}
		return where;		
	}

	private String getOrderBy(Model model) {
		String order = model.getOrderBy();
		return (order == "" ? "" : " ORDER BY " + order);
	}

	public String getSQLInsert(Model model) throws Exception {
		return "INSERT INTO " + model.getTableName() +
				" (" + getFieldList(model) + ") " +
				" VALUES (" + getValueList(model) + ")";
	}

	public String getSQLUpdate(Model model) throws Exception {
		return "UPDATE " + model.getTableName() +
				" SET " + getFieldValue(model) +
				" WHERE " + model.getIdName() +
				"=" + model.get(model.getIdName());
	}

	public String getSQLDelete(Model model) throws Exception {
		return "DELETE FROM " + model.getTableName() +
				" WHERE " + model.getIdName() +
				"=" + model.get(model.getIdName());
	}

	public String getSQLSelect(Model model, Parameter... parameters) throws Exception {
		return "SELECT * FROM " +
				model.getTableName() +
				getWhere(model, parameters) +
				getOrderBy(model);
	}
}
