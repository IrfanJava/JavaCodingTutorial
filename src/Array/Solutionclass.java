package Array;
import java.util.*;
public class Solutionclass {
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result=FindNumberOfSuperiorElements(arr);
		System.out.println(result);
	}
	static int FindNumberOfSuperiorElements(int[] arr) {
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			int flag=1;
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]<=arr[j])) {
					flag=0;
					break;
				}
			}
			if(flag==1)
				count++;
		}
		return count;
	}
}
