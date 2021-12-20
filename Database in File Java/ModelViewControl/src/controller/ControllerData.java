package controller;

import java.awt.Component;
import java.util.ArrayList;

import dao.DAO;
import model.Model;
import model.ModelData;
import utils.Parameter;
import view.ViewConsultData;
import view.ViewMaintainData;

public class ControllerData implements Controller {
	DAO dao = new DAO(new ModelData());
	ViewConsultData viewConsult = new ViewConsultData(this);
	ViewMaintainData viewMaintain = new ViewMaintainData(this);

	public ControllerData(Component parent) {
		viewConsult.show(parent);
	}

	@Override
	public ArrayList<Model> consult(Parameter... parameters) throws Exception {
		return dao.consult(parameters);
	}

	@Override
	public void maintain(Model model) {
		viewMaintain.show(model, viewConsult);		
	}

	@Override
	public void exclude(Model model) throws Exception {
		dao.exclude(model);
		viewMaintain.close();
		viewConsult.consult();		
	}

	@Override
	public void save(Model model) throws Exception {
		dao.save(model);
		viewMaintain.close();
		viewConsult.consult();
	}

	public static void main(String[] args) {
		new ControllerData(null);
	}
}
