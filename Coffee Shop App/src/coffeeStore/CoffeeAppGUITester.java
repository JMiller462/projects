package coffeeStore;

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
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;

public class CoffeeAppGUITester extends JFrame {

	private JLayeredPane layerstart;
	private JTextField welcomeT;
	private JButton order;
	private JButton display;
	private JPanel menu;
	private JTextField txtBytebucksMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoffeeAppGUITester frame = new CoffeeAppGUITester();
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
	public CoffeeAppGUITester() {
		setTitle("Bytebucks Coffee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		layerstart = new JLayeredPane();
		layerstart.setBackground(new Color(255, 228, 196));
		layerstart.setBorder(null);

		setContentPane(layerstart);
		layerstart.setLayout(null);
		
		JPanel opening = new JPanel();
		opening.setBackground(new Color(255, 228, 196));
		opening.setBounds(0, 0, 886, 663);
		layerstart.add(opening);
		opening.setLayout(null);
		
		welcomeT = new JTextField();
		welcomeT.setBounds(21, 5, 786, 70);
		welcomeT.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeT.setEditable(false);
		opening.add(welcomeT);
		welcomeT.setForeground(new Color(160, 82, 45));
		welcomeT.setFont(new Font("Papyrus", Font.PLAIN, 40));
		welcomeT.setText("Welcome to ByteBucks Coffee");
		welcomeT.setColumns(30);
		welcomeT.setOpaque(false);
		
		order = new JButton("Order Coffee");
		order.setBounds(331, 242, 219, 47);
		opening.add(order);
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		order.setBorderPainted(false);
		order.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		order.setBackground(new Color(255, 228, 196));
		
		display = new JButton("View Orders");
		display.setBackground(new Color(255, 228, 196));
		display.setBounds(331, 320, 219, 47);
		opening.add(display);
		
		display.setBorderPainted(false);
		display.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		
		menu = new JPanel();
		layerstart.setLayer(menu, 1);
		menu.setBackground(new Color(255, 228, 196));
		menu.setBounds(0, 0, 886, 663);
		layerstart.add(menu);
		menu.setLayout(null);
		
		txtBytebucksMenu = new JTextField();
		txtBytebucksMenu.setHorizontalAlignment(SwingConstants.CENTER);
		txtBytebucksMenu.setFont(new Font("Papyrus", Font.PLAIN, 40));
		txtBytebucksMenu.setText("ByteBucks Menu");
		txtBytebucksMenu.setEditable(false);
		txtBytebucksMenu.setBounds(153, 10, 490, 62);
		menu.add(txtBytebucksMenu);
		txtBytebucksMenu.setColumns(10);
	
	}
}
