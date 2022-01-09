package JavaConcurrency;
import java.util.*;
import java.util.concurrent.*;
public class Main {

	public static void main(String[] args) {
		ProductListGenerator generator=new ProductListGenerator();
		List<Product> products=generator.generate(1000);
		Task task=new Task(products,0,products.size(),0.20);
		
		ForkJoinPool pool=new ForkJoinPool();
		pool.execute(task);
		
		do {
			System.out.println("*****************************");
			System.out.println("Main: Parallelism: "+pool.getParallelism());
			System.out.println("Main: Active Thread: "+pool.getActiveThreadCount());
			System.out.println("Main: Task Thread: "+pool.getQueuedTaskCount());
			System.out.println("Main: Steel Thread: "+pool.getStealCount());
			System.out.println("*****************************");
			try {
				TimeUnit.MILLISECONDS.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}while(!task.isDone());
		
		pool.shutdown();

		if(task.isCompletedNormally()) {
			System.out.println("Main: The Process has completed successfully");
		}
		
		for(int i=0;i<products.size();i++) {
			Product pr=products.get(i);
			if(pr.getPrice()!=12) {
				System.out.println("Product "+pr.getName()+" Price "+pr.getPrice());
			}
		}

		System.out.println("End of Main Program");
	}

}
