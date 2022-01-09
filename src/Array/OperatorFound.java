package Array;
import java.util.*;
public class OperatorFound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n1 and n2");
		int n1=sc.nextInt();
		if(n1>0) {
			int n2=sc.nextInt();
			if(n2>0) {
				System.out.println("Function answer n3");
				int n3=sc.nextInt();
				if((n1+n2)==n3) {
					if((n1+n2)==n3 && (n1*n2)==n3) {
						System.out.println(+n1+"+"+n2+"="+n3);
						System.out.println(+n1+"*"+n2+"="+n3);
					}else {
						System.out.println(+n1+"+"+n2+"="+n3);
					}
				}
				else if((n1-n2)==n3)
					System.out.println(+n1+"-"+n2+"="+n3);
				else if((n1*n2)==n3)
					System.out.println(+n1+"*"+n2+"="+n3);
				else if((n1/n2)==n3)
					System.out.println(+n1+"/"+n2+"="+n3);
				else if((n1%n2)==n3)
					System.out.println(+n1+"%"+n2+"="+n3);
				else
					System.out.println(n3+" is an invalid answer");
			}
			else {
				System.out.println(n2+" is an invalid number");
			}
		}
		else {
			System.out.println(+n1+" is an invalid number");
		}
	}
}
