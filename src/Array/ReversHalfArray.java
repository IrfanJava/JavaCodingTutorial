package Array;
import java.util.*;
public class ReversHalfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int nl=n-n/2;
		int t=0,c=0,d=0;
		int tmp[]=new int[nl];
		for(int i=n/2;i<n;i++) {
			tmp[t]=arr[i];
			t++;
		}
		for(int i=nl-1;i>=0;i--) {
			tmp[c]=tmp[i];
			c++;
		}
		for(int i=n/2;i<n;i++) {
			arr[i]=tmp[d];
			d++;
		}
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}

}
