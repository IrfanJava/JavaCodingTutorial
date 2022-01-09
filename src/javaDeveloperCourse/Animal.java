package javaDeveloperCourse;
import java.util.*;
public class Animal implements Comparable {
	private int Id;
	private int no_of_legs;
	private String color;
	 
	public Animal(int Id,int no_of_legs,String color) {
		this.Id=Id;
		this.no_of_legs=no_of_legs;
		this.color=color;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id=Id;
	}
	public int getNo_of_legs() {
		return this.no_of_legs;
	}
	public void setNo_of_legs(int no_of_legs) {
		this.no_of_legs=no_of_legs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public int compareTo(Object o) {
		Animal a=(Animal)o;
		if(Id!=a.Id) {
			return Id-a.Id;
		}
		if(no_of_legs!=a.no_of_legs) {
			return no_of_legs-a.no_of_legs;
		}
		if(!color.equals(a.color)) {
			return color.compareTo(a.color);
		}
		return 0;
		 
	}
}
 