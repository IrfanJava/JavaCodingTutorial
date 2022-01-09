package Array;
import java.util.*;
import java.util.Arrays;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		List<String> list=new ArrayList<String>();
		for(int i=0;i<n;i++)
			list.add(sc.next());
		System.out.println(getGroupedAnagrams(list));
				
	}
	public static int getGroupedAnagrams(List<String> words) {
		int count=0;
		Set<String> set=new HashSet<String>();
		for(int i=0;i<words.size();i++) {
			for(int j=i+1;j<words.size();j++) {
				if(isAnagram(words.get(i),words.get(j))) {
					set.add(words.get(i)+words.get(j));
				}
			}
		}
		return count+set.size();
	}
	public static boolean isAnagram(String input1,String input2) {
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
