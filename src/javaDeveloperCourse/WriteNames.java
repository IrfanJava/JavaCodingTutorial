package javaDeveloperCourse;
import java.io.*;
import java.util.*;
public class WriteNames {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<6;i++) {
			String s=sc.nextLine();
			list.add(s);
		}
		try {
			PrintWriter pw=new PrintWriter("names.txt");
			for(String j:list) {
				pw.println(j);
			}
			pw.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found!");
			System.out.println(e);
		}
		

	}

}
