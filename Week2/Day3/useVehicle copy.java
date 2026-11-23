package week2day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class useVehicle {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		List<Vehicle> vehicles = new ArrayList<>();
		double totalRent = 0;
		
		System.out.println("Enter Number of Vehicles: ");
		int carAmmount = input.nextInt();
		
		while(carAmmount > 0 ) {
			System.out.println("Enter type (Car - 1 | Bike - 2): ");
			int option = input.nextInt();
			
			if(option == 1) {
				System.out.println("Enter vehicle number: ");
				input.nextLine();
				String vehicleNum = input.nextLine();
				
				System.out.println("Enter model: ");
				String model = input.nextLine();
				
				System.out.println("Enter rate per day: ");
				int ratePerDay = input.nextInt();
				
				System.out.println("Enter days: ");
				int days = input.nextInt();
				
				System.out.println("Enter Insurance per day: ");
				int insurance = input.nextInt();
				
				Vehicle v = new Car(vehicleNum, model, ratePerDay, days, insurance);
				vehicles.add(v);
				
				carAmmount--;
			} else if(option == 2) {
				System.out.println("Enter vehicle number: ");
				String vehicleNum = input.nextLine();
				input.nextLine();
				
				System.out.println("Enter model: ");
				String model = input.nextLine();
				
				System.out.println("Enter rate per day: ");
				int ratePerDay = input.nextInt();
				
				System.out.println("Enter days: ");
				int days = input.nextInt();
				
				Vehicle b = new Bike(vehicleNum, model, ratePerDay, days);
				vehicles.add(b);
				
				carAmmount--;
			} else {
				    System.out.println("Invalid vehicle type. Please try again.");
				}
			
				
		
			}
			
		System.out.println("--- Rental Details ---");

		for (Vehicle v : vehicles) {
		    v.displayDetails();
		    totalRent += v.calculateRent();
		}

		System.out.println("Total Rent Collected: " + totalRent);
			
		input.close();
			
		}

	}

