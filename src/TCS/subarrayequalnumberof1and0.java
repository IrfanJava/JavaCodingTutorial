package TCS;
import java.util.*;
public class subarrayequalnumberof1and0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int cnt1=0,cnt0=0;
		for (int i=0; i <n; i++) {
			if(arr[i]==1) {
				cnt1++;
			}
			else if(arr[i]==0) {
				cnt0++;
			}
		}
		if(cnt0==0 || cnt1==0) {
			System.out.println(0);
		}
		else if(cnt0==cnt1) {
			System.out.println(cnt1*2);
		}
		else if(cnt0>cnt1) {
			System.out.println(cnt1*2);
		}
		else if(cnt1>cnt0) {
			System.out.println(cnt0*2);
		}
	}
}
