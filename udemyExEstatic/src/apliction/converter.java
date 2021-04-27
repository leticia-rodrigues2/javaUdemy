package apliction;

import java.util.Scanner;

import calcular.Currencyconverter;

public class converter {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		
		
System.out.println("What is the dollar price ?");
System.out.println("Qual é o valor do dolar ?");
double price = entrada.nextDouble();


System.out.println("How many dollars will de bought ?");
System.out.println("Quantos dolarares vocÊ deseja comprar?");
double dollars = entrada.nextDouble();

double total = Currencyconverter.custo(dollars, price);
	
	System.out.printf("Amount to be paid in reis:%.2f%n " , total);
	System.out.printf("Você precissa de valor em reais: %.2f%n " , total);
	
	
	}

}
