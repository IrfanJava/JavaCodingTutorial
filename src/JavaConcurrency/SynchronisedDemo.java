package JavaConcurrency;
import java.util.*;
public class SynchronisedDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Sender sender =new Sender();
		thread obj=new thread("Hello",sender);
		Sender send=new Sender();
		thread obj1=new thread("Nice climate!",send);
		obj.start();
		obj1.start();
	} 
}
class Sender{
	public void send(String msg) {
		System.out.println("Sending "+msg);
		
		System.out.println(msg+" Sent");
	}
}
class thread extends Thread{
	private String msg;
	private Sender sender;
	
	thread(String msg,Sender sender){
		this.msg=msg;
		this.sender=sender;
	}
	public void run() {
		synchronized(sender) {
			sender.send(msg);
		}
	}
}
 