public class EmployeeLink {

	public String employeeName;
	public double usrNum;
    public double overAllTime;
    public double inTime;
    public EmployeeLink nextLink;

    //Link constructor
    public EmployeeLink(String name, double usrnum, double time, double in) {
	    employeeName = name;
	    usrNum = usrnum;
	    overAllTime = time;
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

    //Print Link data
    public void printEmployeeLink() {
	    System.out.print(employeeName + "- Employee Number "+ usrNum + ", Overall working time: " + overAllTime + ", Logged in time: " + inTime +"\n");
    }
	
}
