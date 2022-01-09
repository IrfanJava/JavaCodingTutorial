package Array;
import java.util.*;
public class Manchester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		List<Integer> list=new ArrayList<>();
		int t=1;
		int res[]=new int[n];
		res[0]=arr[0]^0;
		for(int i=1;i<n;i++) {
			res[i]=arr[i]^arr[i-1];
		}
		for(int i=0;i<n;i++)
			System.out.print(res[i]+" ");
		
	}

}
