package week2day4.lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UseEmployee {

	public static void main(String[] args) {

		Employee[] employees = new Employee[5];

		employees[0] = new Employee(100, "Dave", "Sport", 89000);
		employees[1] = new Employee(101, "Maria", "Sport", 90000);
		employees[2] = new Employee(102, "John", "Tech", 129000);
		employees[3] = new Employee(103, "Dave", "Design", 79000);
		employees[4] = new Employee(104, "Dave", "Sport", 11000);

		try(
				FileOutputStream fos = new FileOutputStream("employees.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				)
		{

			oos.writeObject(employees);
			System.out.println("Employees Saved successfully");


		} catch (IOException e) {
			e.printStackTrace();
			return;
		}


		try(
				FileInputStream fis = new FileInputStream("employees.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				)
		{

			Employee[] savedEmployees = (Employee[]) ois.readObject();

			for(Employee emp: savedEmployees) {
				System.out.println(emp);
			}

		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}


	}
}
