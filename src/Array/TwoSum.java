package Array;
import java.util.*;
public class TwoSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int target=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(i+" "+j);
					flag=1;
					break;
				}

			}
		}
		if(flag==0)
			System.out.println("null");
	}

}
