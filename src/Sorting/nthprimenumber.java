package Sorting;
import java.util.*;
public class nthprimenumber {
	public static void main(String[] args)   
	{    
	Scanner sc = new Scanner(System.in);  
	int input1 = sc.nextInt();   
	int num=1, count=0, i;  
	while (count < input1)  
	{  
	num=num+1;  
	for (i = 2; i <= num; i++)  
	{      
	if (num % i == 0)   
	{  
	break;  
	}  
	}  
	if (i == num)  
	{  
	count = count+1;  
	}  
	}   
	System.out.println(num);  
	}

}
