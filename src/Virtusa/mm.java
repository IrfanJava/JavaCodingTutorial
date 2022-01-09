package Virtusa;
import java.util.*;
public class mm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		mm o=new mm();
		int res=o.minstars(n,arr);
		System.out.println(res);
		

	}
	public int minstars(int input1,int[] input2) {
		int count=0;
		for(int i=0;i<input1;i++) {
			for(int j=i+1;j<input1;j++) {
				if(input2[i]==input2[j]) {
					input2[i]+=1;
					count++;
				}
			}
		}
		return count;
	}

}
