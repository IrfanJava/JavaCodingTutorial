import java.util.*;
public class LunchTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day interval of Tony");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Enter the day interval of Potts");
			int b=sc.nextInt();
			if(b>0) {
				int res=lcm(a,b);
				System.out.println("Tony and Potts will have lunch together on day "+res);
			}
			else {
				System.out.println(b+" is not a valid day");
			}
		}
		else {
			System.out.println(a+" is not a valid day");
		}
	}
	static int lcm(int a,int b) {
		int temp=a;
		while(true) {
			if(temp%a==0 && temp%b==0) {
				break;
			}
			temp++;
		}
		return temp;
	}

}
