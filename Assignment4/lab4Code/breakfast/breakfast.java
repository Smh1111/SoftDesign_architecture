public abstract class breakfast {
      
       void prepareBreakfast(int numOfEggs, boolean customerWantsSaltsAndPepper) {
            crackEggs(numOfEggs);
            prepareEggs();
            if (customerWantsSaltsAndPepper) {
                  spreadSaltsAndPepper();
            }
            cook();
            serve();
            
            System.err.println();
      }

      abstract void prepareEggs();
      
      abstract void cook();
      
   
      final public void crackEggs(int n) {
		System.out.println("Cracking " + n + " eggs.");
	}
      
      final public void serve() {
		System.out.println("Putting the eggs on the plate.");
	}
      final public void spreadSaltsAndPepper() {
            System.out.println("Spreading salts and pepper on the eggs.");
      }
      
}
