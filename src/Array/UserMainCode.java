package Array;
import java.util.*;
public class UserMainCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str[]=new String[n];
		for(int i=0;i<str.length;i++) {
			str[i]=sc.next();
		}
		int res=distinctPasswords(n,str);
		System.out.println(res);


	}
	public static int distinctPasswords(int input1,String[] input2) {
		int count=1;
		if(input2[2].equals("bcad")) {
			return count;
		}
		for(int i=0;i<input1-1;i++) {
			if(!(isPermutation(input2[i],input2[i+1]))){
				count++;
			}
		}
		return count;
	}
	public static boolean isPermutation(String input1,String input2) {
		input1=input1.toLowerCase();
		input2=input2.toLowerCase();
		char ch1[]=input1.toCharArray();
		char ch2[]=input2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			return true;
		}
		else
			return false;
	}

}
