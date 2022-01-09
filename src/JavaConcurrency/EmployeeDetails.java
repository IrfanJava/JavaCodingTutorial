package JavaConcurrency;
import java.util.*;
public class EmployeeDetails {
	public List<Employee> Employeegenerator(int size){
		Scanner sc=new Scanner(System.in);
		List<Employee> empList=new ArrayList<>();
		for(int i=0;i<size;i++) {
			System.out.println("Enter Employee ID:");
			int id=sc.nextInt();
			System.out.println("Enter Employee Name:");
			String name=sc.next();
			System.out.println("Enter Employee Department:");
			String dept=sc.next();
			Employee obj=new Employee(id,name,dept);
			empList.add(obj);
		}
		return empList;
	}

}
 