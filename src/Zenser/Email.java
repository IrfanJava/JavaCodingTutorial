package Zenser;
import java.util.*;

public class Email {
	public static void Extraction(String Str) {
		int count=0;
		String arr[]=Str.split("@");
		for(int i=0;i<Str.length();i++) {
			if(Str.charAt(i)!='@')
				count++;
			else if(Str.charAt(i)=='@')
				break;
		}
		System.out.println(arr[0]+""+count);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Str=sc.nextLine();
		Extraction(Str);
		
	}

}
