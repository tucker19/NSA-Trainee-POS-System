

import java.util.ArrayList;
import java.util.Scanner;

public class MenuEdit {

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	
    	item one = new item(20);
    	
    	ArrayList <item> test = new ArrayList<item>();
    	test.add(new item(30));
    	
    	System.out.println (test.get(0).getValue());
    }
}