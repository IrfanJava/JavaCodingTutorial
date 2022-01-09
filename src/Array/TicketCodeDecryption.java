package Array;
import java.util.*;
public class TicketCodeDecryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(s.length()==6) {
			char gate=s.charAt(0);
			if(gate=='N' || gate=='E' || gate=='W' || gate=='S') {
				char block=s.charAt(1);
				if(block=='A'|| block=='B' || block=='C' || block=='D'|| block=='E' || block=='F') {
					char floor=s.charAt(2);
					if(floor=='1' || floor=='2' ||floor=='3' ||floor=='4') {
						int number=Integer.parseInt(s.substring(3,6));
						if(number>=0 && number<=500) {
							System.out.println("Gate is "+gate);
							System.out.println("Block is "+block);
							System.out.println("Floor is "+floor);
							System.out.println("Seat is "+number);
						}
						else {
							System.out.println("Invalid Number");
						}
					}
				}
			}
			else {
				System.out.println("Invalid Gate Name");
				return;
			}
		}
	}

}
