package Array;
import java.util.*;
public class MinimumProductSuminArray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(printMinimumProduct(arr,n));
	
	}
    static int printMinimumProduct(int arr[], int n)
    {
    	int min=arr[0]*arr[1];
    	int minSum=arr[0]+arr[1];
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        		if(arr[i]*arr[j]<min) {
        			min=arr[i]*arr[j];
        			minSum=+arr[i]+arr[j];
        		}
        	}
        }
        return minSum;
        
    }

}
