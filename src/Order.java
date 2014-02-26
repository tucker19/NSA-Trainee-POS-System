import java.util.ArrayList;
import Menu.MenuItem;

public class Order {
	public int table_no;
	public double total_price;
	public String comments;
        public ArrayList<MenuItem> items = new ArrayList<MenuItem>();
	//public ArrayList <MenuItem> items = new ArrayList<MenuItem>();
	
	public Order(int table, String notes) {
		table_no = table;
		comments = notes;
//		items = order;		
	}	
	
	public double getPrice() {
		//loop to calculate price
		return total_price;
	}
        
        public String getComment(){
            return comments;
        }
        
        public void setComment(String newComment){
            comments = newComment;
        }
        
        public ArrayList getItems(){
            return items;
        }
	
	public void addItem(MenuItem new_item) {
		items.add(new_item);
	}
	
	public void deleteItem(int new_item) {
		items.remove(new_item);
	}
	
	public void deleteOrder() {
		items.clear();
	}
}
