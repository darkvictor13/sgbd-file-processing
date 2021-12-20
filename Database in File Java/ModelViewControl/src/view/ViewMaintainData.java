package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import controller.Controller;
import model.Model;
import model.ModelData;
import singleton.SingletonLogger;

public class ViewMaintainData extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField fieldIdData;
	private JTextField fieldFirstName;
	private JTextField fieldLastName;
	private JTextField fieldRegistryDate;
	private JTextField fieldDocumentType;
	private JTextField fieldDocument;
	private JTextField fieldPhone;
	private JTextField fieldEmail;
	private JTextField fieldCity;
	private JButton buttonExclude;
	private Controller controller;
	private ModelData model;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ViewMaintainData dialog = new ViewMaintainData(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	/*public ViewMaintainData(Controller controller) {
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
	
	public ViewMaintainData(final Controller controller) {
		setTitle("Maintain data ...");
		//setIconImage(Toolkit.getDefaultToolkit().getImage(ViewManterPessoa.class.getResource("/resources/house.png")));
		this.controller = controller;

		setBounds(100, 100, 400, 350);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gridBagLayoutContentPanel = new GridBagLayout();
		gridBagLayoutContentPanel.columnWidths = new int[]{0, 41, 0, 0};
		gridBagLayoutContentPanel.rowHeights = new int[]{0, 0, 0};
		gridBagLayoutContentPanel.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayoutContentPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPanel.setLayout(gridBagLayoutContentPanel);

		// id
		
		JLabel labelIdData = new JLabel("Id:");
		GridBagConstraints gridBagConstraintsLabelIdData = new GridBagConstraints();
		gridBagConstraintsLabelIdData.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLabelIdData.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLabelIdData.insets = new Insets(0, 0, 5, 5);
		gridBagConstraintsLabelIdData.gridx = 0;
		gridBagConstraintsLabelIdData.gridy = 0;
		contentPanel.add(labelIdData, gridBagConstraintsLabelIdData);

		fieldIdData = new JTextField();
		fieldIdData.setText("1");
		fieldIdData.setHorizontalAlignment(SwingConstants.RIGHT);
		fieldIdData.setEditable(false);
		GridBagConstraints gridBagConstraintsFieldIdData = new GridBagConstraints();
		gridBagConstraintsFieldIdData.insets = new Insets(0, 0, 5, 5);
		gridBagConstraintsFieldIdData.fill = GridBagConstraints.BOTH;
		gridBagConstraintsFieldIdData.gridx = 1;
		gridBagConstraintsFieldIdData.gridy = 0;
		contentPanel.add(fieldIdData, gridBagConstraintsFieldIdData);
		fieldIdData.setColumns(7);
		
		// firstName

		JLabel labelFirstName = new JLabel("Nome:");
		GridBagConstraints gridBagConstraintsLabelFirstName = new GridBagConstraints();
		gridBagConstraintsLabelFirstName.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLabelFirstName.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsLabelFirstName.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLabelFirstName.gridx = 0;
		gridBagConstraintsLabelFirstName.gridy = 1;
		contentPanel.add(labelFirstName, gridBagConstraintsLabelFirstName);

		fieldFirstName = new JTextField();
		GridBagConstraints gridBagConstraintsFieldFirstName = new GridBagConstraints();
		gridBagConstraintsFieldFirstName.gridwidth = 2;
		gridBagConstraintsFieldFirstName.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsFieldFirstName.fill = GridBagConstraints.BOTH;
		gridBagConstraintsFieldFirstName.gridx = 1;
		gridBagConstraintsFieldFirstName.gridy = 1;
		contentPanel.add(fieldFirstName, gridBagConstraintsFieldFirstName);
		fieldFirstName.setColumns(10);

		// lastName
		
		JLabel labelLastName = new JLabel("Sobrenome:");
		GridBagConstraints gridBagConstraintsLabelLastName = new GridBagConstraints();
		gridBagConstraintsLabelLastName.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLabelLastName.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsLabelLastName.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLabelLastName.gridx = 0;
		gridBagConstraintsLabelLastName.gridy = 2;
		contentPanel.add(labelLastName, gridBagConstraintsLabelLastName);

		fieldLastName = new JTextField();
		GridBagConstraints gridBagConstraintsFieldLastName = new GridBagConstraints();
		gridBagConstraintsFieldLastName.gridwidth = 2;
		gridBagConstraintsFieldLastName.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsFieldLastName.fill = GridBagConstraints.BOTH;
		gridBagConstraintsFieldLastName.gridx = 1;
		gridBagConstraintsFieldLastName.gridy = 2;
		contentPanel.add(fieldLastName, gridBagConstraintsFieldLastName);
		fieldLastName.setColumns(10);

		// registryDate
		
		JLabel labelRegistryDate = new JLabel("Data de registro:");
		GridBagConstraints gridBagConstraintsLabelRegistryDate = new GridBagConstraints();
		gridBagConstraintsLabelRegistryDate.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLabelRegistryDate.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsLabelRegistryDate.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLabelRegistryDate.gridx = 0;
		gridBagConstraintsLabelRegistryDate.gridy = 3;
		contentPanel.add(labelRegistryDate, gridBagConstraintsLabelRegistryDate);

		fieldRegistryDate = new JTextField();
		GridBagConstraints gridBagConstraintsFieldRegistryDate = new GridBagConstraints();
		gridBagConstraintsFieldRegistryDate.gridwidth = 2;
		gridBagConstraintsFieldRegistryDate.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsFieldRegistryDate.fill = GridBagConstraints.BOTH;
		gridBagConstraintsFieldRegistryDate.gridx = 1;
		gridBagConstraintsFieldRegistryDate.gridy = 3;
		contentPanel.add(fieldRegistryDate, gridBagConstraintsFieldRegistryDate);
		fieldRegistryDate.setColumns(10);

		// documentType
		
		JLabel labelDocumentType = new JLabel("Tipo de dcoumento:");
		GridBagConstraints gridBagConstraintsLabelDocumentType = new GridBagConstraints();
		gridBagConstraintsLabelDocumentType.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLabelDocumentType.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsLabelDocumentType.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLabelDocumentType.gridx = 0;
		gridBagConstraintsLabelDocumentType.gridy = 4;
		contentPanel.add(labelDocumentType, gridBagConstraintsLabelDocumentType);

		fieldDocumentType = new JTextField();
		GridBagConstraints gridBagConstraintsFieldDocumentType = new GridBagConstraints();
		gridBagConstraintsFieldDocumentType.gridwidth = 2;
		gridBagConstraintsFieldDocumentType.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsFieldDocumentType.fill = GridBagConstraints.BOTH;
		gridBagConstraintsFieldDocumentType.gridx = 1;
		gridBagConstraintsFieldDocumentType.gridy = 4;
		contentPanel.add(fieldDocumentType, gridBagConstraintsFieldDocumentType);
		fieldDocumentType.setColumns(10);

		// document
		
		JLabel labelDocument = new JLabel("Documento:");
		GridBagConstraints gridBagConstraintsLabelDocument = new GridBagConstraints();
		gridBagConstraintsLabelDocument.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLabelDocument.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsLabelDocument.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLabelDocument.gridx = 0;
		gridBagConstraintsLabelDocument.gridy = 5;
		contentPanel.add(labelDocument, gridBagConstraintsLabelDocument);

		fieldDocument = new JTextField();
		GridBagConstraints gridBagConstraintsFieldDocument = new GridBagConstraints();
		gridBagConstraintsFieldDocument.gridwidth = 2;
		gridBagConstraintsFieldDocument.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsFieldDocument.fill = GridBagConstraints.BOTH;
		gridBagConstraintsFieldDocument.gridx = 1;
		gridBagConstraintsFieldDocument.gridy = 5;
		contentPanel.add(fieldDocument, gridBagConstraintsFieldDocument);
		fieldDocument.setColumns(10);

		// phone
		
		JLabel labelPhone = new JLabel("Telefono:");
		GridBagConstraints gridBagConstraintsLabelPhone = new GridBagConstraints();
		gridBagConstraintsLabelPhone.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLabelPhone.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsLabelPhone.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLabelPhone.gridx = 0;
		gridBagConstraintsLabelPhone.gridy = 6;
		contentPanel.add(labelPhone, gridBagConstraintsLabelPhone);

		fieldPhone = new JTextField();
		GridBagConstraints gridBagConstraintsFieldPhone = new GridBagConstraints();
		gridBagConstraintsFieldPhone.gridwidth = 2;
		gridBagConstraintsFieldPhone.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsFieldPhone.fill = GridBagConstraints.BOTH;
		gridBagConstraintsFieldPhone.gridx = 1;
		gridBagConstraintsFieldPhone.gridy = 6;
		contentPanel.add(fieldPhone, gridBagConstraintsFieldPhone);
		fieldPhone.setColumns(10);

		// email
		
		JLabel labelEmail = new JLabel("Email:");
		GridBagConstraints gridBagConstraintsLabelEmail = new GridBagConstraints();
		gridBagConstraintsLabelEmail.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLabelEmail.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsLabelEmail.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLabelEmail.gridx = 0;
		gridBagConstraintsLabelEmail.gridy = 7;
		contentPanel.add(labelEmail, gridBagConstraintsLabelEmail);

		fieldEmail = new JTextField();
		GridBagConstraints gridBagConstraintsFieldEmail = new GridBagConstraints();
		gridBagConstraintsFieldEmail.gridwidth = 2;
		gridBagConstraintsFieldEmail.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsFieldEmail.fill = GridBagConstraints.BOTH;
		gridBagConstraintsFieldEmail.gridx = 1;
		gridBagConstraintsFieldEmail.gridy = 7;
		contentPanel.add(fieldEmail, gridBagConstraintsFieldEmail);
		fieldEmail.setColumns(10);

		// city
		
		JLabel labelCity = new JLabel("Cidade:");
		GridBagConstraints gridBagConstraintsLabelCity = new GridBagConstraints();
		gridBagConstraintsLabelCity.fill = GridBagConstraints.VERTICAL;
		gridBagConstraintsLabelCity.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsLabelCity.anchor = GridBagConstraints.EAST;
		gridBagConstraintsLabelCity.gridx = 0;
		gridBagConstraintsLabelCity.gridy = 8;
		contentPanel.add(labelCity, gridBagConstraintsLabelCity);

		fieldCity = new JTextField();
		GridBagConstraints gridBagConstraintsFieldCity = new GridBagConstraints();
		gridBagConstraintsFieldCity.gridwidth = 2;
		gridBagConstraintsFieldCity.insets = new Insets(0, 0, 0, 5);
		gridBagConstraintsFieldCity.fill = GridBagConstraints.BOTH;
		gridBagConstraintsFieldCity.gridx = 1;
		gridBagConstraintsFieldCity.gridy = 8;
		contentPanel.add(fieldCity, gridBagConstraintsFieldCity);
		fieldCity.setColumns(10);

		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new BorderLayout(5, 5));

			buttonExclude = new JButton("Exclude");
			//buttonExclude.setIcon(new ImageIcon(ViewMaintainData.class.getResource("/resources/excluir.png")));
			buttonExclude.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					exclude();
				}
			});
			buttonPane.add(buttonExclude, BorderLayout.WEST);

			JPanel panel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setVgap(0);
			buttonPane.add(panel, BorderLayout.EAST);

			JButton buttonSave = new JButton("Save");
			//btnSalvar.setIcon(new ImageIcon(ViewMaintainData.class.getResource("/resources/gravar.png")));
			buttonSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ViewMaintainData.this.model.setFirstName(fieldFirstName.getText());
					ViewMaintainData.this.model.setLastName(fieldLastName.getText());
					ViewMaintainData.this.model.setRegistryDate(fieldRegistryDate.getText());
					ViewMaintainData.this.model.setDocumentType(fieldDocumentType.getText());
					ViewMaintainData.this.model.setDocument(fieldDocument.getText());
					ViewMaintainData.this.model.setPhone(fieldPhone.getText());
					ViewMaintainData.this.model.setEmail(fieldEmail.getText());
					ViewMaintainData.this.model.setCity(fieldCity.getText());
					try{
						controller.save(ViewMaintainData.this.model);
					}catch(Exception e) {
						JOptionPane.showMessageDialog( ViewMaintainData.this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
						SingletonLogger.getInstance().doLog(e.getMessage());
					}
				}
			});
			panel.add(buttonSave);
			JButton buttonClose = new JButton("Close");
			//btnFechar.setIcon(new ImageIcon(ViewMaintainData.class.getResource("/resources/fechar.png")));
			buttonClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
				}
			});
			panel.add(buttonClose);
		}
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	public void show(Model model, Component parent) {
		this.model = (ModelData)model;
		if(this.model.getIdData() == null) {
			this.fieldIdData.setText("");
			this.fieldFirstName.setText("");
			this.fieldLastName.setText("");
			this.fieldRegistryDate.setText("");
			this.fieldDocumentType.setText("");
			this.fieldDocument.setText("");
			this.fieldPhone.setText("");
			this.fieldEmail.setText("");
			this.fieldCity.setText("");
		}else{
			this.fieldIdData.setText(this.model.getIdData().toString());
			this.fieldFirstName.setText(this.model.getFirstName());
			this.fieldLastName.setText(this.model.getLastName());
			this.fieldRegistryDate.setText(this.model.getRegistryDate());
			this.fieldDocumentType.setText(this.model.getDocumentType());
			this.fieldDocument.setText(this.model.getDocument());
			this.fieldPhone.setText(this.model.getPhone());
			this.fieldEmail.setText(this.model.getEmail());
			this.fieldCity.setText(this.model.getCity());
		}
		buttonExclude.setEnabled( this.model.getIdData() != null);
		setLocationRelativeTo(parent);
		setVisible(true);
	}

	public void exclude() {
		try{			
			Object[] options = {"Confirm", "Cancel"}; 
			int selected = JOptionPane.showOptionDialog(this,"Do you really want to delete this record?","Exclude", 
			        JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
			 if(selected == 0)
				 controller.exclude(model);		
		}catch(Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			SingletonLogger.getInstance().doLog(e.getMessage());
		}
	}

	public void close(){
		setVisible(false);
	}
}
