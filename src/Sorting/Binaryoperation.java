package Sorting;
import java.util.*;
public class Binaryoperation {
	static int BinaryOperationString(String s){
		char ch[]=s.toCharArray();
		if(s.length()==0)
			return -1;
		int ans=Integer.parseInt(String.valueOf(ch[0]));
		for(int i=1;i<s.length();i+=2) {
			char operation=ch[i];
			int ans2=Integer.parseInt(String.valueOf(ch[i+1]));
			if(operation=='A') {
				ans=ans&ans2;
			}
			else if(operation=='B') {
				ans=ans|ans2;
			}
			else if(operation=='C'){
				ans=ans^ans2;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		int ans=BinaryOperationString(S);
		System.out.print(ans);
	}// input=0C1A1B1C1C1B0A0,output=0//
	

}
