package Mindtree;

import java.util.*;

public class SpecialNum {
	public static int factorialSum(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int flag=0;
			int sum1=sum(arr[i]);
			int factsum=factorial(sum1);
			String n=arr[i]+"";
			String ns[]=n.split("");
			String f=factsum+"";
			String fs[]=f.split("");
			for(int j=0;j<3;j++) {
				if(f.contains(ns[j])) {
					flag=1;
					break;
				}
			}
			if(flag==1)
				count++;
			
		}
		return count;
	}
	
	public static int sum(int n) {
        int sum = 0;
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
	}
	public static int factorial(int n) {
		int res=1;
		for(int i=1;i<=n;i++) {
			res=res*i;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int array_length;
		array_length=scan.nextInt();
		int[] arr=new int[array_length];
		for(int j=0;j<array_length;j++) {
			arr[j]=scan.nextInt();
		}
		int result;
		result=factorialSum(arr);
		System.out.println(result);
		return;

	}

}
