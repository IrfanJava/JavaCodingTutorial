package JavaConcurrency;
import java.util.concurrent.*;
import java.util.*;
public class EmployeeMain  {

	public static void main(String[] args) {
		EmployeeDetails details=new EmployeeDetails();
		List<Employee> list= details.Employeegenerator(5);
		
		Work work=new Work(list,0,list.size());
		ForkJoinPool pool=new ForkJoinPool();
		pool.execute(work);
		System.out.println("\nEmployee Details are");
		for(int i=0;i<list.size();i++) {
			Employee emp=list.get(i);
			System.out.println("Employee ID: "+emp.getName());
			System.out.println("Employee Name: "+emp.getId());
			System.out.println("Employee Department: "+emp.getDepartment());
		}
		pool.shutdown();
	}

}
 