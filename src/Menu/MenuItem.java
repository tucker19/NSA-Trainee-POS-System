package Menu;

public class MenuItem {

	public String name;
	public double price;
	public String description;
	public String category;
	public int id;
	
	
	public MenuItem(String n, double p, String d, String c, int i) {
		name = n;
		price = p;
		description = d;
		category = c;
		id = i;
	}
	
	
	public double getPrice() {
		return price;
	}
        
        public String getName() {
            return name;
        }
	
	public String getCategory() {
		return category;
	}
	
	public int getId() {
		return id;
	}
	
	public String description() { 
		return description;
	}
	
	
	public void setPrice(double p) {
		price = p;
	}
	
	public void setCategory(String c) {
		category = c;
	}
	
	public void setDescription(String d) {
		description = d;
	}
	
	public void setId(int i) {
		id = i;
	}
	
	
	
}

