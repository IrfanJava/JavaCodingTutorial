package Mindtree;
import java.util.*;
public class Demo { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student ID: ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name: ");
		String name=sc.nextLine();
		System.out.println("Enter Student marks in first chance: ");
		float marks1=sc.nextFloat();
		System.out.println("Enter whether Student attempted second chance: ");
		boolean secondchance=sc.nextBoolean();
		Student obj=new Student(id,name,secondchance);
		if(secondchance) {
			System.out.println("Enter Student marks in second chance: ");
			float marks2=sc.nextFloat();
			obj.identifyMarks(marks1, marks2);
		}
		else if(!secondchance) {
			obj.identifyMarks(marks1);
		}
		System.out.println("Student ID: "+obj.getStudentId());
		System.out.println("Student Name: "+obj.getStudentName());
		System.out.println("Student Marks: "+obj.getMarks());
		System.out.println("Student did second attempt?: "+obj.getSecondChance());
	}
}
class Student{
	private int studentId;
	private String studentName;
	private float marks;
	private boolean secondChance;
	
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public float getMarks() {
		return marks; 
	}
	public void setMarks(float marks) {
		this.marks=marks;
	}
	public boolean getSecondChance() {
		return secondChance;
	}
	public void identifyMarks(float marks) {
		this.marks=marks;
	}
	public void identifyMarks(float marks1,float marks2) {
		float marks=marks1>marks2?marks1:marks2;
		this.marks=marks;
	}
	public Student(int studentId,String studentName,boolean secondChance) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.secondChance=secondChance;
	}	
} 
