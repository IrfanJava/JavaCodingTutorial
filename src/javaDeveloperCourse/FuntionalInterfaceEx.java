package javaDeveloperCourse;

import java.util.Scanner;

public class FuntionalInterfaceEx {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		MyLambda code=(String n)->"Hello "+n;
		System.out.println(code.Greet(name));
	}

}
