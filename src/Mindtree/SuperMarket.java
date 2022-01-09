package Mindtree;
import java.util.*;
public class SuperMarket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int item_id[]= {5001,5002,5003,5004,5005,5006,5007,5008,5009,50010};
		double prices[]= {24.5,80.0,45.56,99.0,140.0,34.0,450.56,67,320,560};
		System.out.println("Enter Purchase Item ID:");
		int n=sc.nextInt();
		System.out.println("Enter Quantity Required:");
		int Q=sc.nextInt();
		double amt=0.0;
		for(int i=0;i<10;i++) {
			if(item_id[i]==n) {
				amt=prices[i]*Q;
				System.out.println("Bill ID: "+random.nextInt(100));
				System.out.println("Purchase ID: "+item_id[i]);
				System.out.println("Quantity purchased: "+Q);
				System.out.println("Discount: null");
				System.out.println("Total Bill Amount: "+amt);
			}
		}
	}
}
