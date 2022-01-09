package Virtusa;
import java.util.*;
public class MinNoOfSteps {

	public static void main(String[] args) {
		MinNoOfSteps obj=new MinNoOfSteps();
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println(obj.minsteps(m, n));

	}
	public int minsteps(int input1,int input2) {
		int count=0;
		int m=1,n=1;
		while(!(m==input1 && n==input2)) {
			if(input1>input2) {
				n=m+n;
				count++;
			}
			else {
				m=m+n;
				count++;
			}
			if(m==input1 && n==input2) {
					break;
			}
		}
		if(count>0)
			return count;
		return -1;
	}

}
