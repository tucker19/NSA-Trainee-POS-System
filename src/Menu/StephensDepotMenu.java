package Menu;

import java.util.ArrayList;

public class StephensDepotMenu {
	public static ArrayList<MenuItem> dinnerMenu = new ArrayList<MenuItem>();
	public static ArrayList<MenuItem> breakfastMenu = new ArrayList<MenuItem>();
	public static ArrayList<MenuItem> drinkMenu = new ArrayList<MenuItem>();
	
	public static void createMenus() {
		
		//add appetizers to menu
		dinnerMenu.add(new MenuItem("Spinach & Artichoke Dip", 5.50, "with chips", "appetizers", 1));
		dinnerMenu.add(new MenuItem("Mozzarella Sticks", 5.50, "with Marinara Sauce", "appetizers", 2));
		dinnerMenu.add(new MenuItem("Chicken Fingers", 5.95, "served with honey mustard", "appetizers", 3));
		
		//add salads to menu
		dinnerMenu.add(new MenuItem("Chicken Strip Salad", 6.95, "", "Salads", 4));
		dinnerMenu.add(new MenuItem("Chef Salad", 7.50, "", "Salads", 5));
		dinnerMenu.add(new MenuItem("Caesar Salad", 4.95, "Without Chicken", "Salads", 6));
		dinnerMenu.add(new MenuItem("Caesar Salad", 7.95, "With Chicken", "Salads", 7));
		dinnerMenu.add(new MenuItem("Side Salad", 2.50, "", "Salads", 8));
		
		//add hot sandwiches to menu
		dinnerMenu.add(new MenuItem("Tuna Melt", 6.50, "", "Hot Sandwiches", 9));
		dinnerMenu.add(new MenuItem("Grilled Chicken Club", 7.50, "", "Hot Sandwiches", 10));
		dinnerMenu.add(new MenuItem("Philly Steak", 8.50, "", "Hot Sandwiches", 11));
		dinnerMenu.add(new MenuItem("Chicken Philly", 7.50, "", "Hot Sandwiches", 12));
		dinnerMenu.add(new MenuItem("Veggie Melt", 6.50, "", "Hot Sandwiches", 13));
		dinnerMenu.add(new MenuItem("Fish Sandwich", 7.50, "", "Hot Sandwiches", 14));
		dinnerMenu.add(new MenuItem("Grilled Ham & Cheese", 6.75, "", "Hot Sandwiches", 15));
		
		//add cold sandwiches to menu
		
		dinnerMenu.add(new MenuItem("Roast Beef", 6.95, "", "Cold Sandwiches", 16));
		dinnerMenu.add(new MenuItem("Classic Club", 7.50, "", "Cold Sandwiches", 17));
		dinnerMenu.add(new MenuItem("Turkey Sandwich", 5.95, "", "Cold Sandwiches", 18));
		dinnerMenu.add(new MenuItem("Chicken Salad", 5.95, "", "Cold Sandwiches", 19));
		
		//add burgers
		
		dinnerMenu.add(new MenuItem("The Classic", 5.75, "with cheese", "Burgers", 20));
		dinnerMenu.add(new MenuItem("AMTRAC", 6.75, "with cheddar & bacon", "Burgers", 21));
		dinnerMenu.add(new MenuItem("Santa Fe", 6.75, "with Monterey jack and pepper", "Burgers", 22));
		dinnerMenu.add(new MenuItem("BNSF", 7.25, "with fried egg, cheddar, and bacon", "Burgers", 23));
		
		//add entrees
		
		dinnerMenu.add(new MenuItem("Country Fried Steak", 9.50, "served with homemade cream gravy", "Entrees", 24));
		dinnerMenu.add(new MenuItem("Chicken Strip Dinner", 8.95, "tender breast strips fried to a golden brown", "Entrees", 25));
		dinnerMenu.add(new MenuItem("Cod Filets", 8.75, "battered and deep fried served with tartar sauce", "Entrees", 26));
		dinnerMenu.add(new MenuItem("KC Strip Steak", 13.95, "8oz USDA Choice grilled to your liking", "Entrees", 27));
		dinnerMenu.add(new MenuItem("Ribeye Steak", 15.95, "10oz USDA Choice grilled to your liking", "Entrees", 28));
		dinnerMenu.add(new MenuItem("Catfish and Chips", 8.95, "catfish strips served with fries and cole slaw", "Entrees", 29));
		dinnerMenu.add(new MenuItem("Chicken Parmesan", 8.95, "topped with marinara and cheese and served with a side of pasta and vegetable", "Entrees", 30));
		dinnerMenu.add(new MenuItem("Meatloaf", 7.95, "served with our homemade gravy", "Entrees", 31));
		dinnerMenu.add(new MenuItem("Fettucine Alfredo", 7.50, "served in our homemade sauce, no meat", "Entrees", 32));
		dinnerMenu.add(new MenuItem("Fettucine Alfredo", 9.95, "with Chicken", "Entrees", 33));
		dinnerMenu.add(new MenuItem("Fettucine Alfredo", 10.95, "with Shrimp", "Entrees", 34));
		
		
		//Specialites
		breakfastMenu.add(new MenuItem("The Express", 3.50, "One egg, two strips of bacon, toast and jelly", "Specialties", 35));
		breakfastMenu.add(new MenuItem("The Express", 4.25, "Two eggs, two strips of bacon, toast, and jelly", "Specialties", 36));
		breakfastMenu.add(new MenuItem("French Toast", 4.50, "served with hot maple syrup", "Specialties", 37));
		breakfastMenu.add(new MenuItem("Early Bird", 4.50, "Two eggs, hash browns, toast and jelly", "Specialties", 38));
		breakfastMenu.add(new MenuItem("Triple Stack", 4.50, "Three pancakes with hot maple syrup", "Specialties", 39));
		breakfastMenu.add(new MenuItem("Triple Stack with Blueberries", 5.50, "Three pancakes with hot maple syrup and blueberries", "Specialties", 40));
		breakfastMenu.add(new MenuItem("Biscuits and Gravy", 4.95, "Two buttermilk biscuits with sausage gravy and has browns", "Specialties", 41));
		breakfastMenu.add(new MenuItem("Belgian Waffle", 4.50, "served with hot maple syrup", "Specialties", 42));
		breakfastMenu.add(new MenuItem("Belgian Waffle with Blueberries", 5.50, "served with hot maple syrup and blueberries", "Specialties", 43));
		breakfastMenu.add(new MenuItem("Half Waffle Combo", 4.50, "One half Belgian waffle with one egg and two strips of bacon", "Specialties", 44));
		
		//combinations 
		breakfastMenu.add(new MenuItem("Bacon or Sausage and Eggs", 6.25, "", "Specialties", 45));
		breakfastMenu.add(new MenuItem("Ham and Eggs", 6.95, "", "Specialties", 46));
		breakfastMenu.add(new MenuItem("8oz KC Strip and Eggs", 12.95, "", "Specialties", 47));
		
		//omelets
		breakfastMenu.add(new MenuItem("Denver Omelet", 6.95, "with diced ham, green pepper and onion", "Omelets", 48));
		breakfastMenu.add(new MenuItem("Cheese", 5.95, "with both Swiss and American", "Omelets", 49));
		breakfastMenu.add(new MenuItem("Veggie", 6.50, "with mushroom, onion, green pepper and tomato", "Omelets", 50));
		breakfastMenu.add(new MenuItem("Southwest Omelet", 6.95, "with sausage, green pepper, onion and mushroom", "Omelets", 51));
		
		//sides
		breakfastMenu.add(new MenuItem("Hash Browns", 1.95, "", "Sides", 52));
		breakfastMenu.add(new MenuItem("Cinnamon Roll", 2.50, "", "Sides", 53));
		breakfastMenu.add(new MenuItem("Bacon or Sausage", 2.75, "", "Sides", 54));
		breakfastMenu.add(new MenuItem("One biscuit with gravy", 2.25, "", "Sides", 55));
		breakfastMenu.add(new MenuItem("Toast", 1.50, "", "Sides", 56));
		
		
		//drinks
		
		drinkMenu.add(new MenuItem("Soft Drinks (free refills)", 1.50, "", "Drinks", 57));
		drinkMenu.add(new MenuItem("Coffee (Regular or decaf)", 1.50, "", "Drinks", 58));
		drinkMenu.add(new MenuItem("Hot Tea", 1.50, "", "Drinks", 59));
		drinkMenu.add(new MenuItem("Iced Tea (free refills)", 1.50, "", "Drinks", 60));
		drinkMenu.add(new MenuItem("Small Milk", 1.50, "", "Drinks", 61));
		drinkMenu.add(new MenuItem("Large Milk", 2.50, "", "Drinks", 62));
		drinkMenu.add(new MenuItem("Small Juice (Orange, Apple, Cranberry)", 1.50, "", "Drinks", 63));
		drinkMenu.add(new MenuItem("Large Juice (Orange, Apple, Cranberry)", 2.50, "", "Drinks", 64));
		
		
		
		
	}
	
}
