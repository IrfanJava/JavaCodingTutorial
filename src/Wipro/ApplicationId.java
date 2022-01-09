package Wipro;
import java.util.*;
public class ApplicationId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		if(sum<=26) {
			System.out.println((char)(sum+64));
		}
		else {
			int sum2=0;
			while(sum!=0) {
				sum2+=sum%10;
				sum/=10;
			}
			System.out.println((char)(sum2+64));
		}
	}
}
