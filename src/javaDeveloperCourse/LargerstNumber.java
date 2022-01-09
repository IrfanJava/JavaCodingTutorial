package javaDeveloperCourse;
import java.util.*;
public class LargerstNumber {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1)find largest among 2 numbers\n2)find largets among 3 numbers\n"
				+ "3)find largest among more than 3 numbers\n4)exit");
		System.out.println("Enter Choice");
		char ch=sc.next().charAt(0); 
		boolean flag=true;
		while(flag) {
			if(ch=='1') {
				System.out.println("Enter Two numbers");
				int a=sc.nextInt();
				int b=sc.nextInt();
				System.out.println(findlargest(a,b)+" is greater");
				System.out.println("Enter Choice");
				ch=sc.next().charAt(0);
			}
			else if(ch=='2') {
				System.out.println("Enter Three numbers");
				int a=sc.nextInt();
				int b=sc.nextInt();
				int c=sc.nextInt();
				System.out.println(findlargest(a,b,c)+" is greater");
				System.out.println("Enter Choice");
				ch=sc.next().charAt(0);
			}
			else if(ch=='3') {
				System.out.println("Enter count of numbers you need to enter");
				int n=sc.nextInt();
				int arr[]=new int[n];
				System.out.println("Enter numbers");
				for(int i=0;i<n;i++)
					arr[i]=sc.nextInt();
				System.out.println(findlargest(arr)+" is greater");
				System.out.println("Enter Choice");
				ch=sc.next().charAt(0);
			}
			else if(ch=='4') {
				System.out.println("Application ending...");
				flag=false;
			}
		} 
	}
	public static int findlargest(int a,int b) {
		return (a>b)?a:b;
	}
	public static int findlargest(int a,int b,int c) {
		return c > (a>b ? a:b) ? c:((a>b) ? a:b);
	}
	public static int findlargest(int arr[]) {
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
} 
