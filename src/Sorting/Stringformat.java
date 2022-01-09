package Sorting;
import java.util.*;
public class Stringformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int patternCount;
		String pattern=null;
		String s=sc.nextLine();
		int n=s.length();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<s.length();j++) {
				String substr=s.substring(i,j+1);
				System.out.println(substr);
				patternCount=1;
				for(int k=0;k<n-substr.length();k++) {
					if(k==i)continue;
					if(substr.equals(s.substring(k,k+substr.length())))
						patternCount++;
					
				}
				if(patternCount>=2 && (pattern==null || pattern.length()<substr.length())){
					pattern=substr;
				}
			}
		}
		System.out.println(pattern);
	
	}


}
