package package5;
import java.util.*; 
import package5.CarModel;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Cars");
		int n=sc.nextInt();
		CarModel cars[]=new CarModel[n];
		CarModel obj=new CarModel();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Details of Car "+(i+1));
			System.out.println("Enter License Number:");
			String licenseno=sc.next();
			System.out.println("Enter Car Model:");
			String model=sc.next();
			System.out.println("Enter Current Mileage:");
			double mileage=sc.nextDouble();
			System.out.println("Enter Engine Size:");
			int size=sc.nextInt();
			cars[i]=new CarModel(licenseno,model,mileage,size);
		}
		CarModel res[]=obj.sortCarList(cars);
		System.out.println("List of Cars after sorting based on Model Name");
		for(int i=0;i<n;i++) {
			System.out.println("License Number is "+cars[i].getLicenseNumber());
			System.out.println("Car Model is "+cars[i].getModel());
			System.out.println("Car provides a Mileage of "+cars[i].getCurrentMileage());
			System.out.println("Engine size of the car is "+cars[i].getEngineSize());
			System.out.println();
		}
	}
} 
