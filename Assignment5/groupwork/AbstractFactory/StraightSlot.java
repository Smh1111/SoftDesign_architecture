public class StraightSlot extends Slot {
    SlotComponentFactory componentFactory;

    public StraightSlot(SlotComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    void build() {
        cabinet = componentFactory.createCabinet("straight");
        payment = componentFactory.createPayment("straight");
        display = componentFactory.createDisplay("straight");
        gpu = componentFactory.createGPU("straight");
        os = componentFactory.createOS("straight");
    }
}
