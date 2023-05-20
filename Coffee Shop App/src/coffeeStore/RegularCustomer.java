package coffeeStore;

import java.util.ArrayList;

public class RegularCustomer extends Customer {
	public RegularCustomer(String name, String phoneNumber, String address, int pricetotal, ArrayList<Coffee> orders) {
		super(name, phoneNumber, address, pricetotal, orders);
	}

public String toString() {
	ArrayList <String> strOrders = new ArrayList();
	
	for(Coffee coffee :this.orders) {
		
	if(RegularCoffee.getCofSmallCount() > 0) {
		strOrders.add(RegularCoffee.getCofSmallCount() + "x Regular Brewed Coffee" );
	}
	
	if(Espresso.getEspSmallCount() > 0) {
		strOrders.add(numesp + "x Espresso" );
	}
	if(numlat > 0) {
		strOrders.add(numlat + "x Latte" );
	}
	if(numMoc > 0) {
		strOrders.add(numMoc + "x Mocah" );
	}
	if(numCap > 0) {
		strOrders.add(numReg + "x Cappuccino " );
	}
	}
	return "Type: Regular Customer, Name: " + getName() + ", Phone Number: " + getPhoneNumber() + ", Order Price Total: " + getPriceTotal() + ", Number of Orders: " + total + ", \nOrders Made: " + strOrders;
}

}
