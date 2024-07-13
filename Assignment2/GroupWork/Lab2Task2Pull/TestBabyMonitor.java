package GroupWork.Lab2Task2Pull;

public class TestBabyMonitor {
	// public static void main(String[] args) {
	// 			Baby marla = new Baby("marla");
	// 			// one monitor with one baby
	// 			BabyMonitorSimple livingRoom = new BabyMonitorSimple("kitchen ", marla);
	// 			marla.setData(true, 1);
	// 			// one monitor listening to two babies
	// 			Baby charlie = new Baby("Charlie");
	// 						}
	// }

    public static void main(String[] args) {
        Baby baby1 = new Baby("marla");
        Baby baby2 = new Baby("jane");
        BabyMonitorSimple monitor1 = new BabyMonitorSimple("kitchen", baby1);
        BabyMonitorSimple monitor2 = new BabyMonitorSimple("bedroom", baby2);

        baby1.setData(true, 5); // Notify monitors that the baby is crying
        monitor1.turnOff(); // Turn off one monitor
        baby2.setData(false, 0); // Notify monitors that the baby stopped crying
    }
}