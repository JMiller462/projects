package hw4;

import java.util.ArrayList;

public abstract class Customer {
String name;
String phoneNumber;
String address;
double priceTotal;
ArrayList <Coffee> orders;
public Customer(String name, String phoneNumber, String address, double total, ArrayList<Coffee> orders) {
	this.name = name;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.priceTotal = total;
	this.orders = orders;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public double getPriceTotal() {
	return priceTotal;
}
public void setPriceTotal(double priceTotal) {
	this.priceTotal = priceTotal;
}
public ArrayList<Coffee> getOrders() {
	return orders;
}
public void setOrders(ArrayList<Coffee> orders) {
	this.orders = orders;
}
public void addupTotal() {
	double sum = 0;
	for(Coffee coffee: this.orders){
		sum += sum + coffee.getPrice();
	
	}
	setPriceTotal(sum);
}
public abstract String toString();

}

