package Wipro;
import java.util.*;
public class CheckifNequalToSumofDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0) {
			int n=sc.nextInt();
			int sum=0;
			for(int i=1;i<n;i++) {
				if(n%i==0) {
					sum+=i;
				}
			}
			if(sum==n) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			t--;
		}
		

	}

}
