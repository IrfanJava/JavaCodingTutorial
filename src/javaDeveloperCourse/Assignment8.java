package javaDeveloperCourse;
import java.util.*;
public class Assignment8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Integer> set=new HashSet<>();
		System.out.println("Enter Elements of Set(Press -1 to quit)");
		boolean flag=true;
		while(flag) {
			int n=sc.nextInt();
			if(n==-1) {
				flag=false;
			}
			else {
				set.add(n);
			}
		}
		Iterator iter =set.iterator();
		System.out.println("Printing Elements...");
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}	
	}
}
 