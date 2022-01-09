package Sorting;
import java.util.*;
public class decrypting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int pos=sc.nextInt();
		decrypting obj =new decrypting();
		System.out.println(obj.characterAt(s, pos));

	}
	public String characterAt(String input1,int input2) {
		int n;
		String res="";
		char ch[]=input1.toCharArray();
		for(int i=0;i<input1.length();i++) {
			if(Character.isDigit(ch[i])) {
				char c=ch[i-1];
				n=Integer.parseInt(String.valueOf(ch[i]));
				for(int j=0;j<n;j++) {
					res=res+c;
				}
			}
		}
		if(input2<=res.length())
			return res.charAt(input2-1)+"";
		else
			return "-1";
		
	}

}
