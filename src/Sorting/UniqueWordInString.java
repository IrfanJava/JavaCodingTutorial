package Sorting;
import java.util.*;
public class UniqueWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str[]=s.split(" ");
		Map<String,Integer> map= new LinkedHashMap<>();
		for(String ch: str) {
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch,1);
		}
		int count=0;
		for(Map.Entry<String,Integer> item: map.entrySet()) {
			if(item.getValue()==1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
