package Sorting;
import java.util.Scanner;
public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j;
		int temp;
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=1;i<n;i++) {
			temp=arr[i];
			j=i-1;
			while(j>=0 && temp<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" "); 
	}

}
