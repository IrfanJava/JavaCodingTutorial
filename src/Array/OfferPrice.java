package Array;
import java.util.*;
public class OfferPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.matches("[a-zA-Z0-9]{6,8}")) {
			int mrp=Integer.parseInt(s.substring(s.length()-4,s.length()));
			int d=0;
			if(mrp>=1 && mrp<=10) {
				d=0;
			}
			else if(mrp>=11 && mrp<=50) {
				d=5;
			}
			else if(mrp>=51 && mrp<=500) {
				d=15;
			}
			else if(mrp>=501 && mrp<=5000) {
				d=105;
			}
			else if(mrp>=5001) {
				d=1005;
			}
			System.out.println("MRP:Rs "+mrp);
			System.out.println("Offer Price:Rs "+(mrp-d));
			
		}
		else {
			System.out.println("Invalid input");
		}
		
	}

}
