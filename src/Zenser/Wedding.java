package Zenser;
import java.util.*;
public class Wedding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=highestPowerof2(n);
		System.out.println(res);

	}
	static int highestPowerof2(int n)
	{
	     
	    int p = (int)(Math.log(n) /Math.log(2));
	    return (int)Math.pow(2, p);
	}

}
