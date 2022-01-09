import java.util.*;
public class TheatreSeatDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.length()==10) {
			int count=Integer.parseInt(s.substring(5,7));
			char seat=s.charAt(7);
			int no=Integer.parseInt(s.substring(8,10));
			if((seat+"").matches("[A-Za-z]") && s.substring(8,10).matches("[0-9]*")) {
				for(int i=0;i<count;i++) {
					System.out.print(seat);
					System.out.print(no);
					System.out.println();
					no++;
				}
			}
			else {
				System.out.println("Invalid Seat Number");
			}
		}
		else {
			System.out.println("Invalid Input");
		}
	}
}
