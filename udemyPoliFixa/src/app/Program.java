package app;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws Exception {
		Scanner entrada = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		 List<Produto>list = new ArrayList<> ();
	System.out.println("Enter the number of products: ");
	int n = entrada.nextInt();
	
	for(int i = 0 ; i<n ; i++) {
		System.out.println("Common, used or imported (c/u/i)?");
		char ch = entrada.next().charAt(0);
		System.out.print("Name: ");
		entrada.nextLine();
		String name = entrada.nextLine();
		System.out.print("Price: ");
		int price = entrada.nextInt();

		if (ch =='i') {
			System.out.println("Additional charge: ");
			double customsFee= entrada.nextDouble();
			
		Produto emp = new ProdutoImportado(name, (double) price,customsFee);
		  list.add(emp);
		}
		else if (ch =='u') {
			System.out.print("Manufacture date (DD/MM/YYYY): ");
			Date date = (Date) sdf.parse(entrada.next());
		
			
		Produto emp = new UsedProduct(name, (double) price,date);
		  list.add(emp);
		}
		else {
			Produto emp = new Produto(name, (double) price);
			  list.add(emp);
		}

		
	}
	

	System.out.println();
	System.out.println("PAYMENTS:");
	for (Produto emp : list) {
		System.out.println( emp.priceTag() );
	}
	}

}
