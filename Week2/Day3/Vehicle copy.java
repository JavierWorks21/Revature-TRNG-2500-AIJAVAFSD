package week2day3;

public class Vehicle {
	
	String vehicleNumber;
	String model;
	int ratePerDay;
	int days;
	
	public Vehicle(String vehicleNumber, String model, int ratePerDay, int days) {
		this.vehicleNumber = vehicleNumber;
		this.model= model;
		this.ratePerDay = ratePerDay;
		this.days = days;
		
	}
	
	public double calculateRent() {
		return ratePerDay * days;
	}
	
	public void displayDetails() {
		System.out.println("Vehicle Num: " + vehicleNumber + " | " + model + " | Days: " + days + " | Rent: " + this.calculateRent());
	}

}
