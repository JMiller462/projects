package coffeeStore;

public abstract class Coffee {
private double price;
private String name;
private static int cofCount = 0;
private String size;
public Coffee(String name, double price, String size) {
	cofCount ++;
	this.name = name;
	this.price = price;
	this.size = size;
	
}

public String getSize() {
	return size;
}

public static int getCofCount() {
	return cofCount;
}

public static void setCofCount(int cofCount) {
	Coffee.cofCount = cofCount;
}

public void setSize(String size) {
	this.size = size;
}

public abstract String prepare();

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}


public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}

