package Array;
import java.util.*;
public class MissingDissapearedNumber {
	static int linearsearch(int arr[],int key) {
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				flag=1;
			}
		}
		if(flag==0)
			return 0;
		else
			return 1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int fin=1;
		for(int i=0;i<n;i++) {
			if(linearsearch(arr,fin)==0) {
				list.add(fin);
			}				
			fin++;
		}
		System.out.println(list);
			
	}

}
