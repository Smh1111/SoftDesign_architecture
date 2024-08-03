
public class ProgressiveSlot extends Slot {
	SlotComponentFactory componentFactory;
	
	public ProgressiveSlot(SlotComponentFactory componentFactory) {
		this.componentFactory= componentFactory;
	}
 
	void build() {
        cabinet = componentFactory.createCabinet("progressive");
        payment = componentFactory.createPayment("progressive");
        display = componentFactory.createDisplay("progressive");
        gpu = componentFactory.createGPU("progressive");
        os = componentFactory.createOS("progressive");
	}
}
