package Array;
import java.util.*;
public class CombineNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0) {
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				int m=sc.nextInt();
				if(m>0)
					arr[i]=m;
				else
					System.out.println("Invalid Input");
			}
			int flag=0;
			for(int i=0;i<n;i++) {
				if(arr[i]%2!=0) {
					System.out.print(arr[i]);
					flag=1;
				}
				
			}
			if(flag==0)
				System.out.println("No odd numbers");
		}
		else {
			System.out.println("Invalid size");
		}
	}

}
