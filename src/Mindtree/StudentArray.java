package Mindtree;
import java.util.*;
public class StudentArray { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student2 arr[]=new Student2[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter Student ID: ");
			int id=sc.nextInt();
			System.out.println("Enter Student Name: ");
			String name=sc.next();
			System.out.println("Enter Student Branch: ");
			String branch=sc.next();
			System.out.println("Enter Student Score: ");
			int score=sc.nextInt();
			arr[i]=new Student2(id,name,branch,score);
		}
		int scores[]=new int[n];
		for(int i=0;i<n;i++) {
			scores[i]=arr[i].getStudentScore();
		}
		Arrays.sort(scores);
		int max=scores[n-1];
		for(int i=0;i<n;i++) {
			if(arr[i].getStudentScore()==max) {
				System.out.println(arr[i].getStudentId());
				System.out.println(arr[i].getStudentName());
				System.out.println(arr[i].getStudentBranch());
				System.out.println(arr[i].getStudentScore());
			}
		}
	}

}
class Student2{
	private int studentId;
	private String studentName;
	private String studentBranch;
	private int studentScore;
	public int getStudentId() {
		return studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public int getStudentScore() {
		return studentScore;
	}
	public Student2(int studentId,String studentName,String studentBranch,int studentScore) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.studentBranch=studentBranch;
		this.studentScore=studentScore;
	}
}
