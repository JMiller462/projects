package coffeeStore;

public class Mocha extends Coffee {
	private static int smallmochCount = 0;
	private static int medmochCount = 0;
	private static int largemochCount = 0;
	public Mocha(String name, double price, String size) {
		super(name, price, size);
		if(this.getSize().equals("Small")) {
			smallmochCount ++;
		}
		if(this.getSize().equals("Medium")) {
			medmochCount ++;
		}
		if(this.getSize().equals("Large")) {
			largemochCount ++;
		}
	}
	public static int getMochSmallCount() {
		return smallmochCount;
	}
	public static void setMochSmallCount(int mochCount) {
		Mocha.smallmochCount = mochCount;
	}
	
	public static int getMedmochCount() {
		return medmochCount;
	}
	public static void setMedmochCount(int medmochCount) {
		Mocha.medmochCount = medmochCount;
	}
	public static int getLargemochCount() {
		return largemochCount;
	}
	public static void setLargemochCount(int largemochCount) {
		Mocha.largemochCount = largemochCount;
	}
	public String prepare(){ 
		String prep = "";
		if(getSize().equals("Large")) {
			 prep = "Grounding freshly roasted coffee beans... \n"+
					" Preparing Espresso with grounded beans via machine...\n"+
					 "Preparing foamed/steamed milk via steaming...\n"+ 
					"Adding 2 shots of espresso.../n"+
					 "Adding more foamed/steamed milk than espresso.../n"+ 
					"Adding signature ByteBucks Cream...";
			
		}
		else {
		 prep = "Grounding freshly roasted coffee beans... \n" +
					" Preparing Espresso with grounded beans via machine...\n"+
					 "Preparing foamed/steamed milk via steaming...\n" + 
					"Adding 1 shot of espresso.../n"+
					 "Adding more foamed/steamed milk than espresso.../n" + 
					"Adding signature ByteBucks Cream...";
			
		}
	return prep;
	}
}

