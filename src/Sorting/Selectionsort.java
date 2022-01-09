package Sorting;
import java.util.*;
public class Selectionsort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int min;
		int arr[]=new int[n];
		int temp;
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[min]>arr[j])
					min=j;
			}
			temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.printf("%d ",arr[i]);

	}

}
