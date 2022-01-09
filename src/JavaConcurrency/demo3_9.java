package JavaConcurrency;
import java.util.*;
public class demo3_9 {
 
	public static void main(String[] args) throws InterruptedException {
		final ProducerConsumer obj=new ProducerConsumer();
		Thread t1=new Thread(new Runnable() {
			public void run() {
				try {
					obj.produce();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread t2=new Thread(new Runnable() {
			public void run() {
				try {
					obj.consume();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}
	public static class ProducerConsumer{
		LinkedList<Integer> list=new LinkedList<>();
		int n=2;
		public void produce() throws InterruptedException{
			int value=0;
			while(true) {
				synchronized(this) {
					while(list.size()==n)
						wait();
					System.out.println("Producer produced-"+value);
					list.add(value++);
					notify();
					Thread.sleep(1000);
				}
			}
		}
		public void consume() throws InterruptedException{
			int x=5;
			while(x>0) {
				synchronized(this) {
					while(list.size()==0) {
						wait();
					}
					int val=list.removeFirst();
					System.out.println("Consumer consumed-"+val);
					notify();
					x--;
					Thread.sleep(1000);
				}
			}
		}
	} 
}
