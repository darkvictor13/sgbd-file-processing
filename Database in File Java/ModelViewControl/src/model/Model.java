package model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Model {
	private String tableName;
	private String orderBy;

	public Model(String tableName, String orderBy) {
		this.tableName = tableName;
		this.orderBy = orderBy;
	}

	public Object get(String attributeName) throws Exception {
		Field field = this.getClass().getDeclaredField(attributeName);
		return field.get(this);    	
	}

	public void set(String attributeName, Object value) throws Exception {
		Field field = this.getClass().getDeclaredField(attributeName);
		field.set(this, value);
	}

	public Object getId() throws Exception {
		return get(getIdName());
	}

	public String getIdName() {
		return "id" + tableName;
	}

	public String getTableName() {
		return this.tableName;
	}

	public String getOrderBy() {
		return this.orderBy;
	}

	public List<String> getClassAttribute() {
		Field[] fields = this.getClass().getDeclaredFields();
		List<String> attributeList = new ArrayList<String>();
		for(Field field : fields) {
			attributeList.add(field.getName());
		}		
		return attributeList;
	}

	public Model getNewModel() throws Exception {
		return this.getClass().newInstance();
	}

	@Override
	public Model clone()  {
		Model model = null;
		try {
			model = this.getClass().newInstance();
			List<String> attributeList = getClassAttribute();
			for (String attribute : attributeList) {
				model.set(attribute, this.get(attribute));
			}
		}
		catch (Exception exception) {
			exception.printStackTrace();
		}
		return model;
	}
}
