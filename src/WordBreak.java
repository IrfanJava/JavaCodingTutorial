import java.util.*;
public class WordBreak {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		int n=sc.nextInt();
		List<String> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(sc.next());
		}
		for(int i=0;i<list.size();i++) {
			if(s.contains(list.get(i)))
				count++;
		}
		if(count>=list.size()) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
}
