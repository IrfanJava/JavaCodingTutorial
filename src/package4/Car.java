package package4;
 
public class Car {
	private String licenseNumber;
	private String model;
	private double currentMileage;
	private int engineSize;
	public String getLicenseNumber() {
		return licenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getCurrentMileage() {
		return currentMileage;
	}
	public void setCurrentMileage(double currentMileage) {
		this.currentMileage = currentMileage;
	}
	public int getEngineSize() {
		return engineSize;
	}
	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	} 
	public Car() {
	}
	public Car(String licenseNumber, String model, double currentMileage, int engineSize) {
		this.licenseNumber = licenseNumber;
		this.model = model;
		this.currentMileage = currentMileage; 
		this.engineSize = engineSize;
	}
	public void findCarList(String model,Car[] cars) {
		int flag=0;
		for(int i=0;i<10;i++) {
			if(cars[i].getModel().equals(model)) {
				System.out.println("License Number is "+cars[i].getLicenseNumber());
				System.out.println("Car Model is "+cars[i].getModel());
				System.out.println("Car provides a Mileage of "+cars[i].getCurrentMileage());
				System.out.println("Engine size of the car is "+cars[i].getEngineSize());
				System.out.println(); 
				flag=1;
			}
		} 
		if(flag==0) {
			System.out.println("No cars found");
		}
	}
	 
}
