package test;

import java.util.ArrayList;

import dao.DAO;
import model.Model;
import model.ModelData;

public class Test {
	public static void main(String[] args) throws Exception {	
		DAO dao = new DAO(new ModelData());
		ModelData data = new ModelData();
		data.setIdData(000000);
		ArrayList<Model> arrayList = dao.consult();
		for(Model model : arrayList) {
			System.out.println(model);
		}
	}
}
