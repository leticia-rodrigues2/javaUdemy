package aplicacao;

import java.util.Scanner;

import calculoretan.retangulo;

public class progamaRetan {
 
	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		
		retangulo x;
		
		 x = new retangulo();
		
		System.out.println("Digite a altura");
		x.altura=entrada.nextDouble();
		
		System.out.println("Digite a largura");
		x.largura=entrada.nextDouble();
		
		
		double area=x.area();
		
		System.out.println("A area do retangulo é : " + area + " metros quadrados");
		
		double peri= x.perime();
		System.out.println("O perimetro do retangulo é: "+ peri);
		
		double diago = x.diagonal();
		System.out.println("A diagonal é: "+ diago);
		

	}

}
