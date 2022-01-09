package Mindtree;
import java.util.*;
public class checkfuntion {
	public static int check(String B[]) {
		int count=0;
		for(int i=0;i<B.length;i++) {
			if(B[i].charAt(0)=='A'||B[i].charAt(0)=='a') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String B[]=new String[N];
		for(int i=0;i<N;i++)
			B[i]=sc.next();
		int result;
		result=check(B);
		System.out.println(result);

	}

}
