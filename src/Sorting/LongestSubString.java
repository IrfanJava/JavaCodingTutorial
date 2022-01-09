package Sorting;
import java.util.*;
public class LongestSubString {
	  public static int findspecial(int n)
	  {
	    ArrayList<Integer> ans = new ArrayList<Integer>();
	    for (int i = 0; i < 6; i++)
	      ans.add(i);
	    for (int i = 0; i <= n / 6; i++)
	      for (int j = 0; j < 6; j++)
	        if ((ans.get(i) * 10) != 0)
	          ans.add(ans.get(i) * 10 + ans.get(j));
	    return ans.get(n - 1);
	  }
	  public static void main(String[] args)
	  {
		Scanner sc=new Scanner(System.in);
	    int n = sc.nextInt();
	    int ans = findspecial(n);
	    System.out.println(ans);
	  }
}
