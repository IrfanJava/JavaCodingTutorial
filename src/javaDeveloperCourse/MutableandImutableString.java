package javaDeveloperCourse;
import java.util.*;
public class MutableandImutableString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String star="java program";
		StringBuilder sb=new StringBuilder("java program");
		System.out.println("Mutable String:-");
		System.out.println(sb);
		System.out.println(sb.substring(2,5));
		System.out.println("Length of Mutable String");
		int l1=sb.length();
		System.out.println(l1);
		System.out.println();
		System.out.println("Immutable String:-");
		System.out.println(star);
		System.out.println(star.substring(2,5));
		System.out.println("Length of Mutable String");
		int l2=star.length();
		System.out.println(l2);
	}
 
}
