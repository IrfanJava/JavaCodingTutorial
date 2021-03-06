package JavaConcurrency;
import java.util.*;
import java.util.concurrent.RecursiveAction;
public class Task extends RecursiveAction{
	private List<Product> products;
	
	private int first;
	private int last;
	
	private double increment;
	public Task(List<Product> products,int first,int last,double increment) {
		this.products=products;
		this.first=first;
		this.last=last;
		this.increment=increment;
	}
	@Override
	protected void compute() {
		if(first-last<10) {
			updatePrices();
		}
		else {
			int middle=(first+last)/2;
			Task t1=new Task(products,first,middle+1,increment);
			Task t2=new Task(products,middle+1,last,increment);
			invokeAll(t1,t2);
			
		}
		
	}
	public void updatePrices() {
		for(int i=first;i<last;i++) {
			Product product=products.get(i);
			double newprice=product.getPrice()*(1+increment);
			product.setPrice(newprice);
		}
	}
	
	
}
