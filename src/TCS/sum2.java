package TCS;
import java.util.*;
public class sum2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.length()==0 || s.length()>30) {
			System.out.println("Invalid String");
			return;
		}
		else {
			Map<Character,Integer> map=new LinkedHashMap<>();
			for(char ch: s.toCharArray()) {
				if(s.contains(ch+"")) {
					map.put(ch, map.get(ch));
				}
				else {
					map.put(ch, 1);
				}
			}
			List<Character> list=new ArrayList<>();
			for(Map.Entry<Character,Integer> item: map.entrySet()) {
				if(item.getValue()==1) {
					list.add(item.getKey());
				}
			}
			if(list.isEmpty())
				System.out.println("Invalid String");
			else {
				for(Character c:list)
					System.out.print(c+" ");
			}
		}
	}
}
