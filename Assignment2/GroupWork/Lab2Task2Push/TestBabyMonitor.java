package GroupWork.Lab2Task2Push;
public class TestBabyMonitor {
	public static void main(String[] args) {
		Baby baby1 = new Baby("susy");
		Baby baby2 = new Baby("peter");
		BabyMonitorSimple monitor1 = new BabyMonitorSimple("kitchen", baby1);
		BabyMonitorSimple monitor2 = new BabyMonitorSimple("bedroom", baby2);
    
		baby1.setData(true, 5, null); // Notify monitors that the baby is crying
		//monitor1.turnOff(); // Turn off one monitor
		
		baby1.setData(false, 0, null); // Notify monitors that the baby stopped crying
		baby2.setData(false, 2, null); // Notify monitors that the baby stopped crying
		
		//monitor2.turnOff(); // Turn off the other monitor

		
	}
	}
