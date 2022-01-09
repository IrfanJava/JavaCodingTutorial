package javaDeveloperCourse;
import java.util.*;
public class ComparableInterfaceEX {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Animal obj=new Animal(106,4,"Brown");
		Animal obj1=new Animal(102,2,"Grey");
		Animal obj2=new Animal(105,0,"Black");
		Animal obj3=new Animal(104,4,"Green");
		Animal obj4=new Animal(102,2,"Blue");
		 
		List<Animal> list=new ArrayList<>();
		list.add(obj);
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
	
		Collections.sort(list);
		System.out.println("After Sorting Animal Object of List...");
		System.out.println();
		for(Animal l:list) {
			System.out.println(l.getId()+" "+l.getNo_of_legs()+" "+l.getColor());
		}
	} 
}
