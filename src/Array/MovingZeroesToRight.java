package Array;

import java.util.Scanner;

public class MovingZeroesToRight {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int current=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				arr[current]=arr[i];
				current++;
			}
		}
		for(int i=current;i<n;i++)
			arr[i]=0;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		
	}


}
