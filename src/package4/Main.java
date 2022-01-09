package package4;
import java.util.*;
import package4.Car;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Car obj=new Car();
		Car cars[]=new Car[10];
		for(int i=0;i<10;i++) {
			System.out.println("Enter Details of Car "+(i+1));
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
		System.out.println("Enter the Car Model you need:");
		String m=sc.next();
		obj.findCarList(m,cars);
	} 
}
