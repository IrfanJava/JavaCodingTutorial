package Array;
import java.util.*;
public class sum {


	    public static void main (String[] args) throws Exception
	    {
	    	Scanner sc=new Scanner(System.in);
	    	int n=sc.nextInt();
	    	int k=sc.nextInt();
	        int result=FindSum(n,k);
	        System.out.println(result);
	 
	    }
	    static int FindSum(int n,int k) throws java.lang.Exception
	    {
	    	int sum=0;
	    	for(int i=1;i<=n;i++) {
	    		if(i%k!=0)
	    			sum+=i;
	    	}
	    	return sum;
	    }
}
