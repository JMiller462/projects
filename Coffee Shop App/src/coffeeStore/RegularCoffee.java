package coffeeStore;

public class RegularCoffee extends Coffee {
private static int smallcofCount = 0;
private static int medcofCount = 0;
private static int largecofCount = 0;
public RegularCoffee(String name , double price, String size) {
	super(name, price, size);
	if(this.getSize().equals("Small")) {
		smallcofCount ++;
	}
	if(this.getSize().equals("Medium")) {
		medcofCount ++;
	}
	if(this.getSize().equals("Large")) {
		largecofCount ++;
	}
}


public static int getCofSmallCount() {
	return smallcofCount;
}


public static void setCofSmallCount(int cofCount) {
	RegularCoffee.smallcofCount = cofCount;
}


public static int getMedcofCount() {
	return medcofCount;
}


public static void setMedcofCount(int medcofCount) {
	RegularCoffee.medcofCount = medcofCount;
}


public static int getLargecofCount() {
	return largecofCount;
}


public static void setLargecofCount(int largecofCount) {
	RegularCoffee.largecofCount = largecofCount;
}


public String prepare() {
	String prep = "Grounding freshly roasted coffee beans...\n" +
				" Brewing grounded beans with hot water...\n " +
				" Adding signature ByteBucks Cream...";
	return prep;
}
}
