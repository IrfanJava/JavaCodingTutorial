package Array;
import java.util.*;
public class Ratingscore {
    public static int countsubarray(int[] nums, int k) {
        int begin = 0, end = 0, product = 1, ans = 0;
        while(end < nums.length) {
            product *= nums[end++]; // Move end forward to make it invalid
            while(product >= k && begin < end) // Move begin forward to make it valid
                product /= nums[begin++];
            ans += end - begin; // Update after moving begin cause we are finding all the valid solution
        }
        return ans;
    }

    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	for(int i=0;i<n;i++) {
    		int N=sc.nextInt();
    		int arr[]=new int[N];
    		int k =sc.nextInt();
    		for(int j=0;j<N;j++)
    			arr[j]=sc.nextInt();
    		int count = countsubarray(arr, k);
    		System.out.println(count);
    	}
    }
}
