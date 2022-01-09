package Array;
import java.util.*;
public class DiwaliLightBulbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int temp=0,maxcount;
		int flag=0;
		List<Integer> list1=new ArrayList<>();
		for(int i=0;i<n;i++) {
			if(i!=0 && flag==1) {
				arr[temp]=0;
			}
			if(arr[i]==0) {
				arr[i]=1;
				temp=i;
				flag=1;
			}
			maxcount=CountConsecutiveones(arr);
			System.out.println(maxcount);
			list1.add(maxcount);	
		}
		System.out.println(Collections.max(list1));

		
	}
	static int CountConsecutiveones(int arr[]) {
		int count=0;
		List<Integer> list =new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
			}
			else if(arr[i]==0) {
				list.add(count);
				count=0;
			}
		}
		int res=Collections.max(list);
		return res;
		
	}

}
