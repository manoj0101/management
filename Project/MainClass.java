package Project;
import java.util.Scanner;
public class MainClass {
	public static void main(String[] args) {	
	Scanner sc=new Scanner(System.in);
	System.out.print("Press 1 for Admin\nPress 2 for User \n");
	System.out.print("Enter :");
	int ch=sc.nextInt();	
	if(ch==1) {
		Admin ad=new Admin();
		while(true) {
		System.out.println("Welcome Admin\n");
		System.out.print("1.Add\n2.Edit\n3.View\n4.Remove\n");
		System.out.print("Enter :");
		int c=sc.nextInt();
		sc.nextLine();
		if(c==1) {
			System.out.println("Insert Insurance Details");
			System.out.print("Enter Insurance Number : ");
			int n=sc.nextInt();
			System.out.print("Enter Insurance Type : ");
			String t=sc.next();
			System.out.print("Enter Client Name : ");
			String nm=sc.next();
			System.out.print("Enter Amount : ");
			Float a=sc.nextFloat();
			System.out.print("Enter Pay/Month : ");
			int p=sc.nextInt();
			System.out.print("Enter Insurance period : ");
			int prd=sc.nextInt();
			System.out.print("Enter Start Date : ");
			String sd=sc.next();
			System.out.print("Enter End Date: ");
			String ed=sc.next();
			System.out.print("Enter Insurance Status : ");
			String s=sc.next();
			int res=ad.insert(n,t,nm,a,p,prd,sd,ed,s);
			System.out.println((res>0)?"Registered":"Not Registered");
		}
		else if(c==2) {
			System.out.println("Update Status");
			System.out.print("Enter Insurance Number : ");
			int i=sc.nextInt();
			System.out.print("Enter New Status : ");
			String p=sc.next();		
			int res=ad.update(i,p);
			System.out.println((res>0)?"Updated":"Not Updated");
		}
		else if(c==4) {
			System.out.print("Enter Insurance number: ");
			int i=sc.nextInt();	
			int res=ad.delete(i);
			System.out.println((res>0)?"Deleted":"Not Deleted");
		}
		else if(c==3) {
			ad.select();
		}
		else if(c==5) {
			System.out.println("Back to Dashboard");
		}
		else {
			System.out.println("Invalid Choice ");
		}
		}
	}
		else if(ch==2) {
			User us=new User();
			System.out.println("Welcome User");
			System.out.print("1.View\n");
			System.out.print("Enter: ");
			int c=sc.nextInt();
			if(c==1) {
				System.out.println("View the Insurance Details\n");
				us.select();
			}
			else {
				System.out.println("Invalid Choice");
			}
		}
		else {
			System.out.println("Invalid Choice");
		}
		}	
	}

















