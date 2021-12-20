package view;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;

import controller.ControllerData;

public class ViewMainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMainWindow window = new ViewMainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewMainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(ViewMainWindow.class.getResource("/resources/terra.png")));

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu menuSystem = new JMenu("System");
		menuBar.add(menuSystem);

		JMenuItem menuItemConsultData = new JMenuItem("Consult data ...");
		menuItemConsultData.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ControllerData(frame);
			}
		});

		menuItemConsultData.setIcon(new ImageIcon(ViewMainWindow.class.getResource("/resources/loupe.png")));
		//menuItemConsultData.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
		menuSystem.add(menuItemConsultData);

		JSeparator separator = new JSeparator();
		menuSystem.add(separator);

		JMenuItem menuItemClose = new JMenuItem("Close");
		menuItemClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		menuItemClose.setIcon(new ImageIcon(ViewMainWindow.class.getResource("/resources/cancel.png")));
		menuItemClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		menuSystem.add(menuItemClose);
	}
}
