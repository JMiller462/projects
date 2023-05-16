package hw4;

import java.util.ArrayList;

public class RegularCustomer extends Customer {
	public RegularCustomer(String name, String phoneNumber, String address, int pricetotal, ArrayList<Coffee> orders) {
		super(name, phoneNumber, address, pricetotal, orders);
	}

public String toString() {
	ArrayList <String> strOrders = new ArrayList();
	int numReg = 0;
	int numesp = 0;
	int numlat = 0;
	int numMoc = 0;
	int numCap = 0;
	int total = 0;
	
	for(Coffee coffee :this.orders) {
		if(coffee instanceof RegularCoffee) {
			numReg ++;
		}
		else if( coffee instanceof Espresso) {
			numesp ++;
		}
		else if(coffee instanceof Latte) {
			numlat++;
		}
		else if(coffee instanceof Mocha) {
			numMoc++;
		}
		else if(coffee instanceof Cappuccino) {
			numCap++;
		}
	}
	if(numReg > 0) {
		strOrders.add(numReg + "x Regular Brewed Coffee" );
	}
	if(numesp > 0) {
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
	return "Type: Regular Customer, Name: " + getName() + ", Phone Number: " + getPhoneNumber() + ", Order Price Total: " + getPriceTotal() + ", Number of Orders: " + total + ", \nOrders Made: " + strOrders;
}

}
