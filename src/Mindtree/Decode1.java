package Mindtree;
import java.util.*;
public class Decode1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toLowerCase(); 
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1) && i==s.length()-2) {
				count++;
				System.out.print(s.charAt(i)+""+count);
			}
			else if(s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
			else if(s.charAt(i)!=s.charAt(i+1)){
				System.out.print(s.charAt(i)+""+count);
				count=1;
			}
		}

	}

}
