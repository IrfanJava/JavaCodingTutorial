package TCS;
import java.util.*;
public class MaximumCouponCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		int o=sc.nextInt();
		int count=0;
		while(c!=0) {
			count=count+c;
			c=c/o;
		}
		System.out.println(count);
	}

}
