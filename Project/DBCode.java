package Project;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBCode {
	String url="jdbc:mysql://localhost:3306/Project";
	String user="root";
	String pass="basith";	
	Connection con;	
	public DBCode() {
		try {con=DriverManager.getConnection(url,user,pass);}
		catch(Exception e) {	System.out.println(e);		}
	}
}
