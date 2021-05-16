package udemyTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exem1 {
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("# DIGITE A FRASE COM ESPAÇOS PARA CRIAR O VETOR #");
	try
	{
		String[] vect = entrada.nextLine().split(" ");
		System.out.println("Digite a posição do vetor que deseja ver ");
		int position = entrada.nextInt();
		System.out.println(vect[position]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{ // quando nao tiver o vetor que vc digitou
		System.out.println("Posição invalida!");
	}
	catch(InputMismatchException e)
	{ // se digitar uma letra ou caractere errado ou seja que não seja um número
		System.out.println("Erro de entrada");
	}System.out.println("Fim do programa");
	
	entrada.close();
}

}
