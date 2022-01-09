package Sorting;
import java.util.*;
public class ReversingWordsInString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int temp=0;
		String str[]=s.split(" ");
		String res[]=new String[str.length];
		for(int i=str.length-1;i>=0;i--) {
			res[temp]=str[i];
			temp++;
		}
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
		
	}

}
