package Mindtree;
import java.util.*;
public class ComputeInitials {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		char ch[]=name.toCharArray();
		String res="";
		for(int i=0;i<name.length();i++) {
			if(Character.isUpperCase(ch[i])) {
				res+=ch[i];
			}
		}
		System.out.println(res);
	} 
}
