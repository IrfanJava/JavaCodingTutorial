package Virtusa;
import java.util.*;
public class StringWithinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();
		String y=sc.nextLine();
		StringWithinString obj=new StringWithinString();
		System.out.println(obj.contains(x, y));
	}
	public String contains(String input1,String input2) {
		if(input1.contains(input2)) {
			return "yes";
		}
		else
			return "no";
	}

}
