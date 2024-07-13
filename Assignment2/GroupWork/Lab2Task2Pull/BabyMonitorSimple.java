package GroupWork.Lab2Task2Pull;

// public class BabyMonitorSimple implements Observer {

// 	private Subject mdata;
// 	private String name;
// 	private boolean crying;
	
// 	public BabyMonitorSimple(String location, Baby d) {
// 		this.mdata=d;
// 		this.name=location;
// 		mdata.registerObserver(this);
// 	}
		
// 	public void display() {
// 		if (crying) {
// 			System.out.println("Monitor:" + name + " baby is crying");
// 		}
// 	}
	
// 	public void turnOff() {
// 		mdata.removeObserver(this);
// 	}

// 	public void update() {
		
// 		display();
// 	}
// }

public class BabyMonitorSimple implements Observer {
    public Baby mdata;
    public String name;
    public boolean crying;

    public BabyMonitorSimple(String location, Baby d) {
        this.mdata = d;
        this.name = location;
        mdata.registerObserver(this);
    }

    public void display() {
        if (crying) {
            System.out.println("Monitor: " + name + " baby is crying");
        } else {
            System.out.println("Monitor: " + name + " baby is not crying");
        }
    }

    public void turnOff() {
        mdata.removeObserver(this);
    }

    @Override
    public void update() {
        this.crying = mdata.isCrying();
        display();
    }
}
