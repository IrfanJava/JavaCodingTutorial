package Mindtree;
import java.util.*;
class Shapes{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();//
      if(s.equals("triangle")){
          int b=sc.nextInt();
          int h=sc.nextInt(); 
          System.out.println(TriArea(b,h));
      }
      else if(s.equals("square")){
          int a=sc.nextInt();
          System.out.println(SquareArea(a));
      }
      else if(s.equals("rectangle")){
          int l=sc.nextInt();
          int b=sc.nextInt();
          System.out.println(RectArea(l,b));
      }
      else if(s.equals("circle")){
          int r=sc.nextInt();
          System.out.println(CircleArea(r));
      }
  }
  static double TriArea(int b,int h){
      return 0.5*b*h;
  }
  static double SquareArea(int s){
      return s*s;
  }
  static double RectArea(int l,int b){
      return l*b;
  }
  static double CircleArea(int r){
      return 3.14*r*r;
  }
}




 




//Click Enter to expand window
