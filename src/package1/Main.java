package package1;
 
import java.util.Scanner;
 
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Customer obj=new Customer();
		System.out.println("Enter Customer Details:");
		System.out.print("ID:");
		long id=sc.nextLong();
		System.out.print("Name:");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.print("Gender:");
		char gender=sc.next().charAt(0);
		System.out.print("Email:");
		String email=sc.next();
		System.out.print("Contact number:");
		String no=sc.next();
		
		obj.setId(id);
		obj.setName(name);
		obj.setGender(gender);
		obj.setEmail(email);
		obj.setContactNumber(no);
		
		System.out.println("Customer id "+obj.getId());
		String res=obj.toString();
		System.out.println("Customer contact details:"+res);
	}
}
class Customer{
	private long id;
	private String name;
	private char gender;
	private String email;
	private String contactNumber; 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() { 
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Customer() {
	}
	public String toString() {
		System.out.println("Customer: "+name);
		return contactNumber+", "+email;
	}
}
