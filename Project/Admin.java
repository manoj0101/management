package Project;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Admin extends DBCode{
	public int insert(int n,String t,String nm,float a,int p,int prd,String sd,String ed,String s) {
		int r=0;
		try {
	String query="insert into Insurance_Details(InsuranceNum,InsuranceType,ClientName,Amount,PayMonth,PeriodOfInsurance,StartDate,EndDate,status) values (?,?,?,?,?,?,?,?,?)";
	PreparedStatement pst=con.prepareStatement(query);
	pst.setInt(1, n);
	pst.setString(2, t);
	pst.setString(3, nm);
	pst.setFloat(4,a);
	pst.setInt(5, p);
	pst.setInt(6, prd);
	pst.setString(7, sd);
	pst.setString(8, ed);
	pst.setString(9, s);
	r=pst.executeUpdate();
		}catch(Exception e) {	System.out.println(e);		}
		return r;
	}
	public int update(int i,String p) {
		int r=0;
		try {
			String query="update Insurance_Details set status=? where InsuranceNum=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,p);
			pst.setInt(2, i);
			r=pst.executeUpdate();
		}catch(Exception e) {	System.out.println(e);}		
		return r;
	}
	public int delete(int i) {
		int r=0;
		try {
			String query="delete from Insurance_Details where InsuranceNum=?";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1, i);
			r=pst.executeUpdate();
		}catch(Exception e) {	System.out.println(e);}		
		return r;
	}
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
	}catch(Exception e) {	System.out.println(e);}	
		
	}
}



















