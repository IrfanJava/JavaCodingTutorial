package Mindtree;
import java.util.*;
public class diffbetweenMaxandMinPrime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<>();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(isPrime(arr[i])==1) {
				list.add(arr[i]);
			}
		}
		Collections.sort(list);
		int max1=list.get(list.size()-1);
		int min1=list.get(0);
		System.out.println(max1-min1);
	}
	public static int isPrime(int n) {
	      int flag=0;
	      if(n==0)
	    	  return 0;
	      if(n<0)
	    	  return 0;
	      for(int i=2;i<=n/2;i++){
	          if(n%i==0){
	              flag=1;
	              break;
	          }
	      }
	      if(flag==1)
	          return 0;
	      return 1;
	}

}
