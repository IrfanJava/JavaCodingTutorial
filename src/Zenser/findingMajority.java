package Zenser;
import java.util.*;
public class findingMajority {
	public static int findMajority(int arr[],int N) {
		int res=0;
		int h=N/2;
		Arrays.sort(arr);
		for(int i=0;i<N;i++) {
			int count=0;
			for(int j=i+1;j<N;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				if(count>h/2) {
					res=arr[i]; 
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++)
			arr[i]=sc.nextInt();
		System.out.println(findMajority(arr,N));
			

	}

}
