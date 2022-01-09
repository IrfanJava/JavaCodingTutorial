package TCS;
import java.util.*;
public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int k=sc.nextInt();
		Map<Character,Integer> map=new LinkedHashMap<>();
		List<Character> list =new ArrayList<>();
		for(char ch:s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		for(Map.Entry<Character, Integer> item: map.entrySet()) {
			if(item.getValue()>=k) {
				list.add(item.getKey());
			}
		}
		Collections.sort(list);
		System.out.println(list.get(0));
		
	}

}
