package Array;
import java.util.*;
public class AverageSalaryExcludingMaxAndMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Integer salary[]=new Integer[n];
		for(int i=0;i<n;i++)
			salary[i]=sc.nextInt();
		int max=Collections.max(Arrays.asList(salary));
		int min=Collections.min(Arrays.asList(salary));
		int sum=0;
		for(int i=0;i<n;i++) {
			if(salary[i]!=max && salary[i]!=min)
				sum=sum+salary[i];
				
		}
		System.out.println(sum/(n-2));
	}

}
