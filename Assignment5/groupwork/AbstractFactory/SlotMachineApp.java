public class SlotMachineApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlotFactory nvFactory = new NVSlotFactory();
		Slot slot = nvFactory.orderSlot("straight");	
		System.out.println("Peppermill ordered a " + slot + "\n");

		SlotFactory nvFactory2 = new NVSlotFactory();
		Slot slot2 = nvFactory2.orderSlot("bonus");	
		System.out.println("Peppermill ordered a " + slot2 + "\n");

		SlotFactory nvFactory3 = new NVSlotFactory();
		Slot slot3 = nvFactory3.orderSlot("progressive");
		System.out.println("Peppermill ordered a " + slot3 + "\n");

		SlotFactory njFactory = new NJSlotFactory();
		Slot slot4 = njFactory.orderSlot("straight");	
		System.out.println("Taj Mahal ordered a " + slot4 + "\n");

		SlotFactory njFactory2 = new NJSlotFactory();
		Slot slot5 = njFactory2.orderSlot("bonus");	
		System.out.println("Taj Mahal ordered a " + slot5 + "\n");

		SlotFactory njFactory3 = new NJSlotFactory();
		Slot slot6 = njFactory3.orderSlot("progressive");
		System.out.println("Taj Mahal ordered a " + slot6 + "\n");

		SlotFactory waFactory = new WASlotFactory();
		Slot slot7 = waFactory.orderSlot("straight");	
		System.out.println("Edgewater ordered a " + slot7 + "\n");

		SlotFactory waFactory2 = new WASlotFactory();
		Slot slot8 = waFactory2.orderSlot("bonus");	
		System.out.println("Edgewater ordered a " + slot8 + "\n");

		SlotFactory waFactory3 = new WASlotFactory();
		Slot slot9 = waFactory3.orderSlot("progressive");
		System.out.println("Edgewater ordered a " + slot9 + "\n");
	}
}
