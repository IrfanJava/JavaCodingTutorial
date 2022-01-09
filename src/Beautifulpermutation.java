import java.util.*;
public class Beautifulpermutation {
		static void column(String s)
		{
		    int result = 0;
		    for (int i =0; i < s.length(); i++)
		    {
		        result *= 26;
		        result += s.charAt(i) - 'A' + 1;
		    }
		    System.out.println(result);
		}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
			String input1=sc.next();
			column(input1);
		}

}
