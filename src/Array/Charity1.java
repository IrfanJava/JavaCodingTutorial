package Array;
import java.util.*;
public class Charity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Charity1 obj =new Charity1();
		int n=sc.nextInt();
		System.out.println(obj.charity(n));

	}
	public int charity(int input1) {
		int sum=0;
		for(int i=1;i<=input1;i++) {
			sum+=i*i;
		}
		return sum;
	}

}
