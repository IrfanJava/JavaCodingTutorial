package Mindtree;
import java.util.*;
public class Queue { 
	static int top=-1;
	static int front=0;
	static int rear=-1;
	static int q[]=new int[100];
	public static void main(String[] args) {
		System.out.println("1.enquee 2.dequee 3.display 4.exit");
		boolean flag=true;
		while(flag) {
			System.out.println("Enter choice");
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			switch(n) {
			case 1:enquee();
			break;
			case 2:dequee();
			break;
			case 3:display();
			break;
			case 4:flag=false;
			break;
			}
		}
	}
	public static void enquee() {
		System.out.println("enter element");
		Scanner scan=new Scanner(System.in);
		int ele=scan.nextInt();
		rear++;
		q[rear]=ele;
		top++;
	}
	public static void dequee() {
		q[rear]=0;
		rear--;
		top--;
	}
	public static void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(q[i]);
		}
	}
}
 