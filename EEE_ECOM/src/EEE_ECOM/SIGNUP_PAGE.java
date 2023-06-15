package EEE_ECOM;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;
public class SIGNUP_PAGE {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SIGNUP_PAGE window = new SIGNUP_PAGE();
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
	public SIGNUP_PAGE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.disabledForeground"));
		frame.setBounds(100, 100, 622, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(76, 80, 123, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("GENDER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(76, 147, 106, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SIGN UP PAGE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel_2.setBounds(153, 11, 211, 33);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DEPARTMENT");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(71, 209, 150, 28);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("FAV PROG LANG.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(73, 263, 171, 42);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb = new JTextField();
		tb.setBounds(256, 90, 129, 20);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("female");
		r1.setFont(new Font("Tahoma", Font.BOLD, 20));
		r1.setBounds(256, 147, 109, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("male");
		r2.setFont(new Font("Tahoma", Font.BOLD, 20));
		r2.setBounds(394, 147, 109, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.BOLD, 15));
		c1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "EEE", "ECE", "CSE", "IT", "MIN", "MECH"}));
		c1.setBounds(256, 216, 140, 22);
		frame.getContentPane().add(c1);
		
		JCheckBox cb1 = new JCheckBox("c");
		cb1.setFont(new Font("Tahoma", Font.BOLD, 20));
		cb1.setBounds(268, 272, 46, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb2 = new JCheckBox("PYTHON");
		cb2.setFont(new Font("Tahoma", Font.BOLD, 17));
		cb2.setBounds(316, 272, 97, 23);
		frame.getContentPane().add(cb2);
		
		JCheckBox cb3 = new JCheckBox("JAVA");
		cb3.setFont(new Font("Tahoma", Font.BOLD, 17));
		cb3.setBounds(415, 274, 77, 20);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb.getText();
				String g;
				if(r1.isSelected())
				{
					g="female";
				}
				else if(r2.isSelected())
				{
					g="male";
					
				}
				else
				{
					g="INVALID";
				}
				String b=(String) c1.getSelectedItem();
				String p;
				if(cb1.isSelected())
				
			{
					p="C";
						
				}
				else if(cb2.isSelected())
				{
					p="PYTHON";
				}
				else
				{
					p="JAVA";
				}
				JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+"\n gender :"+g+"\n Branch"+b+"\n programming"+p);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(179, 357, 217, 78);
		frame.getContentPane().add(btnNewButton);
	}
}
