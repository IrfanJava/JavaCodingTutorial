package Mindtree;
import java.util.*;
public class SherlockHomesCode {
	public static int count(int N) {
		int count=0;
		for(int i=0;i<=N;i++) {
			int num=i;
			int sum=0;
			while(num!=0) {
				int r=num%10;
				sum+=r;
				num/=10;
			}
			if(sum%2==0) {
				count++;
			}
		}
		System.out.println();
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int result=count(N);
		System.out.println(result);
		return;

	}
	

}
