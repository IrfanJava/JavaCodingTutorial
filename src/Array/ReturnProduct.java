package Array;
import java.util.*;
public class ReturnProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				int e=sc.nextInt();
				if(e>0)
					arr[i]=e;
				else {
					System.out.println(+e+" is an invalid element");
					return;
				}
			}
			int prod=1;
			for(int i=0;i<n;i++) {
				if(isPrime(arr[i])==1) {
					prod=prod*arr[i];
				}
			}
			System.out.println(prod);
		}
		else {
			System.out.println(+n+" is an invalid array size");
		}
	}
	public static int isPrime(int n) {
		int flag=0;
		if(n<2)
			return 0;
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			return 1;
		}
		return 0;
	}

}
