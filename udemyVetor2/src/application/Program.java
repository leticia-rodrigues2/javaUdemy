package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
Scanner entrada = new Scanner (System.in);
 
int n = entrada.nextInt();

Product[] vect = new Product[n];
for (int i=0; i<vect.length; i++) {
	entrada.nextLine();
	
	System.out.println("Digite o nome do produto");
	String name = entrada.nextLine();
	System.out.println();
	
	System.out.println("Digite o preço");
	double price = entrada.nextDouble();
	vect[i] = new Product (name, price);
	
	
	
}


double sum=0;
for (int i=0; i<vect.length ; i++) {
	sum+= vect[i].getPrice();
}

double avg = sum/n ;

System.out.printf("A média de valores é = %.2f%n", avg);



entrada.close();
	}

}
