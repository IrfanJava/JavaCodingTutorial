package package3; 
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
	public Car(String licenseNumber, String model, double currentMileage, int engineSize) {
		this.licenseNumber = licenseNumber;
		this.model = model;
		this.currentMileage = currentMileage;
		this.engineSize = engineSize;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
}
