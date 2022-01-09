import java.util.*;
public class BikeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		if(name.matches("[a-zA-Z]*")) {
			System.out.println("Enter the time duration");
			int time=sc.nextInt();
			if(time>=1 && time<=24) {
				System.out.println("List of payment options");
				System.out.println("1) Visa card");
				System.out.println("2) Rupay card");
				System.out.println("3) Master card");
				System.out.println("Choose an option");
				int option=sc.nextInt();
				while(!(option>0 && option<=3)){
					System.out.println("Try again!");
					option=sc.nextInt();
				}
				double d=0;
				if(time>=5) {
					if(option==1)
						d=0.25;
					else if(option==2)
						d=0.17;
					else if(option==3)
						d=0;
				}
				double amt=120*time;
				amt=amt-d*amt;
				System.out.printf("Dear %s your bill amount is %.2f",name,amt);
			}
			else {
				System.out.println(time+" is an invalid time duration");
				return;
			}
		}
		else {
			System.out.println(name+" is an invalid name");
		}
		
	}

}
