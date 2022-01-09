package package3;
import java.util.*;
public class Main { 

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Cars:");
		int n=sc.nextInt();
		Car cars[]=new Car[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter License Number:");
			String licenseno=sc.next();
			System.out.println("Enter Car Model:");
			String model=sc.next();
			System.out.println("Enter Current Mileage:");
			double mileage=sc.nextDouble();
			System.out.println("Enter Engine Size:");
			int size=sc.nextInt();
			cars[i]=new Car(licenseno,model,mileage,size);
		}
		for(int i=0;i<n;i++) {
			System.out.println("License Number is "+cars[i].getLicenseNumber());
			System.out.println("Car Model is "+cars[i].getModel());
			System.out.println("Car provides a Mileage of "+cars[i].getCurrentMileage());
			System.out.println("Engine size of the car is "+cars[i].getEngineSize());
			System.out.println(); 
		}
	}

}
