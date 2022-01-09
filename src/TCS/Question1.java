package TCS;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		if(r>=20 && r<=30) {
			double a=(3.14159)*r*r;
			System.out.printf("%.2f",a);
		}
		else {
			System.out.println("Wrong Radius Entry");
		}

	}

}
