package javaDeveloperCourse;
import java.util.*;
public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		switch(s){
			case "Plants":
				System.out.println("Make their Own Food");
				break;
			case "Herbivores":
				System.out.println("Depend on plants for their food");
				break;
			case "Carnivores":
				System.out.println("Depend on Herbivores for their food");
				break;
			case "Omnivores":
				System.out.println("Depend on both plants and herbivores for their food");
				break;
			default:
				System.out.println("Unknown Species");
			
		}
		
 
	}

}
