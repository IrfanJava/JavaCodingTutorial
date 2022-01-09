package javaDeveloperCourse;
import java.util.*;
public class NamesPermutation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fullname;
		String firstname;
		String lastname;
		int spaceindex=0;
		List<String> firstnameList=new ArrayList<>();
		List<String> lastnameList=new ArrayList<>();
		for(int i=0;i<5;i++) {
			System.out.println("Enter Name "+(i+1));
			fullname=sc.nextLine();
			spaceindex=fullname.indexOf(" ");
			firstname=fullname.substring(0, spaceindex);
			lastname=fullname.substring(spaceindex+1);
			firstnameList.add(firstname);
			lastnameList.add(lastname);
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.println(firstnameList.get(i)+" "+lastnameList.get(j));
			}
		}	
	}
}
