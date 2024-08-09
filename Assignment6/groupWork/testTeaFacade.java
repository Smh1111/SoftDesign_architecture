
import facade.TeaCup;
import facade.TeaFacade;
import facade.Water;
import facade.TeaInfuser;

public class testTeaFacade {
      
      public static void main(String[] args) {
            
            TeaCup blueCup = new TeaCup();
            Water water = new Water();
            TeaInfuser teaInfuser = new TeaInfuser();
            
            TeaFacade teaFacade = new TeaFacade(blueCup, water, teaInfuser);
            
            teaFacade.makeTea("Earl Grey");
      }
}
