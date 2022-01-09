import java.util.*;
import java.util.Arrays;
public class Anagram {
	static boolean isAnagram(String a,String b) {
		char aa[]=a.toLowerCase().toCharArray();
		char bb[]=b.toLowerCase().toCharArray();
		if(a.length()!=b.length())
			return false;
		Arrays.sort(aa);
		Arrays.sort(bb);
		return Arrays.equals(aa, bb);
		
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		boolean res=isAnagram(a,b);
		System.out.println(res?"Anagram":"Not Anagram");
	}
}
