package apliction;

import java.util.Scanner;

import etities.triangle;

public class progrm { 

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		
		triangle x, y;
		x = new triangle();
		y = new triangle();
		
		System.out.println("Digite os numero do Tiangulo X");
		x.a=entrada.nextDouble();
		x.b=entrada.nextDouble();
		x.c=entrada.nextDouble();
		double areaX =x.area();
		
		System.out.println("Digite os numero do Tiangulo Y");
		y.a=entrada.nextDouble();
		y.b=entrada.nextDouble();
		y.c=entrada.nextDouble();
		
	
	    double areaY=y.area();
	    System.out.println("A area do trianguloX é : " +areaX);
	    System.out.println();
	    System.out.println("A area do trianguloX é : "+areaY);
	   
	    
		if (areaX > areaY){
			System.out.println("A maior area é a do Triangulo X");
			
		}
		else {
			System.out.println("A maior area é a do Triangulo Y");
			

		}
		
		
		
		
		
entrada.close();
	}

}
