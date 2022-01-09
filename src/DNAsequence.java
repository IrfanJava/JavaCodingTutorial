import java.util.*;
public class DNAsequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine().trim();
		Map<String,Integer> map = new HashMap<>();
		for(int i=0;i<s.length()-10;i++) {
			String substring=s.substring(i,i+10);
			if(map.containsKey(substring))
				map.put(substring,map.get(substring)+1);
			else
				map.put(substring,1);
		}
		List<String> list=new ArrayList<>();
		for(Map.Entry<String,Integer> item: map.entrySet()) {
			if(item.getValue()>1)
				list.add(item.getKey());
		} 
		System.out.println(list);
	}
}
