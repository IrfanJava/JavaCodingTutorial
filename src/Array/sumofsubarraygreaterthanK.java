package Array;
import java.util.*;
public class sumofsubarraygreaterthanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int Windowsum=0;
		int high=0;
		
		for(int low=0;low<n;low++) {
			while(Windowsum<k && high<n) {
				Windowsum+=arr[high];
				high++;
			}
			if(Windowsum==k) {
				System.out.println(arr[low]+" , "+arr[(high-1)]);
				return;
			}
			Windowsum-=arr[low];
		}
	}

}
