import java.util.*;
public class BinaryToDecimalConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=Integer.toString(n);
		int res=Integer.parseInt(s, 2);
		System.out.println(res);
	}

}
