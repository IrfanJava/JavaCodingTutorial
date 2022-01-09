package JavaConcurrency;
import java.util.*;
class Q{
	private int num;
	boolean isValueset=false;
	public synchronized void getNum() {
		while(!isValueset) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Get: "+num);
		isValueset=false;
		notify();
	}

	public synchronized void setNum(int num) {
		while(isValueset) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Put: "+num);
		this.num = num;
		isValueset=true;
		notify();
	}
}
class Producer implements Runnable{
	Q q;
	
	public Producer(Q q) {
		this.q=q;
		Thread thread=new Thread(this,"Producer");
		thread.start();
	}
	public void run() {
		int i=0;
		while(true) {
			q.setNum(i++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
class Consumer implements Runnable{
	Q q;
	public Consumer(Q q) {
		this.q=q;
		Thread thread=new Thread(this,"Consumer");
		thread.start();
	}
	public void run() {
		while(true) {
			q.getNum();
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
public class MultiThreading {

	public static void main(String[] args) {
		Q q=new Q();
		new Producer(q);
		new Consumer(q);

	}

}
