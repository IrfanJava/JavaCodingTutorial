package package2;
import java.util.*;
public class Main { 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Customer1 :");
		System.out.print("Id:\n");
		long id=sc.nextLong();
		sc.nextLine();
		System.out.print("Name:");
		String name=sc.nextLine();
		System.out.print("Gender:");
		char gender=sc.next().charAt(0);
		System.out.print("Email:");
		String email=sc.next();
		System.out.print("contact number:");
		String no=sc.next();
		
		Customer obj1=new Customer(id,name,gender,email,no);
		System.out.println();
		System.out.println("Customer2 :");
		System.out.print("Id:");
		long id2=sc.nextLong();
		sc.nextLine();
		System.out.print("Name:");
		String name2=sc.nextLine();
		System.out.print("Gender:");
		char gender2=sc.next().charAt(0);
		System.out.print("Email:");
		String email2=sc.next();
		System.out.print("contact number:");
		String no2=sc.next();
		
		Customer obj2=new Customer(id2,name2,gender2,email2,no2);
		
		if(obj1.equals(obj2)) {
			System.out.println("Customer 1 and Customer 2 are same");
		}
		else {
			System.out.println("Customer 1 and Customer 2 are different");
		}
	}
 
}
