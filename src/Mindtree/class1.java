package Mindtree; 
import java.util.*;
public class class1 { 
	public static void main(String args[]) {
		Employee obj=new Employee();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name");
		String name=sc.nextLine();
		System.out.println("Enter Employee Designation");
		String desig=sc.nextLine();
		System.out.println("Enter Employee Department");
		String dept=sc.nextLine();
		
		obj.setEmpId(id);
		obj.setEmpName(name);
		obj.setEmpDesig(desig);
		obj.setEmpDept(dept);
		
		System.out.println("Employee ID: "+obj.getEmpId());
		System.out.println("Employee Name: "+obj.getEmpName());
		System.out.println("Employee Designation: "+obj.getEmpDesig());
		System.out.println("Employee Department: "+obj.getEmpDept());
		
	}
} 
class Employee{
	private int empId;
	private String empName;
	private String empDesig;
	private String empDept;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		if(empName.equals(null)) {
			System.out.println("Error! enter employee name");
		}
		this.empName = empName;
	}
	public String getEmpDesig() {
		return empDesig;
	}
	//developer, tester, Lead or manager 
	public void setEmpDesig(String empDesig) {
		if(empDesig.equalsIgnoreCase("developer"))
			this.empDesig = empDesig;
		else if(empDesig.equalsIgnoreCase("tester"))
			this.empDesig=empDesig;
		else if(empDesig.equalsIgnoreCase("lead"))
			this.empDesig=empDesig;
		else if(empDesig.equalsIgnoreCase("manager"))
			this.empDesig=empDesig;
		else
			System.out.println("Invalid Designation");
	}
	public String getEmpDept() {
		return empDept;
	}
	//TTH, RCM, Digital, DevOps
	public void setEmpDept(String empDept) {
		if(empDept.equals("TTH"))
			this.empDept = empDept;
		else if(empDept.equals("RCM"))
			this.empDept = empDept;
		else if(empDept.equals("Digital"))
			this.empDept = empDept;
		else if(empDept.equals("DevOps"))
			this.empDept = empDept;
		else
			System.out.println("Invalid Dept");
	}
	public Employee() {
		
	}
	public Employee(int empId,String empName,String empDesig,String empDept) {
		this.empId=empId;
		this.empName=empName;
		this.empDesig=empDesig;
		this.empDept=empDept;
	} 
	 
	
}
