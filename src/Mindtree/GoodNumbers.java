package Mindtree;
import java.util.*;
public class GoodNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		boolean flag=false;
		int k=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=arr[i];
		int avg=sum/n;
		
		if(avg>=k) {
			System.out.println(n);
			flag=true;
		}
		else {
			int sum1=0;
			int count=0;
			for(int i=0;i<n;i=i+2) {
				sum1+=arr[i];
				count++;
			}
			int avg1=sum1/count;
			
			if(avg1>=k) {
				System.out.println(count);
				flag=true;
			}
		}
		if(flag)
			return;
		else
			System.out.println(-1);

	}

}
