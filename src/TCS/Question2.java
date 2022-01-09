package TCS;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			int temp=s.charAt(i)-'a';
			temp=26-temp;
			System.out.print((char)(temp+96));
		}
	}
}
