import java.util.*;
public class productofcountofuppercaseandlower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		int upper=0,lower=0;
		if(s.matches("[a-zA-Z]*")) {
			if(s.length()<=10) {
				for(int i=0;i<s.length();i++) {
					char ch=s.charAt(i);
					if(Character.isUpperCase(ch))
						upper++;
					else if(Character.isLowerCase(ch))
						lower++;
				}
				System.out.println("Product value is "+(lower*upper));
			}
			else
				System.out.println(s+" "+s.length()+" exceeds the limit");
		}
		else
			System.out.println(s+" is an invalid string");
	}
}
