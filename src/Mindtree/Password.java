package Mindtree;
import java.util.*;
public class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		System.out.println("Enter Age:");
		String age=sc.next();
		char[] ch=name.toCharArray();
		String res="";
		for(int i=0;i<name.length();i++) {
			if(Character.isUpperCase(ch[i]))
				res+=ch[i];
		}
		String pass=age+res;
		System.out.println("Your Password is");
		for(int i=0;i<pass.length();i++)
			System.out.print(pass.charAt(random.nextInt(pass.length())));
		System.out.println(" Don't share your password with anyone!");

	}

}
