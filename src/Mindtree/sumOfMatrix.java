package Mindtree;
import java.util.*;
class sumOfMatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr1[][]=new int[m][n];
        int arr2[][]=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        int sum[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            } 
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }    
    }
}

