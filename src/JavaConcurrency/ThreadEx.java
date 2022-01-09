package JavaConcurrency;
import java.util.concurrent.*;
import java.util.*;
class MyThread extends Thread{
	public void run() {
		System.out.println("MyThread is started...");
		System.out.println("MyThread Details:");
		System.out.println("Name: "+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
} 

class YourThread implements Runnable{
	public void run() {
		System.out.println("YourThread is started...");
		System.out.println("YourThread Details:");
		System.out.println("Name: "+Thread.currentThread().getName());
	}
}
public class ThreadEx {
	public static void main(String[] args) {
		MyThread obj=new MyThread();
		obj.start();
		try {
			obj.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Current Thread ID: "+Thread.currentThread().getId());
		System.out.println("Current Thread State: "+Thread.currentThread().getState());
		System.out.println("Current Thread Priority: "+Thread.currentThread().getPriority());
		
		Runnable r=new YourThread();
		Thread t=new Thread(r);
		t.start();
		System.out.println("Current Thread ID: "+Thread.currentThread().getId());
		System.out.println("Current Thread State: "+Thread.currentThread().getState());
		System.out.println("Current Thread Priority: "+Thread.currentThread().getPriority());
	} 
}
