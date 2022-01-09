package Array;
import java.util.*;
public class BlockScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		if(s.matches("[A-Za-z ]*[0-9 ]*")) {
			System.out.println("Enter the letter");
			String c=sc.next();
			int sum1=0,sum2=0,score=0;
			if(s.contains(c)) {
				for(int i=0;i<s.length();i++) {
					if(c.equalsIgnoreCase(s.charAt(i)+"")) {
						sum1+=i;
					}
					else {
						sum2+=i;
					}
				}
				score=sum1*sum2;
				System.out.println("Score is "+score);
			}
		}
		else {
			System.out.println(s+" is not a valid string");
		}
	}

}
