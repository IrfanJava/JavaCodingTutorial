package Sorting;
import java.util.*;
public class subsetofstring {//this is code for Longest Palindromic subset in string//
	static int isPalindrome(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
			return 1;
		else
			return 0;
			
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine().trim();
		ArrayList<String> list=new ArrayList<>();
		int temp=0;
		int n=s.length();
		String arr1[]=new String[n*(n+1)/2];
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				arr1[temp]=s.substring(i,j+1);
				temp++;
			}
		}
		for(int i=0;i<arr1.length;i++) {
			if(isPalindrome(arr1[i])==1) {
				list.add(arr1[i]);
			}
		}
		
		int l=list.get(0).length();
		for(int i=0;i<list.size();i++) {
			if(l<list.get(i).length())
				l=list.get(i).length();
			
		}
		for(int i=0;i<list.size();i++) {
			if(l==list.get(i).length())
				System.out.println(list.get(i));
		}
		
		

	}

}
