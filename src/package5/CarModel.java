package package5; 
public class CarModel {
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
	public CarModel() {
	}
	public CarModel(String licenseNumber, String model, double currentMileage, int engineSize) {
		this.licenseNumber = licenseNumber;
		this.model = model;
		this.currentMileage = currentMileage; 
		this.engineSize = engineSize;
	}
	public CarModel[] sortCarList(CarModel[] cars) {
		for(int i=0;i<cars.length;i++) {
			CarModel temp=new CarModel();
			for(int j=i;j<cars.length;j++) {
				if(cars[i].getModel().compareTo(cars[j].getModel())>0) {
					temp=cars[i];
					cars[i]=cars[j];
					cars[j]=temp;
				}
			}
		}
		return cars;
	} 
}
