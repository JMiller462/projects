package coffeeStore;

public class Espresso extends Coffee{
	private static int smallespCount = 0;
	private static int medespCount = 0;
	private static int largeespCount = 0;
	
	public Espresso( String name, double price,  String size) {

	super(name, price, size);
	smallespCount ++;
	if(this.getSize().equals("Small")) {
		smallespCount ++;
	}
	if(this.getSize().equals("Medium")) {
		medespCount ++;
	}
	if(this.getSize().equals("Large")) {
		largeespCount ++;
	}
}
	public static int getEspSmallCount() {
		return smallespCount;
	}
	public static void setEspSmallCount(int espCount) {
		Espresso.smallespCount = espCount;
	}
	public static int getMedespCount() {
		return medespCount;
	}
	public static void setMedespCount(int medespCount) {
		Espresso.medespCount = medespCount;
	}
	public static int getLargeespCount() {
		return largeespCount;
	}
	public static void setLargeespCount(int largeespCount) {
		Espresso.largeespCount = largeespCount;
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
				"Adding signature ByteBucks C"
				+ "ream...";
		}
	return prep;
	}
}
