import java.util.*;
public class Main {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Menu();
		Product product=new Product();
		List<Product> prlist =new ArrayList<>();
		boolean flag=true;
		while(flag) {
			System.out.println("Enter Choice:");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				InsertData(prlist);
				break;
			case 2:
				DisplayAll(prlist);
				break;
			case 3:
				FindbyId(prlist);
				break;
			case 4:
				EditProductbyName(prlist);
				break;
			case 5:
				DeleteProductbyId(prlist);
				break;
			case 6:
				SortbyName(prlist);
				break;
			case 7:
				CountNoofProducts(prlist);
				break;
			case 8:
				SearchbyName(prlist);
				break;
			case 9:
				flag=false;
				break;				
			}
		}
	}
	public static void InsertData(List<Product> prlist) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Name:");
		String name=sc.next();
		System.out.println("Enter Product ID:");
		int id=sc.nextInt();
		System.out.println("Enter Category:");
		String category=sc.next();
		System.out.println("Enter Brand:");
		String brand=sc.next();
		System.out.println("Enter Price:");
		double price=sc.nextDouble();
		
		Product product=new Product(name,id,category,brand,price);
		prlist.add(product);
		DisplayAll(prlist);
		 
	}
	public static void DisplayProduct(Product product) {
		System.out.println("Product Name: "+product.getName());
		System.out.println("Product ID: "+product.getId());
		System.out.println("Category: "+product.getCategory());
		System.out.println("Brand: "+product.getBrand());
		System.out.println("Price: "+product.getPrice());
		System.out.println();
	}
	
	public static void DeleteProductbyId(List<Product> prlist) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product ID to delete product from list");
		int id=sc.nextInt();
		for(int i=0;i<prlist.size();i++) {
			Product product=prlist.get(i);
			if(product.getId()==id) {
				prlist.remove(product);
			}
		}
		DisplayAll(prlist);
		 
	}
	public static void DisplayAll(List<Product> prlist) {
		for(int i=0;i<prlist.size();i++) {
			DisplayProduct(prlist.get(i));
		}
	}
	
	public static void FindbyId(List<Product> prlist) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ID of product to be searched");
		int id=sc.nextInt();
		Product product;
		for(int i=0;i<prlist.size();i++) {
			product=prlist.get(i);
			if(product.getId()==id) {
				DisplayProduct(product);
			}
		}
	}
	public static void SearchbyName(List<Product> prlist) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name of product to be searched");
		String name=sc.next();
		for(int i=0;i<prlist.size();i++) {
			Product product=prlist.get(i);
			if(product.getName().equals(name)) {
				DisplayProduct(product);
			}
		}
		 
	}
	public static void SortbyName(List<Product> prlist) {
		Product temp;
		for(int i=0;i<prlist.size();i++) {
			for(int j=i+1;j<prlist.size();j++) {
				if(prlist.get(i).getName().compareTo(prlist.get(j).getName())>0) {
					temp=prlist.get(i);
					prlist.set(i,prlist.get(j));
					prlist.set(j, temp);
				}
			}
		}
		DisplayAll(prlist);
	}
	
	public static void CountNoofProducts(List<Product> prlist) {
		System.out.println( prlist.size());
	}
	public static void EditProductbyName(List<Product> prlist) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ProductId for the product whose name has to edited:");
		int id=sc.nextInt();
		System.out.println("Enter new Product Name:");
		String name=sc.next(); 
		for(int i=0;i<prlist.size();i++) {
			Product pr=prlist.get(i);
			if(pr.getId()==id) {
				pr.setName(name);
				DisplayProduct(pr);
				break;
			}
		}
	}
	public static void Menu() {
		System.out.println("1)Add a New Product\n2)List All Product\n3)Search Product with ID\n"
				+ "4)Edit Product By Name\n5)Delete Product by ID\n6)Sort By Name\n7)Print Count of Products"
				+ "\n8)Search By Name\n9)Exit");
	}

} 
