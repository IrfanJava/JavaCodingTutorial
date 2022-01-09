package javaDeveloperCourse;
import java.util.*; 
public class InterfaceExample implements Arithmetic{
	public void Add(int a,int b) {
		System.out.println("Result:"+(a+b));
	}
	public void Substract(int a,int b) {
		System.out.println("Result:"+(a-b));
	}
	public void Multiply(int a,int b) {
		System.out.println("Result:"+(a*b));
	}
	public void Divide(int a,int b) {
		System.out.println("Result:"+a/b);
	}
	public void Giveremainder(int a,int b) {
		System.out.println("Result:"+a%b);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		InterfaceExample obj=new InterfaceExample();
		System.out.println("1)Addition\n2)Substraction\n3)Multiplication\n4)Division\n"
				+ "5)Modulus\n6)Exit");
		System.out.println("Enter Choice");
		int ch=sc.nextInt();
		boolean flag=true;
		while(flag) {
			if(ch==1) {
				System.out.println("Enter Two Numbers to Add:");
				System.out.println("Enter A:");
				int A=sc.nextInt();
				System.out.println("Enter B:");
				int B=sc.nextInt();
				obj.Add(A,B);
				System.out.println("Enter Choice");
				ch=sc.nextInt();
			}
			else if(ch==2) {
				System.out.println("Enter Two Numbers to Substract:");
				System.out.println("Enter A:");
				int A=sc.nextInt();
				System.out.println("Enter B:");
				int B=sc.nextInt();
				obj.Substract(A,B);
				System.out.println("Enter Choice");
				ch=sc.nextInt();
			} 
			else if(ch==3) {
				System.out.println("Enter Two Numbers to Multiply:");
				System.out.println("Enter A:");
				int A=sc.nextInt();
				System.out.println("Enter B:");
				int B=sc.nextInt();
				obj.Multiply(A,B);
				System.out.println("Enter Choice");
				ch=sc.nextInt();
			}
			else if(ch==4) {
				System.out.println("Enter Two Numbers to Divide:");
				System.out.println("Enter A:");
				int A=sc.nextInt();
				System.out.println("Enter B:");
				int B=sc.nextInt();
				obj.Divide(A,B);
				System.out.println("Enter Choice");
				ch=sc.nextInt(); 
			}
			else if(ch==5) {
				System.out.println("Enter Two Numbers to Divide and give remainder:");
				System.out.println("Enter A:");
				int A=sc.nextInt();
				System.out.println("Enter B:");
				int B=sc.nextInt();
				obj.Giveremainder(A,B);
				System.out.println("Enter Choice");
				ch=sc.nextInt();
			}
			else if(ch==6) {
				flag=false;
				System.out.println("Exit...");
			}
	}
	
 
}


}
