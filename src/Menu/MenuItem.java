package Menu;

public class MenuItem {

	public String name;
	public double price;
	public String description;
	public String category;
	public int id;
	public double startSpecial;
	public String specialDay;
	
	public MenuItem(String n, double p, String d, String c, int i) {
		name = n;
		price = p;
		description = d;
		category = c;
		id = i;
		specialDay = "";
	}
	
	public MenuItem(String n, double p, String d, String c, int i, String day) {
		name = n;
		price = p;
		description = d;
		category = c;
		id = i;
		specialDay = "";
		specialDay = day;
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
	
	public String getDescription() { 
		return description;
	}
	
	public String getSpecialDay() {
		return specialDay;
	}
	
	public void setName(String newName) {
            name = newName;
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
	
	public void setSpecialDay(String day) {
		specialDay = day;
	}
	
	
	
}

