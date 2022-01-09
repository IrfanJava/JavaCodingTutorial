package TCS;
import java.util.*;
public class animalcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=n/100;
		if(res%2==0)
			res=res+1;
		else
			res=res;
		System.out.println(res);
	}

}
