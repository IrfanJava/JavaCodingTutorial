package Array;
import java.util.*;
public class Fountaingarden {

    static int minCntFoun(int a[], int N)
    {
        int[] dp = new int[N];
        for(int i=0;i<N;i++)
        {
             dp[i]=-1;
        }
        int idxLeft;
        int idxRight;
        for (int i = 0; i < N; i++)
        {
            idxLeft = Math.max(i - a[i], 0);
            idxRight = Math.min(i + (a[i] + 1), N);
            dp[idxLeft] = Math.max(dp[idxLeft],
                                   idxRight);
        }
        int cntfount = 1;

        int idxNext = 0;
        idxRight = dp[0];
 
        for (int i = 0; i < N; i++)
        {
            idxNext = Math.max(idxNext, dp[i]);
            if (i == idxRight)
            {
                cntfount++;
                idxRight = idxNext;
            }
        }
        return cntfount;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a[]=new int[N];
        for(int i=0;i<N;i++)
        	a[i]=sc.nextInt();
        System.out.print(minCntFoun(a, N));
    }
}
