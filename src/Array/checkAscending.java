package Array;
import java.util.*;
public class checkAscending {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		if(n>=2 && n<=10) {
			int arr[]=new int[n];
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			int flag=0;
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if(arr[i]>arr[j]) {
						flag=1;
						break;
					}
				}
			}
			if(flag==0) {
				for(int i=0;i<n;i++) {
					if(i==n-1)
						System.out.print(+arr[i]+" are in ascending order");
					else
						System.out.print(+arr[i]+" ");
				}
			}
			else if(flag==1) {
				for(int i=0;i<n;i++) {
					if(i==n-1)
						System.out.print(+arr[i]+" are not in ascending order");
					else
						System.out.print(+arr[i]+" ");
				}
			}
		}
		else {
			System.out.println("Invalid array size");
		}
	}
	
}
