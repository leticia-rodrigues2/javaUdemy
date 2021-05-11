package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
     List<Employee>list = new ArrayList<> ();
     System.out.print("Enter the number of employees: ");
		int n = entrada.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Employee #" +(i+1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char ch = entrada.next().charAt(0);
			System.out.print("Name: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			System.out.print("Hours: ");
			int hours = entrada.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = entrada.nextDouble();
		
			if (ch =='y') {
				System.out.println("Additional charge: ");
				double adtionalCharge= entrada.nextDouble();
			
				list.add(new OutsourcedEmployee(name,  hours,valuePerHour,adtionalCharge));
				// duas formas possiveis
				//Employee emp = new OutsourcedEmployee(name,  hours,valuePerHour,adtionalCharge);
			  //  list.add(emp);
			}
			else {
				list.add(new Employee(name,hours,valuePerHour));
			
				//duas formas possiveis
				//Employee emp= new Employee(name,hours,valuePerHour);
				//list.add(emp);
			}
			
			}

		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee emp : list) {
			System.out.println(emp.toString());
		}
	
		
		entrada.close();
	}

}
