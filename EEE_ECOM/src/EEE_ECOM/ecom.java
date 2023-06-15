package EEE_ECOM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ecom {

	private JFrame frame;
	int i=0;
	int b=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecom window = new ecom();
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
	public ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 834, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("AMAZON");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(136, 21, 87, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\AD.jpg"));
		lblNewLabel_1.setBounds(8, 49, 215, 273);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\AD1.jpg"));
		lblNewLabel_2.setBounds(235, 37, 250, 279);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\online\\Downloads\\AD2.jpg"));
		lblNewLabel_3.setBounds(495, 49, 262, 273);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS 100");
		lblNewLabel_4.setForeground(Color.MAGENTA);
		lblNewLabel_4.setBounds(88, 321, 71, 27);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS 200");
		lblNewLabel_5.setForeground(Color.MAGENTA);
		lblNewLabel_5.setBounds(342, 327, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("RS 300");
		lblNewLabel_6.setForeground(Color.MAGENTA);
		lblNewLabel_6.setBounds(613, 333, 46, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "book1", "book2", "book3"}));
		comboBox.setBounds(57, 346, 126, 22);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "book1", "book2", "book3"}));
		comboBox_1.setBounds(291, 352, 126, 22);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "book1", "book2", "book3"}));
		comboBox_2.setBounds(546, 358, 126, 22);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lb = new JLabel("CART:0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 15));
		lb.setBounds(710, 0, 71, 30);
		frame.getContentPane().add(lb);
		JLabel lb2 = new JLabel("TOTAL PRICE :0");
		lb2.setFo710, 25, 71"Tahoma", Font.BOLD, 15));
		lb2.setBounds(613, 21, 168, 25);
		frame.getContentPane().add(lb2);
		
		JButton btnNewButton = new JButton("ADD TO CART");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
				b=b+100;
				lb2.setText("Bill : "+b);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(57, 379, 126, 27);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD TO CART");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(291, 381, 126, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ADD TO CART");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("CART : "+i);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(546, 391, 126, 23);
		frame.getContentPanebill : Button_2);
		
		JLabel lb2 = new JLabel("TOTAL PRICE :0");
		lb2.setFo710, 25, 71"Tahoma", Font.BOLD, 15));
		lb2.setBounds(613, 21, 168, 25);
		frame.getContentPane().add(lb2);
	}
}
