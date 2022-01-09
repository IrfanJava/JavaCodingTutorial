package Mindtree;
import java.util.*;
public class ConsecutiveCharacters {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().toUpperCase();
		String[] str=s.split(" ");
		List<String> list=new ArrayList<>();
		Map<String,Integer> map=new LinkedHashMap<>();
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)+1==s.charAt(i+1)+0) {
				String res=String.valueOf(Character.toChars(s.charAt(i)))+
						String.valueOf(Character.toChars(s.charAt(i+1)));
				list.add(res);
				i++;
			}
		}
		for(String s1:list) {
			if(map.containsKey(s1))
				map.put(s1,map.get(s1)+1);
			else
				map.put(s1,1);
		}
		for(Map.Entry<String, Integer> item:map.entrySet()) {
			System.out.print(item.getKey()+" "+item.getValue()+" ");
		}
	}
	public static String consecutive(String s) {
		int flag=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)+1==s.charAt(i+1)+0) {
				System.out.print(s.charAt(i));
				System.out.print(s.charAt(i+1));
				String res=(char)s.charAt(i)+(char)s.charAt(i+1)+"";
				flag=1;
				return res;
			}
			
		}
		
		if(flag==0)
			return "";
		else
			return null;
	}

}
