
package GroupWork.Lab2Task2Push;
import java.util.ArrayList;

public class Baby implements Subject {

	private ArrayList observers;
	private boolean crying=false;
	private int level=0;
	private String babyname;
	
	public Baby(String name){
		this.babyname=name;
		observers=new ArrayList();
	}
	
	public void notifyObservers() {
		for (int i=0; i< observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(babyname, crying, level);
		}
	}

	public void registerObserver(Observer o) {
		observers.add(o);

	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >=0) {
			observers.remove(i);
		}
	}
	
	public void setData(boolean crying, int level, String babyname) {
		this.crying=crying;
		this.level=level;
		this.babyname=babyname;
		notifyObservers();
	}

	public String getBabyName() {
		return babyname;
	}
	
	public boolean getCrying() {
		return crying;
	}

	public int getLevel() {
		return level;
	}

}
