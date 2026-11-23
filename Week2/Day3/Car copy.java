package week2day3;

public class Car extends Vehicle{
	
	int insurance;
	
	public Car(String vehicleNumber, String model, int ratePerDay, int days, int insurance) {
		super(vehicleNumber, model, ratePerDay, days);
		this.insurance = insurance;
	}

	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}

	@Override
	public double calculateRent() {
		int insuranceRate = this.days * insurance;
		return super.calculateRent() + insuranceRate;
	}

	@Override
	public void displayDetails() {
		System.out.println("Car |" + "Vehicle Num: " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + this.calculateRent());
	}	
	
}
