package javaDeveloperCourse;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FileOutput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			PrintWriter pw=new PrintWriter("names.txt");
			for(int i=0;i<5;i++) {
				pw.println(sc.nextLine());
			}pw.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Can't find file!!!");
			System.out.println(e.getMessage());
		}
	}
}
