package Mindtree;
import java.util.*;
public class AcidBaseSolution {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=n;i>=2;i--) {
			for(int j=i-1;j>=1;j--) {
				count++;
			}
		}
		System.out.println(count);

	}

}
