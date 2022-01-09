package Array;
import java.util.*;
public class NextMixingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		int diff=s.charAt(0)-s.charAt(1);
		for(int i=0;i<s.length()-1;i++) {
			int val1=s.charAt(i);
			int val2=s.charAt(i+1);
			if(diff!=val1-val2) {
				System.out.println(s+" is not in Sequence");
				return;
			}
		}
		int output=s.charAt(s.length()-1);
		System.out.println("Enter the Sequence");
		int seq=sc.nextInt();
		if(seq>0) {
			for(int i=0;i<seq;i++) {
				output=output-diff;
				char last;
				if(output>122) {
					output=output-26;
					last=(char)output;
				}
				else if(output<97) {
					output=output+26;
					last=(char)output;
				}
				else {
					last=(char)output;
				}
				System.out.print(last);
			}
			
		}
		else {
			System.out.print(seq+"Not a valid sequence");
		}
	}

}
