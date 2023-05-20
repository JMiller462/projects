package coffeeStore;

import java.util.ArrayList;

public class PremiumCustomer extends Customer {

	public PremiumCustomer(String name, String phoneNumber, String address, double pricetotal, ArrayList<Coffee> orders) {
		super(name, phoneNumber, address, pricetotal, orders);
		
	}
	public void tenpercentdiscount() {
		double dis = getPriceTotal() * .10;
		setPriceTotal(getPriceTotal() - dis);
	}
	public String toString() {
		
		ArrayList <String> strOrders = new ArrayList<>();
		
		if(RegularCoffee.getCofSmallCount() > 0) {
			strOrders.add(RegularCoffee.getCofSmallCount() + "x Small  Brewed Coffee" );
		}
		if(RegularCoffee.getMedcofCount() > 0) {
			strOrders.add(RegularCoffee.getMedcofCount() + "x Medium Brewed Coffee" );
		}
		if(RegularCoffee.getLargecofCount() > 0) {
			strOrders.add(RegularCoffee.getLargecofCount() + "x Large Brewed Coffee" );
		}
		if(Espresso.getEspSmallCount() > 0) {
			strOrders.add(Espresso.getEspSmallCount() + "x Small Espresso" );
		}
		if(Espresso.getMedespCount() > 0) {
			strOrders.add(Espresso.getMedespCount() + "x Medium Espresso" );
		}
		if(Espresso.getLargeespCount() > 0) {
			strOrders.add(Espresso.getLargeespCount() + "x Large Espresso" );
		}
		
		if(Cappuccino.getSmallCapCount() > 0) {
			strOrders.add(Cappuccino.getSmallCapCount() + "x Small Cappuccino" );
		}
		if(Cappuccino.getMedcapCount() > 0) {
			strOrders.add(Cappuccino.getMedcapCount() + "x Medium Cappuccino" );
		}
		if(Cappuccino.getLargecapCount() > 0) {
			strOrders.add(Cappuccino.getLargecapCount() + "x Large Cappuccino" );
		}
		
		if(Latte.getsmallLatCount() > 0) {
			strOrders.add(Latte.getsmallLatCount() + "x Small Latte" );
		}
		if(Latte.getMedlatCount() > 0) {
			strOrders.add(Latte.getMedlatCount() + "x Medium Latte" );
		}
		if(Latte.getLargelatCount() > 0) {
			strOrders.add(Latte.getLargelatCount() + "x Large Latte" );
		}
		if(Mocha.getMochSmallCount() > 0) {
			strOrders.add(Mocha.getMochSmallCount() + "x Small Mocha" );
		}
		if(Mocha.getMedmochCount() > 0) {
			strOrders.add(Mocha.getMedmochCount() + "x Medium Mocha" );
		}
		if(Mocha.getLargemochCount() > 0) {
			strOrders.add(Mocha.getLargemochCount()+ "x Large Mocha" );
		}
		return "Type: Regular Customer, Name: " + getName() + ", Phone Number: " + getPhoneNumber() + ", Order Price Total: " + getPriceTotal() + ", Number of Orders: " + orders.size() + ", /nOrders Made: " + strOrders;
	}

}


