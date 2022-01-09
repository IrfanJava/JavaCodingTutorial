package Mindtree;
import java.util.*;
public class Democustomer {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Customers");
		int n=sc.nextInt();
		Customer1 customers[]=new Customer1[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Customer Name:");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter Customer Mobile No:");
			String no=sc.nextLine();
			System.out.println("Enter Rating given by Customer:");
			double rating=sc.nextDouble();
			customers[i]=new Customer1(name,no,rating);
		}
		for(int i=0;i<n;i++) {
			System.out.println("Customer Name is");
			System.out.println(customers[i].getName());
			System.out.println("Customer Mobile No is");
			System.out.println(customers[i].getMobileNo());
			System.out.println("Rating given by customer is");
			System.out.println(customers[i].getFeedbackRating());
		}
	}
}
class Customer1{
	private String name;
	private String mobileNo;
	private double feedbackRating;
	public Customer1(String name, String mobileNo, double feedbackRating) {
		this.name = name;
		this.mobileNo = mobileNo;
		this.feedbackRating = feedbackRating;
	}
	public Customer1() {
	}
	public String getName() {
		return name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public double getFeedbackRating() {
		return feedbackRating;
	}	
} 
