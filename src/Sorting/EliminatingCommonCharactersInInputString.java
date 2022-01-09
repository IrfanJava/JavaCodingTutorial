package Sorting;
import java.util.*;
public class EliminatingCommonCharactersInInputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String res="";
		for(int i=0;i<s1.length();i++) {
			if(!s2.contains(s1.charAt(i)+"")&&!s1.contains(s2.charAt(i)+"")) {
				res+=s1.charAt(i);
				res+=s2.charAt(i);
			}
			else if(!s2.contains(s1.charAt(i)+"")){
				res+=s1.charAt(i);
			}
			else if(!s1.contains(s2.charAt(i)+"")) {
				res+=s2.charAt(i);
			}
		}
		System.out.println(res);

	}

}
