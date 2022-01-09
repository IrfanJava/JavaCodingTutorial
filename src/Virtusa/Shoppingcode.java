package Virtusa;

import java.util.Scanner;

public class Shoppingcode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Shoppingcode obj=new Shoppingcode();
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		for(int i=0;i<n;i++)
			arr1[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			arr2[i]=sc.nextInt();
		System.out.println(obj.shopping(n, arr1, arr2));

	}
	public int shopping(int input1,int[] input2,int[] input3) {
		int count=0;
		for(int i=0;i<input1;i++) {
			if(input2[i]>input3[i]) {
				count++;
			}
		}
		return count;
	}

}
