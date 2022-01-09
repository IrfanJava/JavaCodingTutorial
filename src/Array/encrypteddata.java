package Array;
import java.util.*;
public class encrypteddata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char ch[]=s.toCharArray();
		int l;
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(ch[i])) {
				l=ch[i];
				l+=n;
				if(Character.isUpperCase(ch[i])) {
					if(l<65) {
						l+=26;
					}
					else if(l>90) {
						l-=26;
					}
				}
				else if(Character.isLowerCase(ch[i])) {
					if(l<97) {
						l+=26;
					}
					else if(l>122) {
						l-=26;
					}
				}
				ch[i]=(char)l;
			}
			else if(Character.isDigit(ch[i])) {
				l=ch[i];
				l+=n+1;
				ch[i]=(char)l;
			}
		}
		for(int i=0;i<ch.length;i++)
			System.out.print(ch[i]);
	}

}
