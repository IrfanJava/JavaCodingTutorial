package Virtusa;
import java.util.*;
public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		check obj=new check();
		System.out.println(obj.checkConsecutive(n, arr));

	}
	public int checkConsecutive(int input1,int[] input2) {
		Arrays.sort(input2);
		int flag=1;
		for(int i=0;i<input2.length-1;i++) {
			if(input2[i]!=input2[i+1]-1) {
				flag=0;
				break;
			}
		}
		if(flag==0) {
			return 0;
		}
		return 1;
	}
	

}
