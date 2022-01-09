package JavaConcurrency;
import java.util.concurrent.*;
import java.util.*;
public class Work extends RecursiveAction {
	 
	private List<Employee> Emplist;
	private int first,last;
	
	public Work(List<Employee> list, int first, int last) {
		super();
		this.Emplist = list;
		this.first = first;
		this.last = last;
	}
	
	protected void compute() {
		if(last-first<3) {
			getDetails();
		}
		else {
			int mid=(first+last)/3;
			System.out.println("Task pending "+getQueuedTaskCount());
			Work obj1=new Work(Emplist,first,mid);
			Work obj2=new Work(Emplist,mid+1,last);
			invokeAll(obj1,obj2);
		}
	}
	public void getDetails() {
		for(int i=first;i<=last;i++) {
			Employee emp=Emplist.get(i);
			emp.setId(emp.getId());
			emp.setName(emp.getName());
			emp.setDepartment(emp.getDepartment());
		}
	}
} 
