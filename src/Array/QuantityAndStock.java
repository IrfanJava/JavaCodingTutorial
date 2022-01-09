package Array;
import java.util.*;
public class QuantityAndStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int Item_No[]=new int[n];
		String Item_Name[]=new String[n];
		int price[]=new int[n];
		int stock[]=new int[n];
		for(int i=0;i<n;i++)
			Item_No[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			Item_Name[i]=sc.next();
		for(int i=0;i<n;i++)
			price[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			stock[i]=sc.nextInt();
		int no=sc.nextInt();
		int qty=sc.nextInt();
		float amt=0;
		for(int i=0;i<Item_No.length;i++) {
			if(Item_No[i]==no) {
				if(stock[i]>qty) {
					stock[i]=stock[i]-qty;
					amt=qty*price[i];
				}
				System.out.printf("Total Price is %.1f\n",amt);
				System.out.println("Quantity Left "+stock[i]);
				break;
			}
			else if(stock[i]>qty) {
				System.out.println("NO STOCK");
				System.out.println("Quantity Left "+stock[i]);
				break;
			}
		}
	}

}
