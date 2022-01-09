package Mindtree;
import java.util.*;
public class ReversingEveryWordinString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
			if(str[i].matches("[ A-Za-z]+")){
				str[i]=reverse(str[i]);
			}
		}
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+" ");
		}

	}
	static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
	}

}
