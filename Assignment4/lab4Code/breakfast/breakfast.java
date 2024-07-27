public abstract class breakfast {
      boolean customerWantsSaltsAndPepper = false;
      
      void prepareBreakfast(int numOfEggs) {
            crackEggs(numOfEggs);
            prepareEggs();
            if (getCustomerWantsSaltsAndPepper()) {
                  spreadSaltsAndPepper();
            }
            cook();
            serve();
            
            System.err.println();
      }
      void setCustomerWantsSaltsAndPepper(boolean customerWantsSaltsAndPepper){
            this.customerWantsSaltsAndPepper = customerWantsSaltsAndPepper;
      }
      boolean getCustomerWantsSaltsAndPepper(){
            if (customerWantsSaltsAndPepper) {
                  return true;
            }
            else{
                  return false;
            }
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
