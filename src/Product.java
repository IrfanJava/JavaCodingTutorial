import java.util.*;
public class Product {
	private String name;
	private int id;
	private String category;
	private String brand;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) { 
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String name, int id, String category, String brand, double price) {
		super();
		this.name = name;
		this.id = id;
		this.category = category;
		this.brand = brand;
		this.price = price;
	}

	public Product() {
	
	}
	
} 
