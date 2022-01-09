package package2;
 
public class Customer {
	private long id;
	private String name;
	private char gender;
	private String email;
	private String contactNumber;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Customer() {
	}
	public Customer(long id, String name, char gender, String email, String contactNumber) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.email = email; 
		this.contactNumber = contactNumber;
	}
	public boolean equals(Customer c) {
		if(this.email.equals(c.email) && this.contactNumber.equals(c.contactNumber))
			return true;
		return false; 
	}
} 
