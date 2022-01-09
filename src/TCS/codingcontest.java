package TCS;
import java.util.*;
public class codingcontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d,flag=0;
		int s=0;
		List<Integer> list=new ArrayList<>();
		if(n<10000) {
			for(int i=2;i<=n;i++) {
				int temp=i;
				while(i!=0) {
					d=i%10;
					s+=d*d*d;
					i/=10;
				}
				if(s==temp) {
					list.add(temp);
					flag=1;
					
				}

			}
			if(flag==0) {
				System.out.println("Wrong Input");
			}
			System.out.println(list);
		}
		else if(n>=10000) {
			System.out.println("Wrong Input");
		}


	}

}
