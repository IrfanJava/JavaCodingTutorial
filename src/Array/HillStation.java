package Array;
import java.util.*;
public class HillStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int t=sc.nextInt();
		while(t>B-A) {
			t=t-(B-A);
		}
		System.out.println(B-t);
	}

}
