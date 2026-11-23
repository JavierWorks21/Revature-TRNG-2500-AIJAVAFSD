package week2day3;

public class Bike extends Vehicle{
	
	double discount = .1;
	
	public Bike(String vehicleNumber, String model, int ratePerDay, int days) {
		super(vehicleNumber, model, ratePerDay, days);
	}

	@Override
	public double calculateRent() {
		double offRent = super.calculateRent() * discount;
		return super.calculateRent() - offRent;
	}

	@Override
	public void displayDetails() {
		System.out.println("Bike |" + "Vehicle Num: " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + this.calculateRent());
	}
	
	

}
