package javaDeveloperCourse;
import java.util.*;
public class ReversingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int res[]=new int[10];
		for(int i=0;i<10;i++)
			arr[i]=sc.nextInt();
		int temp=0;
		for(int i=9;i>=0;i--) {
			res[temp]=arr[i];
			temp++;
		}
		System.out.println("After Reversing:");
		for(int j:res)
			System.out.print(j+" ");
	}

}
