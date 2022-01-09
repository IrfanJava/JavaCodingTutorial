package Sorting;

import java.util.Scanner;

public class StringsentStringrecieved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		for(int i=0;i<s1.length();i++) {
			if(s1.contains(s1.charAt(i)+"") && !s2.contains(s1.charAt(i)+"")) {
				System.out.println(s1.charAt(i));
			}
		}
	
	}

}
