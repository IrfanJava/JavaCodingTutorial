import java.util.*;
public class AbsoluteDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of values");
		int n=sc.nextInt();
		int sum=0;
		int diff;
		if(n>0 && n%2==0) {
			int arr[]=new int[n];
			System.out.println("Enter the numbers");
			for(int i=0;i<n;i++) {
				int k=sc.nextInt();
				if(k>=0) {
					arr[i]=k;
				}
				else {
					System.out.println(k+" is an invalid number");
				}
			}
			for(int i=0;i<n/2;i++) {
				diff=Math.abs(arr[i]-arr[n-1-i]);
				sum+=diff;
			}
			System.out.println(sum);
		}
		else {
			System.out.println(n+" is an invalid size");
		}
	}

}
