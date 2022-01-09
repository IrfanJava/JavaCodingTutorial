package Zenser;
import java.util.*;
public class Tiles {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(find_mistake(arr));
	}
	public static int find_mistake(int [] nums) {
		int d=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==nums[i+1]) {
				d=nums[i];
				break;
			}
		}
		System.out.println(d);
		int m=0;
		for(int i=1;i<=nums.length;i++) {
			if(nums[i]!=i) {
				m=i;
				break;
			}
		}
		System.out.println(m);
		return m+d;
	}
}
