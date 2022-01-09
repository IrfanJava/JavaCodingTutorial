package Sorting;
import java.util.*;
public class Reversingwordsinstring {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String s=obj.nextLine();
		StringBuffer sb=new StringBuffer();
		char ch[]=s.toCharArray();
		int i=s.length()-1,j;
		while(i>=0) {
			if(ch[i]==' ') {
				i--;
			}
			else {
				j=i;
				while(i>=0 && ch[i]!=' ') {
					i--;
				}
				if(sb.length()>0) {
					sb.append(' ');
				}
				for(int k=i+1;k<=j;k++) {
					sb.append(ch[k]);
				}
				
			}
		}
		System.out.print(sb.toString());
	}

}
