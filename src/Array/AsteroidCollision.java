package Array;
import java.util.*;
public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        if (asteroids.length <= 1) return asteroids;  // Handling Corner cases
        
        Stack<Integer> stack = new Stack<>();
        for (int asteriod : asteroids) {
            if (asteriod > 0) { // Pushing all +ve asteroids
                stack.push(asteriod);
            } else {
                // Remove all positive asteroids before our current asteroid
                while (!stack.isEmpty() && stack.peek() > 0 && Math.abs(stack.peek()) < Math.abs(asteriod))  
                    stack.pop();
                // Checking if the stack is empty or the recent asteriod is negative!
                if (stack.isEmpty() || stack.peek() < 0) 
                    stack.push(asteriod);
                // If recent asteriod <= our asteriod, We broke our outer loop if equal we pop it.
                else if (stack.peek() == Math.abs(asteriod)) 
                    stack.pop();
            }
        }
        
        int[] output = new int[stack.size()];
        for (int i = output.length - 1; i >= 0; i--)
            output[i] = stack.pop();
        
        return output;
    }
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int res[]=asteroidCollision(arr);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");
	}
}