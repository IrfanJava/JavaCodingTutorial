package Zenser;
import java.util.*;
public class GCDandconvertingIntoBinary {
    static int findgcd(int a, int b)
    {
      if (b == 0)
        return a;
      return findgcd(b, a % b);
    }
    public static String binaryString(int n) {
    	String b="";
    	b=Integer.toBinaryString(n);
    	return b;
    }
	public static int numberOfOnes(String b) {
		int count=0;
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)=='1')
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		String b=binaryString(findgcd(x,y));
		System.out.println(b);
		System.out.print(numberOfOnes(b));

	}

}
