package Mindtree;
import java.util.*;
public class ValidateNumber {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter USN Number");
		String USN=sc.next();
		String USN1=USN.substring(0, 5);
		boolean flag1=false,flag2=false,flag3=false;
		if(USN1.matches("[1-2][A-Z]{2}[0-9]{2}")) {
			flag1=true;
		}
		if(USN.substring(5,7).equals("CS")||USN.substring(5,7).equals("IS")||USN.substring(5,7).equals("EC")
				||USN.substring(5,7).equals("ME")){
			flag2=true;
		}
		if(USN.substring(7,10).matches("[0-9]*")) {
			flag3=true;
		}
		boolean res=(flag1 && flag2 && flag3);
		System.out.println((res)?"Success":"Failure");

	}
}
