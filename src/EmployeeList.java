public class EmployeeList {
	
	    private EmployeeLink first;
	    private double listCount;

	    //EmployeeLinkList constructor
	    public EmployeeList() {
		    first = null;
	    }

	    //Returns true if list is empty
	    public boolean isEmpty() {
		    return first == null;
	    }

	    //Inserts a new EmployeeLink at the first of the list
	    public void insert(String name, double usrnum ,double time, double in) {
		    EmployeeLink EmployeeLink = new EmployeeLink(name, usrnum ,time, in);
		    listCount++;
		    EmployeeLink.nextLink = first;
		    first = EmployeeLink;
	    }

	    //Deletes the EmployeeLink at the first of the list
	    public void delete() {
		    //EmployeeLink temp = first;
		    first = first.nextLink;
		    listCount--;
	    }
	    
	    public void newOverallTime(String name, double time, double out){
	    	for(int i = 0; i<listCount;i++){
	    		if(name == first.getname()){
	    			time+=out-first.inTime();
	    		}
	    		else
	    			first = first.nextLink;
	    	}
	    }

	    //Prints list data
	    public void printList() {
		    EmployeeLink currentEmployeeLink = first;
		    System.out.print("List: ");
		    while(currentEmployeeLink != null) {
			    currentEmployeeLink.printEmployeeLink();
			    currentEmployeeLink = currentEmployeeLink.nextLink;
		    }
		    System.out.println("");
	    }
	}
