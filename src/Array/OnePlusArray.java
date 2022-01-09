package Array;
import java.util.*;
public class OnePlusArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int curry=1;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]+curry!=10) {
				arr[i]=arr[i]+curry;
				curry=0;
			}
			else if(arr[i]+curry==10) {
				arr[i]=0;
			}
		}
		if(curry==1) {
			int arr1[]=new int[n+1];
			arr1[0]=curry;
			curry=0;
			int temp=0;
			for(int i=arr1.length-1;i>=1;i--) {
				arr1[i]=arr[temp];
				temp++;
			}
			for(int j=0;j<arr1.length;j++)
				System.out.print(arr1[j]+" ");
			
		}
		else {
			for(int j=0;j<arr.length;j++)
				System.out.print(arr[j]+" ");
		}

	}

}
