package javaDeveloperCourse;
import java.util.*;
public class MadLibsClone {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Adjective1:");
		String adj1=sc.next();
		System.out.println("Enter Girl's Name:");
		String gname=sc.next();
		System.out.println("Enter Adjective2:");
		String adj2=sc.next();
		System.out.println("Enter Occupation1:");
		String occ1=sc.next();
		System.out.println("Enter Place:");
		String place=sc.next();
		System.out.println("Enter Clothing:");
		String cloth=sc.next();
		System.out.println("Enter Hobby:");
		String hobby=sc.next();
		System.out.println("Enter Adjective3:");
		String adj3=sc.next();
		System.out.println("Enter Occupation2:");
		String occ2=sc.next();
		System.out.println("Enter Boy's Name:");
		String bname=sc.next();
		System.out.println("Enter Man's Name:");
		String mname=sc.next();
		
		System.out.println("There once was a "+adj1+" girl named "+gname+", who");
		System.out.println("was a "+adj2+" "+occ1+" in the Kingdom of "+place+".");
		System.out.println("She loved to wear "+cloth+" and to "+hobby+".She wanted to marry");
		System.out.println("the "+adj3+" "+occ2+" named "+bname+" but her father, King "+mname+" forbid her from seeing him");
		

	}

}
