public class BonusSlot extends Slot {
    SlotComponentFactory componentFactory;

    public BonusSlot(SlotComponentFactory componentFactory) {
        this.componentFactory = componentFactory;
    }

    void build() {
        cabinet = componentFactory.createCabinet("bonus");
        payment = componentFactory.createPayment("bonus");
        display = componentFactory.createDisplay("bonus");
        gpu = componentFactory.createGPU("bonus");
        os = componentFactory.createOS("bonus");
    }
}
