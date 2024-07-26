
public class EatBreakfast {
	public static void main(String[] args) {
		System.out.println("Making ScrambledEggs...");
		ScrambledEggs scrambled = new ScrambledEggs();
		scrambled.prepareBreakfast(2, true);
		
		
		System.out.println("Making omelette...");
		Omelette omelette = new Omelette();
		omelette.prepareBreakfast(3, false);
		
	
		System.out.println("Making sunny...");
		SunnySide sunny = new SunnySide();
		sunny.prepareBreakfast(4, true);
		
	}

}
