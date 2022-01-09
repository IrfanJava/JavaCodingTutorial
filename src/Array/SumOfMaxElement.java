package Array;
import java.util.*;
public class SumOfMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<5) {
			System.out.println("Array size "+n+" is too low");
			return;
		}
		if(n>10) {
			System.out.println("Array size "+n+" is too high");
		}
		else {
			int flag=0;
			int arr[]=new int[10];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			for(int i=1;i<n;i++) {
				if(arr[0]!=arr[i])
					flag=1;
				
			}
			if(flag==0)
				System.out.println("All the elements in the array are equal");
			else {
				int max=arr[0];
				int index=0;
				for(int i=0;i<n;i++) {
					if(max<arr[i]) {
						max=arr[i];
						index=i;
					}
				}
				for(int i=0;i<n;i++) {
					System.out.println((arr[i]+index));
				}
			}
		}
	}

}
