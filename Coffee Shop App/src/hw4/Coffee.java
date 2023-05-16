package hw4;

public abstract class Coffee {
private double price;
private String name;
private String description;
private String size;
public Coffee(String name, double price, String des, String size) {
	this.name = name;
	this.price = price;
	this.description = des;
	this.size = size;
	
}

public String getSize() {
	return size;
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

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

}

