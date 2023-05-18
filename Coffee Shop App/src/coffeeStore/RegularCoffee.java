package coffeeStore;

public class RegularCoffee extends Coffee {

public RegularCoffee(String name , double price, String des, String size) {
	super(name, price, des, size);
}


public String prepare() {
	String prep = "Grounding freshly roasted coffee beans...\n" +
				" Brewing grounded beans with hot water...\n " +
				" Adding signature ByteBucks Cream...";
	return prep;
}
}
