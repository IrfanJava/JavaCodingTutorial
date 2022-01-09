package Sorting;
import java.util.*;
public class StringAssignment {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		HashSet<Character> set=new HashSet<>();
		int flag=0;
		for(int i=0;i<s.length();i++) {
			if(set.contains(s.charAt(i))) {
				System.out.println(s.charAt(i));
				flag=1;
				break;
			}
			else {
				set.add(s.charAt(i));
			}
		}
		if(flag==0) {
			System.out.println(-1);
		}
	}

}
