import java.util.*;
public class Summation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		if(n>=1 && n<=10) {
			int arr1[]=new int[n];
			int arr2[]=new int[n];
			System.out.println("Enter the elements in first array");
			for(int i=0;i<n;i++)
				arr1[i]=sc.nextInt();
			System.out.println("Enter the elements in second array");
			for(int i=0;i<n;i++)
				arr2[i]=sc.nextInt();
			int arr3[]=new int[n];
			int flag=0;
			for(int i=0;i<n;i++) {
				if(arr1[i]%2==0 && arr2[i]%2==0) {
					arr3[i]=arr1[i]+arr2[i];
					flag=1;
				}
				else if(arr1[i]%2==0 && arr2[i]%2!=0 || arr1[i]%2!=0 && arr2[i]%2==0)
					flag=1;
			}
			if(flag==0) {
				System.out.println("There are no even elements in the arrays");
			}
			else if(flag==1) {
				for(int i=0;i<n;i++) {
					System.out.println(arr3[i]);
				}
			}	
		}
		else {
			System.out.println(n+" is an invalid array size");
		}
		

	}

}
