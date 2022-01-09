package Array;
import java.util.*;
public class PrefixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int sum=0;
		int b[]=new int[n];
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
			b[i]=sum;
		}
		for(int i=0;i<n;i++)
			System.out.print(b[i]+" ");
		

	}

}
