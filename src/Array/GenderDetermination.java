package Array;
import java.util.*;
public class GenderDetermination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.matches("[mfMF]*")) {
			int m=0,f=0;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='m' || s.charAt(i)=='M')
					m++;
				else if(s.charAt(i)=='f' || s.charAt(i)=='F')
					f++;
			}
			System.out.println("Male "+m);
			System.out.println("Female "+f);
		}
		else {
			System.out.println("Invalid Input");
		}
		
	}

}
