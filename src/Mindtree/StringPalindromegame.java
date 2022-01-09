package Mindtree;
import java.util.*;
public class StringPalindromegame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine().trim();
		int score=0;
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
			if(isPalindrome(arr1[i]) && arr1[i].length()==5) {
				score+=10;
			}
			else if(isPalindrome(arr1[i]) && arr1[i].length()==4) {
				score+=5;
			}
		}
		System.out.println(score);
	}
	public static boolean isPalindrome(String s){
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		if(rev.equals(s))
			return true;
		else
			return false;
	}
}
