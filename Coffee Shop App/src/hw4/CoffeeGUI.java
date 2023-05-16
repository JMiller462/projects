package hw4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoffeeGUI extends JFrame {

	private JPanel opening;
	private JTextField welcomeT;
	private JButton order;
	private JButton display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoffeeGUI frame = new CoffeeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CoffeeGUI() {
		setTitle("Bytebucks Coffee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		opening = new JPanel();
		opening.setBackground(new Color(255, 228, 196));
		opening.setBorder(null);

		setContentPane(opening);
		opening.setLayout(null);
		
		welcomeT = new JTextField();
		welcomeT.setForeground(new Color(160, 82, 45));
		welcomeT.setFont(new Font("Papyrus", Font.PLAIN, 40));
		welcomeT.setText("Welcome to ByteBucks Coffee");
		welcomeT.setEditable(false);
		welcomeT.setBounds(178, 10, 579, 69);
		opening.add(welcomeT);
		welcomeT.setColumns(10);
		welcomeT.setOpaque(false);
		
		order = new JButton("Order Coffee");
		order.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		order.setBackground(new Color(255, 228, 196));
		order.setBounds(360, 284, 230, 60);
		opening.add(order);
		
		display = new JButton("View Orders");
		display.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		display.setBounds(360, 385, 219, 47);
		opening.add(display);
	}
}
