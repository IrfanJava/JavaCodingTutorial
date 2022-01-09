package Mindtree;
import java.util.*;
public class timeangle {
	static float angle(String time)
    {	
		String str[]=time.split(":");
		int h=Integer.parseInt(str[0]);
		int m=Integer.parseInt(str[1]);
        if (h <0 || m < 0 || h >12 || m > 60)
            System.out.println("Wrong input");
 
        if (h == 12)
            h = 0;
        if (m == 60){
        m = 0;
        h += 1;
        if(h>12)
          h = h-12;
        }
        float hour_angle = (float)(0.5 * (h*60 + m));
        float minute_angle = (float)(6*m);
 
        float angle = Math.abs(hour_angle - minute_angle);

        angle = Math.min(360-angle, angle);
 
        return angle;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String time=sc.next();
		float result;
		result=angle(time);
		System.out.println(result);
		return;
	}

}
