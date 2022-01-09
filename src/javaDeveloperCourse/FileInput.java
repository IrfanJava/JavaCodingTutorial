package javaDeveloperCourse;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class FileInput {

	public static void main(String[] args) {
		Scanner infile;
		int sum=0;
		try {
			infile=new Scanner(new File("input.txt"));
			while(infile.hasNext()) {
				String n=infile.nextLine();
				System.out.println(n);
				sum+=Integer.parseInt(n);
			}
			infile.close();
			System.out.println("Sum of Numbers in file is: "+sum);
		}
		catch(FileNotFoundException e) {
			System.out.println("Can't Find File!");
			System.out.println(e.getMessage());
		}
	}
}
