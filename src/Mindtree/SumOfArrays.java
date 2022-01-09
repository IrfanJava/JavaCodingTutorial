package Mindtree;
import java.util.*;
public class SumOfArrays{
	public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();
      double arr1[]=new double[10];
      double arr2[]=new double[10];
      int res[]=new int[10];
      for(int i=0;i<m;i++)//3 5 10.0 20.0 30.0 20.0 50.0 30.0 70.0 80.0
    	  arr1[i]=sc.nextDouble();
      for(int i=0;i<n;i++)
    	  arr2[i]=sc.nextDouble();
      for(int i=0;i<10;i++){
          res[i]=(int)(arr1[i]+arr2[i]);
      }
      for(int i=0;i<10;i++){
    	  if(res[i]!=0)
    		  System.out.print(res[i]+" ");
    	  else
    		  System.out.print(""); 
      }
    }
}
      
  








