package Array;
import java.util.*;
public class MergeTwoSortedArray {
	static int[] MergeSortArray(int m,int arr1[],int n,int arr2[]) {
		int temp=0;
		int arr3[]=new int[m+n];
		for(int i=0;i<m;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=m;i<m+n;i++) {
			arr3[m]=arr2[temp];
			temp++;
		}
		Arrays.sort(arr3);
		return arr3;
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr1[]=new int[m];
		int arr2[]=new int[n];
		for(int i=0;i<m;i++)
			arr1[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			arr2[i]=sc.nextInt();
		int res[]=MergeSortArray(m,arr1,n,arr2);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
		
	}

}

