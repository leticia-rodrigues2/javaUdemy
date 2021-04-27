package udemyContrutores;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner(System.in);

	
		System.out.println("Enter product data: ");
		System.out.println("name: ");
		String name = entrada.nextLine();

		System.out.println("Price: ");
		double price = entrada.nextDouble();

		
Product product = new Product(name, price);

	product.setName ("Computador");
System.out.println("Updata name: "+ product.getName());
product.setPrice(1200);
System.out.println("Updated price: "+ product.getPrice());



		System.out.println("Producyvet data" + product);
		System.out.println();
		System.out.println("Quantida de produto para ser adicionado no estoque");
	int 	quantity = entrada.nextInt();
		product.addProduts(quantity);

		System.out.println();
		System.out.println("Uppdate data: " + product);

		System.out.println();
		System.out.println("Quantida de produto para ser removido no estoque");
		quantity = entrada.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Uppdate data: " + product);

		
	}

}
