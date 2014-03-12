import java.util.ArrayList;


public class EmployeeArrList {
	ArrayList<Employee> employees = new ArrayList<Employee>();
	public int counter = 1;
	
	public EmployeeArrList(Employee e) {
		counter++;
		employees.add(e);
	}
	
	public void insert(Employee e) {
		employees.add(e);
	}
	
	
	public void delete(Employee e) {
		employees.remove(e);
	}
	
	public void deleteName(String name) {
		for (int x = 0; x < employees.size(); x++) {
			if (employees.get(x).employeeName == name) {
				employees.remove(x);
			}
		}
	}
	
	
}
