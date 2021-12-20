package view.tableModel;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Model;
import model.ModelData;

public class TableModelData extends AbstractTableModel {
		private static final long serialVersionUID = 1L;
		private String headers[] = { "Id", "Nome", "Sobrenome",
				"Data de registro", "Tipo de documento", "Documento", 
				"Telefone", "Email", "Cidade"};
		
		private ArrayList<Model> array = new ArrayList<Model>();

		public void setArray(ArrayList<Model> array) {
			this.array = array;
			fireTableDataChanged();
		}

		public Model getModel(int row) {
			return this.array.get(row);
		}

		@Override
		public String getColumnName(int column) {
			return headers[column];
		}

		@Override
		public int getColumnCount() {
			return headers.length;
		}

		@Override
		public int getRowCount() {
			return array.size();
		}

		@Override
		public Object getValueAt(int row, int column) {
			ModelData data = (ModelData)array.get(row);
			switch (column) {
				case 0: return "<html><font color='red'>" + data.getIdData() + "</font></html>";
				case 1: return data.getFirstName();
				case 2: return data.getLastName();
				case 3: return data.getRegistryDate();
				case 4: return data.getDocumentType();
				case 5: return data.getDocument();
				case 6: return data.getPhone();
				case 7: return data.getEmail();
				case 8: return data.getCity();
			}
			return null;
		}
}
