package controller;

import java.util.ArrayList;

import model.Model;
import utils.Parameter;

public interface Controller {
	public ArrayList<Model> consult(Parameter... parameters) throws Exception;
	public void maintain(Model model);
	public void exclude(Model model) throws Exception;
	public void save(Model model) throws Exception;
}
