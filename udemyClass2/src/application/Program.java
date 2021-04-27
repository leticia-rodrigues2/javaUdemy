package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
Locale.setDefault(Locale.US);

Scanner entrada = new Scanner(System.in);

Product product =new Product();
System.out.println("Enter product data: ");
System.out.println("name: ");
product.name=entrada.nextLine();

System.out.println("Price: ");
product.price = entrada.nextDouble();

System.out.println("Quantity in stock: ");
product.quantity = entrada.nextInt();

System.out.println(product.name);
System.out.println(product.price);
System.out.println(product.quantity);

System.out.println("Producyvet data"+product);
System.out.println();
System.out.println("Quantida de produto para ser adicionado no estoque");
int quantity=entrada.nextInt();
product.addProduts(quantity);

System.out.println();
System.out.println("Uppdate data: "+ product);

System.out.println();
System.out.println("Quantida de produto para ser removido no estoque");
quantity=entrada.nextInt();
product.removeProducts(quantity);

System.out.println();
System.out.println("Uppdate data: "+ product);







	
	
	entrada.close();
	}

}
