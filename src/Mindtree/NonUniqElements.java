package Mindtree;
import java.util.*;
class NonUniqElements{
    public static int [] uniqElements(int array1[], int array2[]){
        int res[]=new int[30];
        int temp=0;
        for(int i=0;i<array1.length;i++){
            for(int j=i;j<array2.length;j++){
                if(array1[i]!=array2[j]){
                    res[temp]=array1[i];
                    temp++;
                }
            }
        }
        return res;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int arr1[]=new int[m];
        int arr2[]=new int[m];
        for(int i=0;i<m;i++)
            arr1[i]=sc.nextInt();
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int res[]=uniqElements(arr1,arr2);
        for(int i=0;i<res.length;i++){
            if(res[i]!=0){
                System.out.print(res[i]+" ");
            }
            else{
                System.out.print("");
            }
        }
    }
}