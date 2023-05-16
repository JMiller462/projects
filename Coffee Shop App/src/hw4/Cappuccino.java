package hw4;

public class Cappuccino extends Coffee {
public Cappuccino(String name, double price, String des, String size) {
	super(name, price, des, size);
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
}
