package GroupWork.Lab2Task2Pull;


public class BabyMonitorSimple implements Observer {

	private Subject mdata;
	private String name;
	private boolean crying;
	
	public BabyMonitorSimple(String location, Baby d) {
		this.mdata=d;
		this.name=location;
		mdata.registerObserver(this);
	}
		
	public void display() {
		if (crying) {
			System.out.println("Monitor:" + name + " baby is crying");
		}
	}
	
	public void turnOff() {
		mdata.removeObserver(this);
	}

	public void update() {
		
		display();
	}
}
