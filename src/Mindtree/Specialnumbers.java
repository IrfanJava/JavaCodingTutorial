package Mindtree;
import java.util.*;
public class Specialnumbers {
    static int MaxNum(int num)
    {
        int count[] = new int[10];
        String str = Integer.toString(num);
        for(int i=0; i < str.length(); i++)
            count[str.charAt(i)-'0']++;
        int result = 0, multiplier = 1;
        for (int i = 0; i <= 9; i++)
        {
            while (count[i] > 0)
            {
                result = result + (i * multiplier);
                count[i]--;
                multiplier = multiplier * 10;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        	arr[i]=sc.nextInt();
        for(int i=0;i<n;i++) {
        	if(arr[i]==MaxNum(arr[i]))
        		count++;
        }
        System.out.println(count);
    }
}

