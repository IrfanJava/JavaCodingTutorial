package Virtusa;
import java.util.*;
public class LongestCommonSubsequencewithOnlyVowels {
	static boolean isVowel(char ch)
	{
	    if (ch == 'a' || ch == 'e' ||
	        ch == 'i' || ch == 'o' ||
	        ch == 'u')
	        return true;
	    return false;
	}	 
	int maxlen(String input1, String input2)
	{
		int m=input1.length();
		int n=input2.length();
	    int L[][] = new int[m + 1][n + 1];
	    int i, j;
	    for (i = 0; i <= m; i++)
	    {
	        for (j = 0; j <= n; j++)
	        {
	            if (i == 0 || j == 0)
	                L[i][j] = 0;
	            else if ((input1.charAt(i - 1) == input2.charAt(j - 1)) && isVowel(input1.charAt(i - 1)))
	                L[i][j] = L[i - 1][j - 1] + 1;
	            else
	                L[i][j] = Math.max(L[i - 1][j],
	                                   L[i][j - 1]);
	        }
	    }
	    return L[m][n];
	}
	public static void main(String[] args)
	{
		LongestCommonSubsequencewithOnlyVowels obj=new LongestCommonSubsequencewithOnlyVowels();
		Scanner sc=new Scanner(System.in);
	    String X = sc.nextLine();
	    String Y = sc.nextLine();
	    System.out.println(obj.maxlen(X,Y));
	}

}
