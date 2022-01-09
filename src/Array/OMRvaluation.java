package Array;
import java.util.*;
public class OMRvaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Questions");
		int n=sc.nextInt();
		if(n>=0) {
			System.out.println("Enter the Answer Key");
			char anskey[]=new char[n];
			char studkey[]=new char[n];
			for(int i=0;i<n;i++) {
				char ch=sc.next().charAt(0);
				if(ch>='A' && ch<='E') {
					anskey[i]=ch;
				}
				else {
					System.out.println("Invalid Answer Key");
				}
			}
			System.out.println("Enter the Student Answer");
			for(int i=0;i<n;i++) {
				char ch=sc.next().charAt(0);
				if(ch>='A' && ch<='E') {
					studkey[i]=ch;
				}
				else {
					System.out.println("Invalid Answer");
				}
			}
			int score=0;
			for(int i=0;i<n;i++) {
				if(studkey[i]==anskey[i]) {
					score++;
				}
			}
			if(score>0) {
				int marks=((score*100)/n);
				System.out.println("The student got "+marks+ " Marks");
			}
			else {
				System.out.println("All the answers are wrong mark is 0");
			}
		}
		else {
			System.out.println(+n+" Invalid Number of Questions");
			return;
		}
		
	}

}
