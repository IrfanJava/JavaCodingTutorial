package Virtusa;

import java.util.Scanner;

public class Removingoccurence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.next();
		Removingoccurence obj=new Removingoccurence();
		System.out.println(obj.removingOccurrences(s1,s2));

	}
	public String removingOccurrences(String input1,String input2) {
		if(input1.contains(input2)) {
			input1=input1.replaceAll(input2,"");
		}
		return input1;
	}

}
