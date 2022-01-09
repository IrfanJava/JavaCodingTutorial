package Array;
import java.util.*;
public class LengthOfLastWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=s.toCharArray();
		int count=0;
		for(int i=s.length()-1;i>=0;i--) {
			if(ch[i]!=' ')
				count++;
			else {
				if(count>0)
					System.out.println(count);
			}
		}
		

	}

}
