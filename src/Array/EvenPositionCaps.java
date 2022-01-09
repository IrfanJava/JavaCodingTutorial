package Array;
import java.util.*;
public class EvenPositionCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.matches("[a-zA-Z]*") && s.length()>=5 && s.length()<=20) {
			String ch[]=s.split("");
			for(int i=0;i<s.length();i++) {
				if((i+1)%2==0) {
					ch[i]=ch[i].toUpperCase();
				}
			}
			for(String res:ch)
				System.out.print(res);
		}
		else {
			System.out.println(s+" is an invalid input");
		}
	}

}
