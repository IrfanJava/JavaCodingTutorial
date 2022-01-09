package javaDeveloperCourse;
 
public class Static1 {
	static int num;
	static String str;
	
	static {
		num=23;
		str="Static block 1";
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		System.out.println("num value:");
		System.out.println(num);
		System.out.println("str value:");
		System.out.println(str);
		System.out.println("Number of Customers:");
		System.out.println(Demo1.no_of_customers);
		System.out.println();
		Demo1 obj=new Demo1(101,"Rakesh","993472239");
		System.out.println("1) Customer Id:");
		System.out.println(obj.getId());
		System.out.println("1) Customer Name:");
		System.out.println(obj.getName());
		System.out.println("1)customer contact number:");
		System.out.println(obj.getContactno());
		System.out.println("Number of Customers:");
		System.out.println(Demo1.no_of_customers);
		System.out.println();
		Demo1 obj1=new Demo1(102,"Monica","9092423013");
		System.out.println("2) Customer Id:");
		System.out.println(obj1.getId());
		System.out.println("2) Customer Name:");
		System.out.println(obj1.getName());
		System.out.println("2)customer contact number:");
		System.out.println(obj1.getContactno());
		System.out.println("Number of Customers:");
		System.out.println(Demo1.no_of_customers);
		System.out.println();
		Demo1 obj2=new Demo1(103,"Irfan");
		System.out.println("3) Customer Id:");
		System.out.println(obj2.getId());
		System.out.println("3) Customer Name:");
		System.out.println(obj2.getName());
		System.out.println("3)customer contact number:");
		System.out.println(obj2.getContactno());
		System.out.println("Number of Customers:");
		System.out.println(Demo1.no_of_customers);
		System.out.println();		 		
	}
}

