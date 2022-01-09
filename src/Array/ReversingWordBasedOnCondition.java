package Array;
import java.util.*;
public class ReversingWordBasedOnCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str[]=s.split(" ");
		int flag=0;
		if(str.length>=3) {
			for(int i=0;i<str.length;i++) {
				if(str[i].matches("[a-zA-z]*")) {
					continue;
				}
				else {
					System.out.println("Invalid word");
					return;
				}
			}
			for(int i=0;i<str.length-1;i++) {
				if(!((str[i].charAt(0)+"").equalsIgnoreCase(str[i+1].charAt(0)+""))) {
					flag=1;
					break;
				}
			}
			String s1=str[0];
			String s2=str[str.length-1];
			if(flag==1) {
				String res=reverse(s1)+s2;
				System.out.println(res);
			}
			else if(flag==0) {
				String res=reverse(s2)+s1;
				System.out.println(res);
			}
		}
		else {
			System.out.print("Invalid sentence");
		}
	}
	public static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
		return rev;
	}

}
