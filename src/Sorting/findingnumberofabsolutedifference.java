package Sorting;
import java.util.*;
import java.lang.Math;
public class findingnumberofabsolutedifference {
	static int FindCount(int arr[],int length,int num,int diff) {
		int count=0;
		for(int i=0;i<length;i++) {
			if(Math.abs(arr[i]-num)<=diff)
				count++;
		}
		if(count>0)
			return count;
		else
			return -1;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int num=sc.nextInt();
		int diff=sc.nextInt();
		int length=arr.length;
		int res=FindCount(arr,length,num,diff);
		System.out.println(res);
	}

}
