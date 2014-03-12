import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQLiteData {
	
	public int employeeId = 1;
	public static EmployeeList el;

	public static void create( String args[] )
	  {
	    Connection c = null;
	    Statement stmt = null;
	    
	    try {
	      Class.forName("org.sqlite.DATA");
	      c = DriverManager.getConnection("data:sqlite:test.db");
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql = "CREATE TABLE COMPANY " +
	                   "(ID INT PRIMARY KEY     NOT NULL," +
	    		       " EMPLOYEEID		INT	NOT NULL" +
	                   " NAME           TEXT    NOT NULL, " +
	                   " TIME        	DOUBLE	NOT NULL)"; 
	      stmt.executeUpdate(sql);
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Table created successfully");
	  }
	
	public void insert(int id, int emid, String name, double time){
		Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.Data");
	      c = DriverManager.getConnection("data:sqlite:test.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql = "INSERT INTO COMPANY (ID,EMPLOYEEID,NAME,TIME) " +
	                   "VALUES (id, emid, name, time);"; 
	      stmt.executeUpdate(sql);
	      employeeId++;

	      stmt.close();
	      c.commit();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Records created successfully");
	}
	
	public static void getData(){
		Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.Data");
	      c = DriverManager.getConnection("data:sqlite:test.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	      while ( rs.next() ) {
	         int id = rs.getInt("id");
	         int employeeid = rs.getInt("employeeid");
	         String  name = rs.getString("name");
	         double time  = rs.getInt("time");
	         el.insert(name, employeeid, time, time);
	         System.out.println( "ID = " + id );
	         System.out.println( "EMPLOYEEID = " + employeeid );
	         System.out.println( "NAME = " + name );
	         System.out.println( "TIME = " + time );
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	}
	
	public void update(int i){
		Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.Data");
	      c = DriverManager.getConnection("data:sqlite:test.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql = "UPDATE COMPANY set TIME = time where ID=i;";
	      stmt.executeUpdate(sql);
	      c.commit();

	      ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	      while ( rs.next() ) {
	    	  int id = rs.getInt("id");
		      int employeeid = rs.getInt("employeeid");
		      String  name = rs.getString("name");
		      double time  = rs.getDouble("time");
		      System.out.println( "ID = " + id );
		      System.out.println( "EMPLOYEEID = " + employeeid );
		      System.out.println( "NAME = " + name );
		      System.out.println( "TIME = " + time );
	          System.out.println();
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	}
	
	public void delete(int i){
		Connection c = null;
	    Statement stmt = null;
	    try {
	      Class.forName("org.sqlite.Data");
	      c = DriverManager.getConnection("data:sqlite:test.db");
	      c.setAutoCommit(false);
	      System.out.println("Opened database successfully");

	      stmt = c.createStatement();
	      String sql = "DELETE from COMPANY where ID=i;";
	      stmt.executeUpdate(sql);
	      c.commit();

	      ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
	      while ( rs.next() ) {
	         int id = rs.getInt("id");
	         int employeeid = rs.getInt("employeeid");
	         String  name = rs.getString("name");
	         double time  = rs.getInt("time");
	         System.out.println( "ID = " + id );
	         System.out.println( "EMPLOYEEID = " + employeeid );
	         System.out.println( "NAME = " + name );
	         System.out.println( "TIME = " + time );
	         System.out.println();
	      }
	      rs.close();
	      stmt.close();
	      c.close();
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    System.out.println("Operation done successfully");
	}
}
