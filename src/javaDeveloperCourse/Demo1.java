package javaDeveloperCourse;
 
public class Demo1 {
	private int Id;
	private String name;
	private String contactno;
	static int no_of_customers;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	
	
	public static int getNo_of_customers() {
		return no_of_customers;
	}
	public static void setNo_of_customers(int no_of_customers) {
		Demo1.no_of_customers = no_of_customers;
	}
	public Demo1(int Id,String name,String contactno){
		this(Id,name);
		this.contactno=contactno;
	}
	public Demo1(int Id,String name) {
		this.Id=Id;
		this.name=name;
		no_of_customers++;
	}
}
 