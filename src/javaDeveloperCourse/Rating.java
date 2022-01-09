package javaDeveloperCourse;
import java.util.*;
public class Rating {
	 
 	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rating");
		int Rating=sc.nextInt();
		boolean flag=true;
		while(flag) {
			if(Rating<=10 && Rating>=7) {
				System.out.println("Rating is Good");
				Rating =sc.nextInt();
			}
			else if(Rating<=6 && Rating >=4) {
				System.out.println("Rating is Average");
				Rating =sc.nextInt();
			}
			else if(Rating<=3 && Rating >=1) {
				System.out.println("Rating is Bad");
				Rating =sc.nextInt();
			}
			else if(Rating==-1) {
				System.out.println("Thanks for your Rating...");
				flag=false;
			}
			else {
				System.out.println("Enter values between 1-10");
				Rating =sc.nextInt();
			}	
		}

	} 

}
