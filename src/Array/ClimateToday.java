package Array;
import java.util.*;
public class ClimateToday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int l=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(!(arr[i]>=r && arr[i]<=l)) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
