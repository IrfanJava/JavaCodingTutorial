package javaDeveloperCourse;
import java.util.*;
import java.io.*;
public class FileInputOutput {
	public static void main(String[] args) {
		Scanner infile;
		PrintWriter pw;
		try {
			infile=new Scanner(new File("InputOutput"));
			Scanner sc=new Scanner(System.in);
			while(infile.hasNext()) {
				String s=infile.nextLine();
				System.out.println(s);
			}
			infile.close();
			pw=new PrintWriter("InputOutput");
			for(int i=0;i<10;i++) {
				System.out.println("Enter Names to be written in the File InputOutput ");
				String a=sc.nextLine();
				pw.println(a);
			}pw.close();
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	} 
}
