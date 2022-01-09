package Array;
import java.util.*;
public class ApplicationID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		char ch[]={' ','A','B','C','D','E','F','G','H','I','J','K','L','M',
				'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		if(sum<=26) {
			System.out.println(ch[sum]);
		}
		else {
			int sum2=0;
			while(sum!=0) {
				sum2+=sum%10;
				sum/=10;
			}
			System.out.println(ch[sum2]);
		}
	}


}
