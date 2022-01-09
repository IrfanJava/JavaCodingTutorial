package Mindtree;
import java.util.*;
public class class2 {

	public static void main(String[] args) {
		bookStore obj=new bookStore("Daniel Defoe",15.50,1719,"Joseph Conrad");
		System.out.println(obj.getBookTitle());
		System.out.println(obj.getBookPrice());
		System.out.println(obj.getBookYear());
		System.out.println(obj.getBookAuthorname());
		bookStore obj1=new bookStore("Heart of Darkness",12.80,1902,"Pat Conroy");
		System.out.println(obj1.getBookTitle());
		System.out.println(obj1.getBookPrice());
		System.out.println(obj1.getBookYear());
		System.out.println(obj1.getBookAuthorname());
		bookStore obj2=new bookStore("Beach Music",9.50,1996,"Robinson Crusoe");
		System.out.println(obj2.getBookTitle());
		System.out.println(obj2.getBookPrice());
		System.out.println(obj2.getBookYear());
		System.out.println(obj2.getBookAuthorname()); 
	}
}
		
		
//book’s title, its price, its year of publication, and the author’s name
class bookStore{
	private String bookTitle;
	private double bookPrice;
	private int bookYear;
	private String bookAuthorname;
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle; 
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public int getBookYear() {
		return bookYear;
	}
	public void setBookYear(int bookYear) {
		this.bookYear = bookYear;
	}
	public String getBookAuthorname() {
		return bookAuthorname;
	}
	public void setBookAuthorname(String bookAuthorname) {
		this.bookAuthorname = bookAuthorname;
	}
	public bookStore(String bookTitle,double bookPrice,int bookYear,String bookAuthorname) {
		this.bookTitle=bookTitle;
		this.bookPrice=bookPrice;
		this.bookYear=bookYear;
		this.bookAuthorname=bookAuthorname;
	}
	
} 

