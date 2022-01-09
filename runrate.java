import java.util.*;
public class runrate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int runs=sc.nextInt();
		int balls=sc.nextInt();
		int target=sc.nextInt();
		int result=RunRate(runs,balls,target);
		System.out.println(res);

	}
	public static int RunRate(int runs,int balls,int target) {
		int r=(target-runs)*6
		int res=r/balls;
		return res;
	}

}
