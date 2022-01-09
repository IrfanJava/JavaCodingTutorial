package Mindtree;
import java.util.*;
public class class3 { 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Option 1 or 2 or 3 ");
		int ch=sc.nextInt(); 
		if(ch==1) {
			System.out.println("Enter Customer ID");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Customer Name");
			String name=sc.nextLine();
			System.out.println("Enter Address");
			String address=sc.nextLine();
			Customer obj=new Customer(id,name,address);
			System.out.println("Customer ID is: "+obj.getCustId());
			System.out.println("Customer Name is: "+obj.getCustName());
			System.out.println("Customer Address is: "+obj.getCustAddress());
			System.out.println("Registration Successful!");
		}
		else if(ch==2) {
			System.out.println("Enter Customer ID");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Customer Name");
			String name=sc.nextLine();
			Customer obj=new Customer(id,name);
			System.out.println("Customer ID is: "+obj.getCustId());
			System.out.println("Customer Name is: "+obj.getCustName());
			System.out.println("Registration Successful!");
		}
		else if(ch==3) {
			System.out.println("Enter Customer ID"); 
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Customer Name");
			String name=sc.nextLine();
			System.out.println("Enter Address");
			String address=sc.nextLine();
			System.out.println("Enter Account Type");
			String acctype=sc.next();
			System.out.println("Enter Customer Balance");
			double bal=sc.nextDouble();
			Customer obj=new Customer(id,name,address,acctype,bal);
			System.out.println("Customer ID is: "+obj.getCustId());
			System.out.println("Customer Name is: "+obj.getCustName());
			System.out.println("Customer Address is: "+obj.getCustAddress());
			System.out.println("Customer Account type is: "+obj.getAccType());
			System.out.println("Customer Balance is: "+obj.getAccType());
			System.out.println("Registration Successful!");
		}
	}
}
class Customer{
	private int custId;
	private String custName;
	private String custAddress;
	private String accType;
	private double custBalance;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	} 
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public double getCustBalance() {
		return custBalance;
	}
	public void setCustBalance(double custBalance) {
		this.custBalance = custBalance;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	
	public Customer(int custId,String custName,String custAddress,String accType,double custBalance) {
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
		this.accType=accType;
		this.custBalance=custBalance;	
	}
	public Customer(int custId,String custName) {
		this.custId=custId;
		this.custName=custName;
	}
	public Customer(int custId,String custName,String custAddress) {
		this.custId=custId;
		this.custName=custName;
		this.custAddress=custAddress;
	}	
} 
