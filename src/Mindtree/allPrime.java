package Mindtree;
//start coding a new Program
import java.util.*;
class allPrime{
  public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();
      printprime(m,n);
  }
  static int isPrime(int n){
      int flag=0;
      if(n==0)
    	  return 0;
      for(int i=2;i<=n/2;i++){
          if(n%i==0){
              flag=1;
              break;
          }
      }
      if(flag==1)
          return 0;
      return 1;
  }
  static void printprime(int m,int n){
      for(int i=m;i<=n;i++){
          if(isPrime(i)==1){
              System.out.print(i+" ");
          }
      }
  }
}









//Click Enter to expand window