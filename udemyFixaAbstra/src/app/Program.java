package app;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Contribuinte #" + i + " data:");
			System.out.print("IPessoa física ou jurídica (f / j)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salário anual ? ");
			double salaAnu = sc.nextDouble();
			if (type == 'f') {
				System.out.print("Gastos com saúde:");
				double despeSaude = sc.nextDouble();
				list.add(new Individual( name,salaAnu,despeSaude));
			}
			else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name,salaAnu, numberOfEmployees));
			}
		}

		double sum = 0.0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		for (TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL IMPOSTOS $ " + String.format("%.2f", sum));
		
		sc.close();
	}
}