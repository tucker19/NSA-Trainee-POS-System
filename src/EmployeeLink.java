
public class EmployeeLink {

	public String employeeName;
	public double usrNum,overAllTime,inTime,tips,manager, owner;
    public EmployeeLink nextLink;

    //Link constructor
    public EmployeeLink(String name, double usrnum, double time, double managerid, double ownerid,double pTips, double in) {
	    employeeName = name;
	    usrNum = usrnum;
	    overAllTime = time;
	    manager = managerid;
	    owner = ownerid;
	    tips = pTips;
	    inTime = in;
    }
    
    public String getname(){
    	return employeeName;
    }
    
    public double getusrId(){
    	return usrNum;
    }
    
    public double getTime(){
    	return overAllTime;
    }
    
    public double inTime(){
    	return inTime;
    }
    
    public String isManager(){
    	if(manager == 1)
    		return "Yes";
    	else
    		return "No";
    }
    
    public String isOwner(){
    	if(owner == 1)
    		return "Yes";
    	else
    		return "No";
    }
    
    public double getTips(){
    	return tips;
    }
    
    public double getManNum(){
    	return manager;
    }
    
    public double getOwnNum(){
    	return owner;
    }

    //Print Link data
    public void printEmployeeLink() {
	    System.out.print(employeeName + "- Employee Number "+ usrNum + ", Overall working time: " + overAllTime + ", Total Tips: " + tips +"\n");
    }
	
}
