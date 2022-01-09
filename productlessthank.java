import java.util.*;
public class productlessthank {
    static int countsubarray(int array[], int n, int k)
    {
        int count = 0;
        int i, j, mul;
 
        for (i = 0; i < n; i++) {
            if (array[i] < k)
                count++;
 
            mul = array[i];
 
            for (j = i + 1; j < n; j++) {
 
                // Multiple subarray
                mul = mul * array[j];
 
                // If this multiple is less
                // than k, then increment
                if (mul < k)
                    count++;
                else
                    break;
            }
        }
 
        return count;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        int array[] = { 2,4,1 };
        int k = 6;
        int size = array.length;
 
        int count = countsubarray(array, size, k);
        System.out.print(count);
    }

}
