package Array;
import java.util.*;
public class PerfectCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if(isPerfectCube(arr[i])==1) {
				count++;
			}
		}
		System.out.println(count);
		
	}
	public static int isPerfectCube(int n) {
		for(int i=1;i<n;i++) {
			if((i*i*i)==n){
				return 1;
			}
		}
		return 0;
	}

}
