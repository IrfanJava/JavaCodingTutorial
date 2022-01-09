package Array;
import java.util.*;
public class ListOfPrimeNumbersInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		if(m>0 && n>0) {
			if(m>n) {
				System.out.println("Invalid Input");
				return;
			}
			else {
				for(int i=m;i<=n;i++) {
					if(isPrime(i)==1) {
						System.out.print(i+" ");
					}
				}
			}
		}
		else {
			System.out.println("Negative integers cannot be prime");
			return;
		}
	}
	public static int isPrime(int n) {
		int flag=0;
		if(n<2) {
			return 0;
		}
		for(int i=2;i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			return 1;
		}
		return 0;
	}

}
