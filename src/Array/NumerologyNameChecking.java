package Array;
import java.util.*;
public class NumerologyNameChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String name1=name.toUpperCase();
		if(name.matches("[A-Za-z]*")) {
			int ascii=0,sum=0;
			for(int i=0;i<name.length();i++) {
				ascii=(int)(name.charAt(i))-64;
				sum=sum+ascii;
			}
			if(sum%2==0 && sum%3==0) {
				System.out.println(sum);
				System.out.println(name+" Numerology name");
			}
			else {
				System.out.println(sum);
				System.out.println(name+" Not a Numerology name");
			}
		}
		else {
			System.out.println(name+" is invalid name");
		}
	}

}
