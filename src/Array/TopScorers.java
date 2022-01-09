package Array;
import java.util.*;
public class TopScorers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TopScorers obj=new TopScorers();
		
		int sum=0;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println(obj.marathon(n, k, arr));
		
		
	}
	public int marathon(int input1,int input2,int[] input3) {
		int temp;
		int sum=0;
		for(int i=0;i<input1;i++) {
			for(int j=i+1;j<input1;j++) {
				if(input3[j]>input3[i]) {
					temp=input3[j];
					input3[j]=input3[i];
					input3[i]=temp;
				}
			}
		}

		for(int i=0;i<input2;i++)
			sum+=input3[i];
		return sum;
	}

}
