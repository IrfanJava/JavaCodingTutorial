package javaDeveloperCourse;
import java.util.*;
import java.io.*;
public class MultiplyNumsFromFileby2 {

	public static void main(String[] args) {
		Scanner numfile;
		PrintWriter pw;
		try {
			numfile=new Scanner(new File("nums.txt"));
			pw=new PrintWriter("twice.txt");
			while(numfile.hasNext()) {
				int num=numfile.nextInt();
				pw.println(num*2);	
			}
			numfile.close();
			pw.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found!");
			System.out.println(e);
		}

	}

}
