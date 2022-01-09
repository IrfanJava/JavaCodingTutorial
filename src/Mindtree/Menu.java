package Mindtree;
import java.util.*;
public class Menu { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students");
		int n=sc.nextInt();
		Student1 arr[]=new Student1[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Student Id: "); 
			int id=sc.nextInt();
			System.out.println("Enter Student Name: ");
			String name=sc.next();
			System.out.println("Enter Student Department: ");
			String dept=sc.next();
			arr[i]=new Student1(id,name,dept);
		}
		
		String branches[]=new String[n];
		for(int i=0;i<n;i++) {
			branches[i]=arr[i].getBranch();
		}
		Arrays.sort(branches);
		for(int i=0;i<n;i++) {
			String branch=branches[i];
			for(int j=0;j<n;j++) {
				if(arr[j].getBranch()==branch)
					System.out.println(arr[j].getStudentName());
			}
		}
		System.out.println("Hence Student Name sorted based on Branch Name!");
	}
} 
class Student1{
	private int studentId;
	private String studentName;
	private String branch;
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getBranch() {
		return branch; 
	}
	public Student1(int studentId,String studentName,String branch) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.branch=branch;
	}
}
