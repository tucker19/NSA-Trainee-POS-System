
public class Employee {
	public String employeeName;
	public double overallTime, tips;
	public double inTime;
	public int id;
	public int counter  = 1;
	public boolean clockedIn;
	public boolean manager = false, owner = false;
	
	public Employee(String name) {
		employeeName = name;
		overallTime = 0;
		tips = 0;
		id = counter;
		counter++;
		clockedIn = false;
	}
	
	public void clockIn(double t) {
		clockedIn = true;
		inTime = t;
	}
	
	public void clockOut(double t) {
		clockedIn = false;
		overallTime = overallTime + (t - inTime); 
	}
	
	public void addTips(double t) {
		tips = tips + t;
	}
	
	public double getTips() {
		return tips;
	}
	
	public String getName() {
		return employeeName;
	}
	
	public double getTime() {
		return overallTime;
	}
	
	public void makeManager() {
		manager = true;
	}
	
	public void makeOwner() {
		owner = true;
	}
	
	public void removeManager() {
		manager = false;
	}
	
	public void removeOwner() {
		owner = false;
	}
}
