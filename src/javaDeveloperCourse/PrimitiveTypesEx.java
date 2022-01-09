package javaDeveloperCourse;
import java.util.*;
public class PrimitiveTypesEx { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Byte Value:");
		byte b=sc.nextByte();
		System.out.println("Enter Short Value:");
		short s=sc.nextShort();
		System.out.println("Enter Int Value:");
		int n=sc.nextInt();
		System.out.println("Enter Float Value:"); 
		float f=sc.nextFloat();
		System.out.println("Enter long Value:");
		long l=sc.nextLong();
		System.out.println("Enter Double Value:");
		double d=sc.nextDouble();
		System.out.println("Enter Character Value:");
		char c=sc.next().charAt(0);
		System.out.println("Enter Boolean Value:");
		boolean b1=sc.nextBoolean();
		System.out.println();
		System.out.println("Byte Value is "+b);
		System.out.println("Short Value is "+s);
		System.out.println("Int Value is "+n);
		System.out.println("Float Value is "+f);
		System.out.println("long Value is "+l);
		System.out.println("Double Value is "+d);
		System.out.println("Character Value is "+c);
		System.out.println("Boolean Value is "+b);		
	}
} 
