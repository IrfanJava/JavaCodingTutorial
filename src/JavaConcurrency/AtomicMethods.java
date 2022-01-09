package JavaConcurrency;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
public class AtomicMethods {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		System.out.println("1)To get Value\n2)To Increment Value by 1\n"
				+ "3)To Decrement Value by 1\n4)To Compare and set Value\n5)Exit");
		while(flag) {	
			System.out.println("\nEnter Choice");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:{
				System.out.println("Enter value to get");
				int n=sc.nextInt();
				getValue(n);
				break;
			
			}
			case 2:{
				System.out.println("Enter value to increment by 1");
				int n=sc.nextInt();
				getIncrementedValue(n);
				break;
			}
			case 3:{
				System.out.println("Enter value to decrement by 1");
				int m=sc.nextInt();
				getDecrementedValue(m);
				break;
			}
			case 4: {
				System.out.println("Enter value to set");
				int m=sc.nextInt();
				CompareAndSet(m);
				break;
			}
			case 5:{
				flag=false;
			}
			}
		}
	}
	public static void getValue(int  n) {
		AtomicInteger obj=new AtomicInteger(n);
		System.out.println("Previous Value: "+obj);
		int ans=obj.get();
		System.out.println("Current Value: "+ans);
	}
	 
	public static void getIncrementedValue(int n) {
		AtomicInteger obj=new AtomicInteger(n);
		System.out.println("Previous Value: "+obj);
		int ans=obj.incrementAndGet();
		System.out.println("Current value after Incrementing: "+ans);
	}
	public static void getDecrementedValue(int n) {
		AtomicInteger obj=new AtomicInteger(n);
		System.out.println("Previous Value: "+obj);
		int ans=obj.decrementAndGet();
		System.out.println("Current value after Decrementing: "+ans);
	}
	public static void CompareAndSet(int n) {
		Scanner sc=new Scanner(System.in);
		AtomicInteger obj=new AtomicInteger(n);
		System.out.println("Enter Expected Value:");
		int e=sc.nextInt();
		System.out.println("Enter New Value:");
		int ne=sc.nextInt();
		boolean res=obj.compareAndSet(e, ne);
		if(res) {
			System.out.println("Value is Updated\nThe New Value is "+obj
					);
		}
		else {
			System.out.println("Value is not Updated");
		}
	} 
}
