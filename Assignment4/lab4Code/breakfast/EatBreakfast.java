
public class EatBreakfast {
	public static void main(String[] args) {
		System.out.println("Making ScrambledEggs...");
		ScrambledEggs scrambled = new ScrambledEggs();
		scrambled.setCustomerWantsSaltsAndPepper(true);
		scrambled.prepareBreakfast(2);
		
		
		System.out.println("Making omelette...");
		Omelette omelette = new Omelette();
		omelette.setCustomerWantsSaltsAndPepper(false);
		omelette.prepareBreakfast(3);
		
	
		System.out.println("Making sunny...");
		SunnySide sunny = new SunnySide();
		sunny.setCustomerWantsSaltsAndPepper(true);
		sunny.prepareBreakfast(4);
		
	}

}
