import java.util.*;
public class Hello
{
	public static void main(String[] args) {
	
		int k=0;
		int l=0;
		for(int i=0;i<=3;i++) {
			k++;
			if(i==2)
				continue;
			l++;
		}
		System.out.println(k+", "+l);
		
	}
}
