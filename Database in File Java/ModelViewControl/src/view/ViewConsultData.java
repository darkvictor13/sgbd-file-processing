package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.Controller;
import model.Model;
import model.ModelData;
import singleton.SingletonLogger;
import utils.Parameter;
import view.tableModel.TableModelData;

public class ViewConsultData extends JDialog {

	//private final JPanel contentPanel = new JPanel();
	
	private static final long serialVersionUID = 1L;
	private JTextField fieldName;
	private JTable table;

	private Controller controller;
	private TableModelData tableModel;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ViewConsultData dialog = new ViewConsultData(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	/*public ViewConsultData(Controller controller) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}*/
	
	public ViewConsultData(final Controller controller) {
		setTitle("Consult data ...");
		//setIconImage(Toolkit.getDefaultToolkit().getImage(ViewConsultarPessoa.class.getResource("/resources/house.png")));
		this.controller = controller;
		setBounds(100, 100, 400, 350);
		{
			JPanel panelFilter = new JPanel();
			getContentPane().add(panelFilter, BorderLayout.NORTH);
			panelFilter.setLayout(new BorderLayout(0, 0));

			JPanel firstPanel = new JPanel();
			panelFilter.add(firstPanel, BorderLayout.CENTER);
			GridBagLayout gridBagLayoutPanel = new GridBagLayout();
			gridBagLayoutPanel.columnWidths = new int[]{0, 0, 0, 0, 0};
			gridBagLayoutPanel.rowHeights = new int[]{0, 0, 0, 0};
			gridBagLayoutPanel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
			gridBagLayoutPanel.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
			firstPanel.setLayout(gridBagLayoutPanel);

			Component verticalStrut = Box.createVerticalStrut(5);
			GridBagConstraints gridBagConstraintsVerticalStrut = new GridBagConstraints();
			gridBagConstraintsVerticalStrut.insets = new Insets(0, 0, 5, 5);
			gridBagConstraintsVerticalStrut.gridx = 1;
			gridBagConstraintsVerticalStrut.gridy = 0;
			firstPanel.add(verticalStrut, gridBagConstraintsVerticalStrut);

			Component horizontalStrut = Box.createHorizontalStrut(5);
			GridBagConstraints gridBagConstraintsHorizontalStrut = new GridBagConstraints();
			gridBagConstraintsHorizontalStrut.fill = GridBagConstraints.VERTICAL;
			gridBagConstraintsHorizontalStrut.insets = new Insets(0, 0, 5, 5);
			gridBagConstraintsHorizontalStrut.gridx = 0;
			gridBagConstraintsHorizontalStrut.gridy = 1;
			firstPanel.add(horizontalStrut, gridBagConstraintsHorizontalStrut);

			JLabel labelName = new JLabel("Name:");
			GridBagConstraints gridBagConstraintsLabelName = new GridBagConstraints();
			gridBagConstraintsLabelName.anchor = GridBagConstraints.EAST;
			gridBagConstraintsLabelName.insets = new Insets(0, 0, 5, 5);
			gridBagConstraintsLabelName.fill = GridBagConstraints.VERTICAL;
			gridBagConstraintsLabelName.gridx = 1;
			gridBagConstraintsLabelName.gridy = 1;
			firstPanel.add(labelName, gridBagConstraintsLabelName);

			fieldName = new JTextField();
			fieldName.setToolTipText("Insert a name");
			GridBagConstraints gridBagConstraintsFieldName = new GridBagConstraints();
			gridBagConstraintsFieldName.insets = new Insets(0, 0, 5, 5);
			gridBagConstraintsFieldName.fill = GridBagConstraints.BOTH;
			gridBagConstraintsFieldName.gridx = 2;
			gridBagConstraintsFieldName.gridy = 1;
			firstPanel.add(fieldName, gridBagConstraintsFieldName);
			fieldName.setColumns(10);

			Component horizontalStrut_1 = Box.createHorizontalStrut(5);
			GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
			gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 0);
			gbc_horizontalStrut_1.gridx = 3;
			gbc_horizontalStrut_1.gridy = 1;
			firstPanel.add(horizontalStrut_1, gbc_horizontalStrut_1);

			Component verticalStrut_1 = Box.createVerticalStrut(5);
			GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
			gbc_verticalStrut_1.insets = new Insets(0, 0, 0, 5);
			gbc_verticalStrut_1.gridx = 1;
			gbc_verticalStrut_1.gridy = 2;
			firstPanel.add(verticalStrut_1, gbc_verticalStrut_1);

			JPanel secondPanel = new JPanel();
			panelFilter.add(secondPanel, BorderLayout.EAST);
			secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.X_AXIS));

			JButton buttonConsult = new JButton("Consult");
			//btnConsultar.setIcon(new ImageIcon(ViewConsultarPessoa.class.getResource("/resources/procurar.png")));
			buttonConsult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					consult();
				}
			});
			secondPanel.add(buttonConsult);
		}

		JScrollPane scrollPane = new JScrollPane();
		getContentPane().add(scrollPane, BorderLayout.CENTER);

		tableModel = new TableModelData();
		table = new JTable(tableModel);
		table.getColumnModel().getColumn(0).setMaxWidth(100);
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount()==2) {
					Model model = tableModel.getModel(table.getSelectedRow());
					controller.maintain(model);
				}
			}
		});

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));

		JButton buttonClose = new JButton("Close");
		//btnFechar.setIcon(new ImageIcon(ViewConsultarPessoa.class.getResource("/resources/fechar.png")));
		buttonClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		panel.add(buttonClose, BorderLayout.EAST);

		JButton buttonInsert = new JButton("Insert");
		//btnInserir.setIcon(new ImageIcon(ViewConsultarPessoa.class.getResource("/resources/inserir.png")));
		buttonInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.maintain(new ModelData());
			}
		});
		panel.add(buttonInsert, BorderLayout.WEST);
	}
	
	public void show(Component parent) {
		try{
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setLocationRelativeTo(parent);
			setVisible(true);
		}catch(Exception e) {
			JOptionPane.showMessageDialog( this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			SingletonLogger.getInstance().doLog ( e.getMessage() );
		}
	}
	
	public void consult() {
		try{
			tableModel.setArray(controller.consult(new Parameter("studentFirstName", fieldName.getText())));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			SingletonLogger.getInstance().doLog (e.getMessage());
		}		
	}
}
