package Mindtree;
import java.util.*;
public class Countingpresort {
	public static int countPreSorted(int [] arr) {
		int tr[]=Arrays.copyOf(arr, arr.length);
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==tr[i]) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int array_length = scan.nextInt();
		int arr[]=new int[array_length];
		for(int j=0;j<array_length;j++) {
			arr[j]=scan.nextInt();
		}
		int result;
		result=countPreSorted(arr);
		System.out.println(result);
		return;

	}

}
