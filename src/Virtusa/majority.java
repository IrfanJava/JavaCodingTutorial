package Virtusa;
import java.util.*;
public class majority {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		majority o=new majority();
		System.out.println(o.majority1(n,arr));
		
		

	}
	public int majority1(int input1,int[] input2) {
		int h=input1/2;
		int flag=0;
		for(int i=0;i<input1;i++) {
			int count=0;
			for(int j=i+1;j<input1;j++) {
				if(input2[i]==input2[j]) {
					count++;
				}
				if(count>h/2) {
					flag=1;
					return input2[i]; 
				}
			}
		}
		if(flag==0)
			return -1;
		return 1;

	}

}
