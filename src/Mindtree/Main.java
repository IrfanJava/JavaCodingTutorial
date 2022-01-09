package Mindtree;
import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.print("1.Insert at Beginning\n2.Insert at Middle\n3.Insert at End\n4.Delete at Beginning\n"
				+ "5.Delete at Middle\n6.Delete at End\n7.Display\n8.Exit\n");
		int flag=1;
		while(flag==1) {
			System.out.println("Enter Your Choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter Data to be Inserted at Beginning:");
				   int a=sc.nextInt();
			       list.insertAtStart(a);
			       break;
			
			case 2:System.out.println("Enter Data to be Inserted at specified Index:");
				   int b=sc.nextInt();
				   System.out.println("Enter Index:");
				   int i=sc.nextInt();
				   list.insertAt(i, b);
				   break;
			case 3:System.out.println("Enter Data to be Inserted at End:");
				   int c=sc.nextInt();
				   list.insertAtEnd(c);
				   break;
			case 4:System.out.println("Data will be Deleted at Beginning:");
		 		   int d=sc.nextInt();
				   list.deleteAt(0);
				   break;
			case 5:System.out.println("Enter Index of Data to be Deleted:");
				   int j=sc.nextInt();
				   list.deleteAt(j);
				   break;
			case 6:System.out.println("Data will be Deleted at End:");
				   list.deleteAtEnd();
				   break;
	 		case 7:list.print();
				   break;
			case 8:flag=0;   
			}			 
		}
	}
}
