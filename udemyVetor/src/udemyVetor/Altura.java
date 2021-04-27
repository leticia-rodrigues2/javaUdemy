package udemyVetor;

import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);

  
  System.out.println("Digite a quantidade de alturas que deseja comprar");
	int n= entrada.nextInt();
	
	double[]vect= new double[n];
	
	for(int i=0; i<n; i++) {
		System.out.println("Didgite a altura:");
	vect[i]=entrada.nextDouble();
	
	}
	
	double soma=0;
	for(int i=0; i< n; i++) {
		soma+=vect[i];
	}
	
	double avg = soma/n;
	
	System.out.printf("A MÉDIA DAS ALTURAS É%.2f%n :" ,avg);
	
	entrada.close();
	}

}
