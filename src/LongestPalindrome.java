import java.util.*;
public class LongestPalindrome {
	static int expandsovercentre(String s,int left,int right) {
		int l=left,r=right;
		while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
			l--;
			r++;
		}
		return r-l-1;
				
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.length()<1)
			System.out.println("");
		int start=0,end=0,len1,len2,len;
		for(int i=0;i<s.length();i++) {
			len1=expandsovercentre(s,i,i);
			len2=expandsovercentre(s,i,i+1);
			len=Math.max(len1, len2);
			if(len>end-start) {
				start=i-((len-1)/2);
				end=i+(len/2);
			}
		}
		System.out.println(s.substring(start, end+1));
	}

}
