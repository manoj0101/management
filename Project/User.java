package Project;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class User extends DBCode{
	public void select() {
		try {
			String q="select *from Insurance_Details";
			PreparedStatement pst=con.prepareStatement(q);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				System.out.print("1.Insurance Number: "+rs.getInt("InsuranceNum")+"\n"+"2.Insurance Type: "+rs.getString("InsuranceType")+"\n");
				System.out.print("3.Client Name: "+rs.getString("ClientName")+"\n"+"4.Insurance Amount: "+rs.getFloat("Amount")+"\n");
				System.out.print("5.Pay/Month: "+rs.getInt("PayMonth")+"\n"+"6.Insurance period/years: "+rs.getInt("PeriodOfInsurance")+"\n");
				System.out.print("7.Start Date: "+rs.getString("Startdate")+"\n"+"8.End Date: "+rs.getString("EndDate")+"\n");
				System.out.print("9.Insurance Status: "+rs.getString("Status")+"\n");
			}
		}catch(Exception e) {
			System.out.println(e);}	
			
		}
		
	}