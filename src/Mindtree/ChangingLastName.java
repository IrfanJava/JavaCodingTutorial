package Mindtree;
import java.util.*;
public class ChangingLastName {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name1=sc.nextLine();
		String str1[]=name1.split(" ");
		String name2=sc.nextLine();
		String str2[]=name2.split(" ");
		String temp=str1[1];
		str1[1]=str2[1];
		str2[1]=temp;
		System.out.print("Names after exchanging last names are\n");
		for(int i=0;i<str1.length;i++)
			System.out.print(str1[i]+" ");
		System.out.print("and ");
		for(int i=0;i<str2.length;i++)
			System.out.print(str2[i]+" ");

	}

}
