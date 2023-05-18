package coffeeStore;

public class Espresso extends Coffee{

	public Espresso( String name, double price, String des, String size) {

	super(name, price, des, size);
}
	public String prepare() {
		String prep = "";
		if(getSize().equals("Large")) {
			 prep = "Grounding freshly roasted coffee beans... \n" +
					" Preparing Espresso with grounded beans via machine...\n"+
					"Adding 2 shots of Espresso.../n"+
					"Adding signature ByteBucks Cream...";
			
		}
		else {
		 prep = "Grounding freshly roasted coffee beans... \n" +
				" Preparing Espresso with grounded beans via machine...\n"+
				"Adding 1 shot of Espresso.../n"+
				"Adding signature ByteBucks Cream...";
		}
	return prep;
	}
}
