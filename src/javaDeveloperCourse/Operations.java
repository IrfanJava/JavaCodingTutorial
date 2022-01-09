package javaDeveloperCourse;
import java.util.*;
public class Operations {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value of a:");
		int a=sc.nextInt();
		System.out.println("Enter Value of b:");
		int b=sc.nextInt();
		System.out.println("Enter Value of c:");
		int c=sc.nextInt();
		System.out.println("Enter Value of d:");
		int d=sc.nextInt();
		System.out.println("AND result of 4 variables "+(a&b&c&d));
		System.out.println("OR result of 4 variables "+(a|b|c|d));
		System.out.println("Addition of 4 variables "+(a+b+c+d));
		System.out.println("Substraction of b from a "+(a-b));
		System.out.println("Substraction of d from c "+(c-d));
		System.out.println("Multiplication of 4 variables "+(a*b*c*d));
		System.out.println("Division of a by b "+(a/b));
		System.out.println("Division of c by d "+(c/d));

	}

}
