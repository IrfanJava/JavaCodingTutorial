package JavaConcurrency;
import java.util.concurrent.*;
public class ThreeThreads {
	public static void main(String[] args) {
		FirstThread f=new FirstThread();
		SecondThread s=new SecondThread();
		ThirdThread t=new ThirdThread();
		f.start();
		try {
			f.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		s.start();
		try {
			s.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.start();
	} 
}
class FirstThread extends Thread{
	public void run() {
		System.out.println("First Thread is started...");
		for(int i=101;i<=200;i++) {
			System.out.println("Number-->"+i);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class SecondThread extends Thread{
	public void run() {
		System.out.println("Second Thread is started...");
		for(int i=201;i<=300;i++) {
			System.out.println("Number-->"+i);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class ThirdThread extends Thread{
	public void run() {
		System.out.println("Third Thread is started...");
		for(int i=301;i<=400;i++) {
			System.out.println("Number-->"+i);
		}
	}
} 
  