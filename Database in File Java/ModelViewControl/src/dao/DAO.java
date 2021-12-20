package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Model;
import singleton.SingletonDB;
import singleton.SingletonFactory;
import utils.Parameter;

public class DAO {
	private Model model;
	private ResultSet resultSet;
	private SingletonFactory factory = SingletonFactory.getInstance();

	public DAO(Model model) {	
		this.model = model;
	}

	protected ArrayList<Model> getResult() throws Exception {
		ArrayList<Model> result = new ArrayList<Model>();
		Model model;
		while (this.resultSet.next()) {
			List<String> attributeList = this.model.getClassAttribute();
			model = this.model.getNewModel();
			for (String fieldName : attributeList) {
				model.set(fieldName, resultSet.getObject(fieldName));	
			}		
			result.add(model);
		}
		return result;
	}

	protected void execute(String sql) throws Exception {
		System.out.println(sql);
		SingletonDB.getInstance().getStatement().execute(sql);
		this.resultSet = SingletonDB.getInstance().getStatement().getResultSet();
	}

	public void save(Model model) throws Exception {
		String sql = "";
		
		if (model.getId() == null) {
			sql = factory.getSQLInsert(model);
		} else {
			sql = factory.getSQLUpdate(model);
		}
		
		execute(sql);
	}

	public void exclude(Model model) throws Exception {
		String sql= factory.getSQLDelete(model);
		execute(sql);
	}

	public ArrayList<Model> consult(Parameter... parameters) throws Exception {
		String sql = factory.getSQLSelect(model, parameters);
		execute(sql);
		return getResult();
	}
}
