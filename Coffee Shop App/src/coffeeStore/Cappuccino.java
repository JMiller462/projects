package coffeeStore;

public class Cappuccino extends Coffee {
private static int smallcapCount = 0;
private static int medcapCount = 0;
private static int largecapCount = 0;
public Cappuccino(String name, double price, String size) {
	super(name, price, size);
	if(this.getSize().equals("Small")) {
		smallcapCount ++;
	}
	if(this.getSize().equals("Medium")) {
		medcapCount ++;
	}
	if(this.getSize().equals("Large")) {
		largecapCount ++;
	}
}
public static int getSmallCapCount() {
	return smallcapCount;
}
public static void setSmallCapCount(int capCount) {
	Cappuccino.smallcapCount = capCount;
}
public String prepare(){ 
	String prep = "";
	if(getSize().equals("Large")) {
		 prep = "Grounding freshly roasted coffee beans... \n" +
				" Preparing Espresso with grounded beans via machine...\n"+
				 "Preparing foamed/steamed milk via steaming...\n" + 
				"Adding 2 shots of espresso.../n"+
				 "Adding foamed/steamed milk equal to espresso.../n" + 
				"Adding signature ByteBucks Cream...";
		
	}
	else {
	 prep = "Grounding freshly roasted coffee beans... \n" +
				" Preparing Espresso with grounded beans via machine...\n"+
				 "Preparing foamed/steamed milk via steaming...\n" + 
				"Adding 1 shot of espresso.../n"+
				 "Adding foamed/steamed milk equal to espresso.../n" + 
				"Adding signature ByteBucks Cream...";
		
	}
return prep;
}
public static int getMedcapCount() {
	return medcapCount;
}
public static void setMedcapCount(int medcapCount) {
	Cappuccino.medcapCount = medcapCount;
}
public static int getLargecapCount() {
	return largecapCount;
}
public static void setLargecapCount(int largecapCount) {
	Cappuccino.largecapCount = largecapCount;
}
}
