package facade;
public class TeaFacade {

      TeaCup cup;
      Water water;
      TeaInfuser teaInfuser;

      public TeaFacade(TeaCup cup, Water water, TeaInfuser teaInfuser) {
        
            this.cup = cup;
            this.water = water;
            this.teaInfuser = teaInfuser;
      }

      public void makeTea(String teaType) {
            
            Tea tea = new Tea(teaType);
            teaInfuser.addTea(tea);
            
            water.boilWater();

            cup.addWater(water);
            cup.setSteepTime(15);
            cup.steep();


      }
}
