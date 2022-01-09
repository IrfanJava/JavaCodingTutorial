package Array;
import java.util.Arrays;
import java.util.*;
public class TwoSum2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> map =new LinkedHashMap<>();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int target=sc.nextInt();
		for(int i:arr) {
			int com=Math.abs(target-arr[i]);
			if(map.containsKey(com)) {
				System.out.println(map.get(com)+" "+i);
			}
			else
				map.put(arr[i], i);
		}

	}

}
