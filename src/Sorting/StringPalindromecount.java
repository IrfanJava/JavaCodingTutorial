package Sorting;
import java.util.*;
public class StringPalindromecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringPalindromecount obj=new StringPalindromecount();
		String s=sc.nextLine();
		int n=sc.nextInt();
		System.out.println(obj.countPalindromes(s,n));
		
	}
	public int countPalindromes(String input1,int input2) {
		String str[]=input1.split(" ");
		int count=0;
		for(int i=0;i<str.length;i++) {
			if(isPalindrome(str[i])==1) {
				count++;
			}
		}
		return count;
		
	}
	public static int isPalindrome(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if(rev.equals(s))
			return 1;
		else
			return 0;
	}

}
