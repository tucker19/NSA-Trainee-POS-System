import java.util.ArrayList;


public class Table {
	public int table_no;
	public boolean reserved;
	ArrayList<Table> tables = new ArrayList<Table>();
	public int counter = 1;
	ArrayList<Order> orders = new ArrayList<Order>();
	
	public Table() {
		table_no = counter;
		counter++;
		reserved = false;
		tables.add(this);
	}
	
	public void makeReserved(int tablenum) {
		tables.get(tablenum).reserved = true;
	}
	
	public void removeReservation(int tablenum) {
		tables.get(tablenum).reserved = false;
	}
	
	public void addOrder(Order o) {
		orders.add(o);
	}
	
	public void removeOrder (Order o) {
		orders.remove(o);
	}
	
}
