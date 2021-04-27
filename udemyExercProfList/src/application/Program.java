package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		List<Funcionario>list = new ArrayList<>();
		System.out.println("Quantidade de fucncionarios");
		int n = entrada.nextInt();
		
		for (int i =0 ; i<n ;i++) {
			System.out.println();
			System.out.println("Emplyoee # " + (i+1) + " : ");
			System.out.println("Id: ");
			Integer id = entrada.nextInt();	
			System.out.println("Name: ");
			entrada.nextLine();
			String name = entrada.nextLine();
			System.out.println(" Salary: " );
			Double salary = entrada.nextDouble();
			
			Funcionario emp = new Funcionario(id, name, salary);
			
			list.add(emp);
		}
			System.out.println("Enter the employee id that will have salary increase :");
			int idSalary=entrada.nextInt();  
			Integer pos = position(list,idSalary);
			
			 if (pos == null) {
				 System.out.println("This not exist !");
			 }
			 else {
				 System.out.println("Enter the porcetege");
				 double porcent = entrada.nextDouble();
				 
				 list.get(pos).increaseSalary(porcent);
			 }
			
			 System.out.println();
			 System.out.println("List of employees: ");
			 System.out.println();
			for(Funcionario emp : list) {
				System.out.println(emp);
			}
	
	
		
		entrada.close();
	}

	public static Integer position(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
}
}