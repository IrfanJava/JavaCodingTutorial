package Array;
import java.util.*;
public class BestTimeToSellAndBuy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int buyAt=arr[0];
		int maxprofit=0;
		for(int i=1;i<n;i++) {
			maxprofit=Math.max(maxprofit, arr[i]-buyAt);
			if(buyAt>arr[i])
				buyAt=arr[i];
		}
		System.out.println(maxprofit);
	}

}
