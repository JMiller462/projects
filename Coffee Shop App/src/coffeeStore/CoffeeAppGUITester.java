package coffeeStore;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JList;

public class CoffeeAppGUITester extends JFrame {

	private static JLayeredPane layerstart;
	private JTextField welcomeT;
	private JButton order;
	private JButton display;
	private JPanel menu;
	private JPanel opening;
	private JTextField txtBytebucksMenu;
	private JTextField txtRegularBrewedCoffee;
	private JTextField txtEspresso;
	private JTextField priceSmallBCof;
	private JTextField priceMedBCof;
	private JTextField priceLargeBCof;
	private JTextField priceSmallEsp;
	private JTextField priceMediumEsp;
	private JTextField priceLargeEsp;
	private JSpinner numMedEsp;
	private JSpinner numLargeEsp;
	private JTextField txtCappuccino;
	private JTextField priceSmallCap;
	private JTextField priceMedCap;
	private JTextField priceLargeCap;
	private JTextField txtLatte;
	private JTextField priceSmallLatte;
	private JTextField priceMedLatte;
	private JTextField priceLargeLatte;
	private JTextField txtMocha;
	private JTextField priceSmallMocha;
	private JTextField priceMediumMocha;
	private JTextField priceLargeMocha;

	/**
	 * Application Launch
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
	 * Jframe creation.
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
		
	
		opening = new JPanel();
		layerstart.add(opening);
		layerstart.setLayer(opening, 1);
		opening.setBackground(new Color(255, 228, 196));
		opening.setBounds(0, 0, 886, 663);
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
		order.setBorderPainted(false);
		order.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		order.setBackground(new Color(255, 228, 196));
		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			bringToFront(menu);
			System.out.println("Opening Layer:" + layerstart.getLayer(opening) + "\n Menu Layer" + layerstart.getLayer(menu));
			}
		});
		
		display = new JButton("View Orders");
		display.setBackground(new Color(255, 228, 196));
		display.setBounds(331, 320, 219, 47);
		opening.add(display);
		
		display.setBorderPainted(false);
		display.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 28));
		
		menu = new JPanel();
		layerstart.add(menu);
		layerstart.setLayer(menu, 0);
		menu.setBackground(new Color(255, 228, 196));
		menu.setBounds(0, 0, 886, 663);
		menu.setLayout(null);
		
		
		txtBytebucksMenu = new JTextField();
		txtBytebucksMenu.setBackground(new Color(255, 228, 196));
		txtBytebucksMenu.setForeground(new Color(160, 82, 45));
		txtBytebucksMenu.setHorizontalAlignment(SwingConstants.CENTER);
		txtBytebucksMenu.setFont(new Font("Papyrus", Font.PLAIN, 40));
		txtBytebucksMenu.setText("ByteBucks Menu");
		txtBytebucksMenu.setEditable(false);
		txtBytebucksMenu.setBounds(153, 10, 490, 62);
		menu.add(txtBytebucksMenu);
		txtBytebucksMenu.setColumns(10);
		
		txtRegularBrewedCoffee = new JTextField();
		txtRegularBrewedCoffee.setFont(new Font("Papyrus", Font.PLAIN, 20));
		txtRegularBrewedCoffee.setText("Regular Brewed Coffee");
		txtRegularBrewedCoffee.setHorizontalAlignment(SwingConstants.CENTER);
		txtRegularBrewedCoffee.setBounds(0, 140, 233, 54);
		menu.add(txtRegularBrewedCoffee);
		txtRegularBrewedCoffee.setColumns(10);
		
		JTextArea brCofdes = new JTextArea();
		brCofdes.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		brCofdes.setText("The by-the-numbers cup of brewed joe \r\nthat will always start your days strong. \r\n(No espresso)");
		brCofdes.setBounds(0, 195, 207, 62);
		menu.add(brCofdes);
		
		txtEspresso = new JTextField();
		txtEspresso.setFont(new Font("Papyrus", Font.PLAIN, 20));
		txtEspresso.setText("Espresso");
		txtEspresso.setHorizontalAlignment(SwingConstants.CENTER);
		txtEspresso.setBounds(276, 144, 177, 46);
		menu.add(txtEspresso);
		txtEspresso.setColumns(10);
		
		JTextArea txtrThePerfectEspresso = new JTextArea();
		txtrThePerfectEspresso.setText("The perfect espresso to give you \r\nrejuvenating energy without fail.");
		txtrThePerfectEspresso.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		txtrThePerfectEspresso.setBounds(279, 195, 174, 54);
		menu.add(txtrThePerfectEspresso);
		
		SpinnerNumberModel smBCval = new SpinnerNumberModel(0, 0,10000, 1);
		JSpinner numSmallBCof = new JSpinner(smBCval);
		numSmallBCof.setBounds(188, 267, 45, 24);
		menu.add(numSmallBCof);
		
		priceSmallBCof = new JTextField();
		priceSmallBCof.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceSmallBCof.setText("Small Brewed Coffee - $2.00");
		priceSmallBCof.setBounds(0, 267, 173, 24);
		menu.add(priceSmallBCof);
		priceSmallBCof.setColumns(10);
		
		priceMedBCof = new JTextField();
		priceMedBCof.setText("Medium Brewed Coffee - $2.75");
		priceMedBCof.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceMedBCof.setColumns(10);
		priceMedBCof.setBounds(0, 301, 173, 24);
		menu.add(priceMedBCof);
		
		JSpinner numMedBCof = new JSpinner();
		numMedBCof.setBounds(188, 301, 45, 24);
		menu.add(numMedBCof);
		
		priceLargeBCof = new JTextField();
		priceLargeBCof.setText("Large Brewed Coffee - $3.25");
		priceLargeBCof.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceLargeBCof.setColumns(10);
		priceLargeBCof.setBounds(0, 338, 173, 24);
		menu.add(priceLargeBCof);
		
		JSpinner numLargeBcof = new JSpinner();
		numLargeBcof.setBounds(188, 335, 45, 24);
		menu.add(numLargeBcof);
		
		priceSmallEsp = new JTextField();
		priceSmallEsp.setText("Small Espresso- $2:25 ");
		priceSmallEsp.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceSmallEsp.setColumns(10);
		priceSmallEsp.setBounds(276, 259, 173, 24);
		menu.add(priceSmallEsp);
		
		priceMediumEsp = new JTextField();
		priceMediumEsp.setText("Medium Espresso-$3.00\r\n");
		priceMediumEsp.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceMediumEsp.setColumns(10);
		priceMediumEsp.setBounds(276, 301, 173, 24);
		menu.add(priceMediumEsp);
		
		priceLargeEsp = new JTextField();
		priceLargeEsp.setText("Large Espresso -$3.50");
		priceLargeEsp.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceLargeEsp.setColumns(10);
		priceLargeEsp.setBounds(276, 338, 173, 24);
		menu.add(priceLargeEsp);
		
		JSpinner numSmallEsp = new JSpinner();
		numSmallEsp.setBounds(459, 262, 30, 20);
		menu.add(numSmallEsp);
		
		numMedEsp = new JSpinner();
		numMedEsp.setBounds(459, 304, 30, 20);
		menu.add(numMedEsp);
		
		numLargeEsp = new JSpinner();
		numLargeEsp.setBounds(459, 338, 30, 20);
		menu.add(numLargeEsp);
		
		txtCappuccino = new JTextField();
		txtCappuccino.setText("Cappuccino");
		txtCappuccino.setFont(new Font("Papyrus", Font.PLAIN, 20));
		txtCappuccino.setBounds(555, 145, 150, 45);
		menu.add(txtCappuccino);
		txtCappuccino.setColumns(10);
		
		JTextArea txtrReachYourInner = new JTextArea();
		txtrReachYourInner.setText("Reach your inner yin and yang with a\r\n balanced milk and espresso coffee\r\n drink that soothes your soul into a creamy bliss. \r\n(Contains lactose.) ");
		txtrReachYourInner.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		txtrReachYourInner.setBounds(555, 195, 249, 64);
		menu.add(txtrReachYourInner);
		
		priceSmallCap = new JTextField();
		priceSmallCap.setText("Small Cappuccino - $2,50");
		priceSmallCap.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceSmallCap.setColumns(10);
		priceSmallCap.setBounds(555, 267, 173, 23);
		menu.add(priceSmallCap);
		
		JSpinner numSmallCap = new JSpinner();
		numSmallCap.setBounds(738, 268, 30, 22);
		menu.add(numSmallCap);
		
		priceMedCap = new JTextField();
		priceMedCap.setText("Medium Cappuccino - $3.25");
		priceMedCap.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceMedCap.setColumns(10);
		priceMedCap.setBounds(555, 302, 173, 23);
		menu.add(priceMedCap);
		
		JSpinner numMedCap = new JSpinner();
		numMedCap.setBounds(738, 303, 30, 22);
		menu.add(numMedCap);
		
		priceLargeCap = new JTextField();
		priceLargeCap.setText("Large Cappuccino - $3.75");
		priceLargeCap.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceLargeCap.setColumns(10);
		priceLargeCap.setBounds(555, 338, 173, 23);
		menu.add(priceLargeCap);
		
		JSpinner numLargeCap = new JSpinner();
		numLargeCap.setBounds(738, 338, 30, 22);
		menu.add(numLargeCap);
		
		txtLatte = new JTextField();
		txtLatte.setText("Latte\r\n");
		txtLatte.setHorizontalAlignment(SwingConstants.CENTER);
		txtLatte.setFont(new Font("Papyrus", Font.PLAIN, 20));
		txtLatte.setColumns(10);
		txtLatte.setBounds(0, 387, 142, 45);
		menu.add(txtLatte);
		
		JTextArea txtrTakeSeatAnd = new JTextArea();
		txtrTakeSeatAnd.setText("Take seat and relax with this milky suprise of a\r\ndrink that will make your tastebuds happy. \r\n(Contains lactose.) \r\n");
		txtrTakeSeatAnd.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		txtrTakeSeatAnd.setBounds(0, 434, 233, 62);
		menu.add(txtrTakeSeatAnd);
		
		priceSmallLatte = new JTextField();
		priceSmallLatte.setText("Small Latte $2.50");
		priceSmallLatte.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceSmallLatte.setColumns(10);
		priceSmallLatte.setBounds(0, 506, 173, 24);
		menu.add(priceSmallLatte);
		
		priceMedLatte = new JTextField();
		priceMedLatte.setText("Medium Latte - $3.25");
		priceMedLatte.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceMedLatte.setColumns(10);
		priceMedLatte.setBounds(0, 542, 173, 24);
		menu.add(priceMedLatte);
		
		priceLargeLatte = new JTextField();
		priceLargeLatte.setText("Small Latte - $3.75\r\n");
		priceLargeLatte.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceLargeLatte.setColumns(10);
		priceLargeLatte.setBounds(0, 576, 173, 24);
		menu.add(priceLargeLatte);
		
		JSpinner numSmallLat = new JSpinner();
		numSmallLat.setBounds(188, 509, 30, 22);
		menu.add(numSmallLat);
		
		JSpinner numMedLat = new JSpinner();
		numMedLat.setBounds(188, 545, 30, 22);
		menu.add(numMedLat);
		
		JSpinner numLargeLat = new JSpinner();
		numLargeLat.setBounds(188, 579, 30, 22);
		menu.add(numLargeLat);
		
		txtMocha = new JTextField();
		txtMocha.setText("Mocha");
		txtMocha.setHorizontalAlignment(SwingConstants.CENTER);
		txtMocha.setFont(new Font("Papyrus", Font.PLAIN, 20));
		txtMocha.setColumns(10);
		txtMocha.setBounds(276, 387, 142, 45);
		menu.add(txtMocha);
		
		JList list = new JList();
		list.setBounds(99, 219, 1, 1);
		menu.add(list);
		
		JTextArea txtrFulfillYourSweet = new JTextArea();
		txtrFulfillYourSweet.setText("Fulfill your sweet tooth with this chocolate based coffee drink. \r\n(Contains chocolate.) (Contains lactose.) ");
		txtrFulfillYourSweet.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 11));
		txtrFulfillYourSweet.setBounds(276, 432, 207, 62);
		menu.add(txtrFulfillYourSweet);
		
		priceSmallMocha = new JTextField();
		priceSmallMocha.setText("Small Mocha - $2.75\n");
		priceSmallMocha.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceSmallMocha.setColumns(10);
		priceSmallMocha.setBounds(276, 509, 177, 24);
		menu.add(priceSmallMocha);
		
		priceMediumMocha = new JTextField();
		priceMediumMocha.setText("Medium Mocha - $3.50");
		priceMediumMocha.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceMediumMocha.setColumns(10);
		priceMediumMocha.setBounds(276, 545, 173, 24);
		menu.add(priceMediumMocha);
		
		priceLargeMocha = new JTextField();
		priceLargeMocha.setText("Large Mocha - $4.00");
		priceLargeMocha.setFont(new Font("Microsoft YaHei UI Light", Font.PLAIN, 10));
		priceLargeMocha.setColumns(10);
		priceLargeMocha.setBounds(276, 579, 173, 24);
		menu.add(priceLargeMocha);
		
		JSpinner numSmallMocha = new JSpinner();
		numSmallMocha.setBounds(459, 509, 30, 22);
		menu.add(numSmallMocha);
		
		JSpinner numMediumMocha = new JSpinner();
		numMediumMocha.setBounds(459, 545, 30, 22);
		menu.add(numMediumMocha);
		
		JSpinner numLargeMocha = new JSpinner();
		numLargeMocha.setBounds(459, 579, 30, 22);
		menu.add(numLargeMocha);
		
		JButton finishOrd = new JButton("Finish");
		finishOrd.setFont(new Font("Papyrus", Font.BOLD | Font.ITALIC, 40));
		finishOrd.setBounds(611, 542, 233, 84);
		menu.add(finishOrd);
		System.out.println("Opening Layer:" + layerstart.getLayer(opening) + "\n Menu Layer" + layerstart.getLayer(menu));	
		
	}
	public static void bringToFront(JPanel panel) {
		int topIndex = layerstart.getComponentCount() - 1;
		Component[] componentsInLayer = layerstart.getComponentsInLayer(topIndex);
		JPanel top = (JPanel) layerstart.getComponent(topIndex);
		layerstart.setLayer( top, layerstart.getLayer(panel));
		layerstart.setLayer(panel, topIndex);
		layerstart.repaint();
	}
}
