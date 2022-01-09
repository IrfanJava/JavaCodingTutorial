package TCS;
import java.util.*;
public class AtheleteRunCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int res=1,count;
		while(res!=0) {
			int temp=res;
			for(int i=0;i<n;i++) {
				temp=temp+arr[i];
				if(temp<=0) {
					res++;
					break;
				}
			}
			System.out.println(res);
			break;
		}
		
	}

}
