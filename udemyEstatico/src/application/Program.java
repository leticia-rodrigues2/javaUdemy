package application;

import java.util.Locale;
import java.util.Scanner;

import util.calcukator;



public class Program {
	
	
	
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner entrada = new  Scanner(System.in);
	 
	
	
	System.out.println("Enter radius: ");
	double radius= entrada.nextDouble();
	
	double c = calcukator.circumference(radius);
	
	double v = calcukator.volume(radius);
	

	
	System.out.printf("Circumference: %.2f%n", c);
	System.out.printf("volume : %.2f%n", v);
	System.out.printf("Pi value:  %.2f%n", calcukator.PI);
	
	
	entrada.close();
	}

	
}
