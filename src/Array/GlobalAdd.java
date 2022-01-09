package Array;
import java.util.*;
public class GlobalAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0,rem;
		while(n>0) {
			rem=n%10;
			if(rem%2==0) {
				sum+=rem;
			}
			n=n/10;
			
		}
		System.out.println(sum);
	}

}
