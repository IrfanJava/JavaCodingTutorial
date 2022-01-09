package Mindtree;

import java.util.Scanner;

public class tripletaverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n-2;i++) {
			int res=arr[i]+arr[i+1]+arr[i+2];
			if(res%3==0)
				sum++;	
		}
		System.out.println(sum);

	}

}
