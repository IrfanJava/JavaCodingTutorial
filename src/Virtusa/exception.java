package Virtusa;

import java.util.*;

public class exception {
	public static void main (String[] args)
    {
        // Initializing String variable with null value
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        String str = null;
        String message = (str == null) ? "" :
                          str.substring(0,n);
        System.out.println(message);
  
        // Initializing String variable with null value
        str = "xyzxecjds";
        message = (str == null) ? "" : str.substring(0,n);
        System.out.println("null");
    }

}
