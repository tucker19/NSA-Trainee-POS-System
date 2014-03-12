
public class EmployeeList {
	
	    private EmployeeLink first;
	    private double listCount = 0, employeenum = 0,unum = 0,etime = 0,etips = 0;

	    //EmployeeLinkList constructor
	    public EmployeeList() {
		    first = null;
	    }

	    //Returns true if list is empty
	    public boolean isEmpty() {
		    return first == null;
	    }

	    //Inserts a new EmployeeLink at the first of the list
	    public void insert(String name, double usrnum ,double time,double managerid,double ownerid,double pTips) {
		    EmployeeLink EmployeeLink = new EmployeeLink(name,usrnum ,time,managerid, ownerid, pTips,0);
		    listCount++;
		    EmployeeLink.nextLink = first;
		    first = EmployeeLink;
	    }

	    //Deletes the EmployeeLink at the first of the list
	    public void delete() {
		    //EmployeeLink temp = first;
		    if(listCount == 0){
		    	first = null;
		    }
		    else{
		    	listCount--;
		    }
		    first = first.nextLink;
	    }
	    
	    public void deletePerson(String name){
	    	for(int i = 0; i<listCount; i++){
	    		if(name == first.getname() && i == 0){
	    			first = first.nextLink;
	    			listCount--;
	    		}
	    		else if(name == first.nextLink.getname()){
	    			first.nextLink = first.nextLink.nextLink;
	    			listCount--;
	    		}
	    		first = first.nextLink;
	    	}
	    }
	    
	    public void getMaxEmployeeNum(){
	    	for(int i = 0; i<listCount; i++){
	    		if(employeenum <= first.getusrId()){
	    			employeenum = first.getusrId();
	    			first = first.nextLink;
	    		}
	    		else 
	    			first = first.nextLink;
	    	}
	    }
	    
	    public void newOverallTime(double id2, double out){
	    	for(int i = 0; i<listCount;i++){
	    		if(id2 == first.getusrId()){
	    			first.overAllTime+=out-first.inTime();
	    		}
	    		else
	    			first = first.nextLink;
	    	}
	    }
	    
	    public void newInTime(double id, double in){
	    	for(int i = 0; i<listCount;i++){
	    		if(id == first.getusrId()){
	    			first.inTime = in;
	    		}
	    		else
	    			first = first.nextLink;
	    	}
	    }
	    
	    public void checkHours(){ //need to put this function into main file as a different list
			for(int i = 0; i<listCount; i++){
				if(first.getTime() == (28.0 - 0.10)){
					if(first.owner != 1){
					insert(first.getname(), first.usrNum, first.overAllTime,first.manager, first.owner, first.tips);
					first = first.nextLink;
					}
				}
				else{
					first = first.nextLink;
				}
			}
	    }
	    
	    public void addTip(double id, double tip){
	    	for(int i = 0; i<listCount;i++){
	    		if(id == first.getusrId()){
	    			first.tips+=tip;
	    		}
	    		else
	    			first = first.nextLink;
	    	}
	    }
	    
	    public String isLManager(double id){
	    	for(int i = 0; i<listCount; i++){
	    		if(id == first.getusrId())
	    			return first.isManager();
	    		else 
	    			first = first.nextLink;
	    	}
	    	return "No";
	    }
	    
	    public String isLOwner(double id){
	    	for(int i = 0; i<listCount; i++){
	    		if(id == first.getusrId())
	    			return first.isOwner();
	    		else 
	    			first = first.nextLink;
	    	}
	    	return "No";
	    }
	    
	    public String login(double id1,double id2,double iTime){
	    	if(isLManager(id1) == "Yes" || isLOwner(id1) == "Yes"){
	    		newInTime(id2,iTime);
		    	return "You are logged in.";
	    	}
	    	return "You are not allowed to do this.";
	    }
	    
	    public String logout(double id1,double id2,double outTime){
	    	if(isLManager(id1) == "Yes" || isLOwner(id1) == "Yes"){
	    		newOverallTime(id2,outTime);
		    	return "You are logged out.";
	    	}
	    	return "You are not allowed to do this.";
	    }
	    
	    public String addManager(double id, String name,double usrnum,double pTips){
	    	if(isLOwner(id) == "Yes"){	    		
	    		insert(name,employeenum++,0,1,0,0);
	    		getMaxEmployeeNum();
		    	return name+" is added as an manager.";
	    	}
	    	
	    	return "You are not allowed to do this.";
	    }
	    
	    public String makeManager(double id, String name){
	    	if(isLOwner(id) == "Yes"){	  
	    		for(int i = 0; i<listCount; i++){
		    		if(id == first.getusrId()){
		    			 unum = first.getusrId();
		    			 etime = first.getTime();
		    			 etips = first.getTips();
		    			 deletePerson(name);
		    			 insert(name,unum,etime,1,0,etips);
		    			 getMaxEmployeeNum();
		    			return name+" is added as an manager.";
		    		}
		    		else 
		    			first = first.nextLink;
		    	}
	    	}
	    	
	    	return "You are not allowed to do this.";
	    }
	    
	    public String addOwner(double id, String name, double usrnum,double pTips){
	    	if(isLOwner(id) == "Yes"){
	    		insert(name,employeenum++,0,1,1,0);
	    		getMaxEmployeeNum();
		    	return name+" is added as an owner.";
	    	}
	    	return "You are not allowed to do this.";
	    }
	    
	    public String makeOwner(double id, String name){
	    	if(isLOwner(id) == "Yes"){	  
	    		for(int i = 0; i<listCount; i++){
		    		if(id == first.getusrId()){
		    			 unum = first.getusrId();
		    			 etime = first.getTime();
		    			 etips = first.getTips();
		    			 deletePerson(name);
		    			 insert(name,unum,etime,1,1,etips);
		    			 getMaxEmployeeNum();
		    			return name+" is added as an owner.";
		    		}
		    		else 
		    			first = first.nextLink;
		    	}
	    	}
	    	
	    	return "You are not allowed to do this.";
	    }
	    
	    public String addEmployee(double id, String name, double usrnum,double pTips){ //This isnt finished
	    	if(isLManager(id) == "Yes" || isLOwner(id) == "Yes"){
	    		insert(name,employeenum++,0,0,0,0);
	    		getMaxEmployeeNum();
		    	return name+" is added as an employee.";
	    	}
	    	return "You are not allowed to do this.";
	    }
	    
	    public String deleteEmployee(double id, String name){
	    	if(isLManager(id) == "Yes" || isLOwner(id) == "Yes"){
	    		deletePerson(name);
		    	return name+" is deleted as an employee.";
	    	}
	    	return "You are not allowed to do this.";
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
