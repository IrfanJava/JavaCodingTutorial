package JavaConcurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class HelloThread {

	public static void main(String[] args) {
		ExecutorService obj=Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++) {
			obj.submit(getRunnable());
		}
		obj.shutdown();
	}
	private static Runnable getRunnable() {
		return()->{
			try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String name=Thread.currentThread().getName();
			System.out.println("Hello "+name);
			
		};
	}

}
 