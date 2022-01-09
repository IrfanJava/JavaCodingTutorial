package Mindtree;
import java.util.*;
public class runnerup {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(runnerUp(n,arr));
	}
	public static String runnerUp(int n,int arr[]) {
		int ans=0;
		int B[]=Arrays.copyOf(arr, n);
		Arrays.sort(arr);
		int runner=arr[n-2];
		for(int i=0;i<n;i++) {
			if(runner==B[i])
				ans=i+1;
		}
		
		return String.valueOf(ans);
	}

}
