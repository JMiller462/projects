package coffeeStore;

public class Latte extends Coffee {
	private static int smalllatCount = 0;
	private static int medlatCount = 0;
	private static int largelatCount = 0;
	public Latte(String name, double price, String size) {
		super(name, price, size);
		if(this.getSize().equals("Small")) {
			smalllatCount ++;
		}
		if(this.getSize().equals("Medium")) {
			medlatCount ++;
		}
		if(this.getSize().equals("Large")) {
			largelatCount ++;
		}
	}
	public static int getLatCount() {
		return smalllatCount;
	}
	public static void setLatCount(int latCount) {
		Latte.smalllatCount = latCount;
	}
	
	public static int getMedlatCount() {
		return medlatCount;
	}
	public static void setMedlatCount(int medlatCount) {
		Latte.medlatCount = medlatCount;
	}
	public static int getLargelatCount() {
		return largelatCount;
	}
	public static void setLargelatCount(int largelatCount) {
		Latte.largelatCount = largelatCount;
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
