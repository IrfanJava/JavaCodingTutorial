package Mindtree;
import java.util.*;
public class AlternateSum {
	public static int count(int X) {
		int sum=0;
		int count=0;
		for(int i=0;i<=X && sum!=X;) {
			sum+=i;
			count++;
			i=i+2;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int X;
		X=scan.nextInt();
		int result;
		result=count(X);
		System.out.println(result);
	}

}
