package Mindtree;
import java.util.*;
public class check2 {
	
	public static int check(int[] A) {
		int sum=0;
		for(int i=0;i<A.length;i++) {
			sum+=(A[i]*(A[i]+1));
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N=scan.nextInt();
		int A[]=new int[N];
		for(int i=0;i<N;i++) {
			A[i]=scan.nextInt();
		}
		int result;
		result=check(A);
		System.out.println(result);

	}

}
