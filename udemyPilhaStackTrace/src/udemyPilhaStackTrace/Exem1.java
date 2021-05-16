package udemyPilhaStackTrace;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exem1 {
	public static void main(String[] args) {
		method1();
		System.out.println("End of program");
	}

	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}

	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		System.out.println("# DIGITE A FRASE COM ESPAÇOS PARA CRIAR O VETOR #");
		try {
			String[] vect = sc.nextLine().split(" ");
			System.out.println("Digite a posição do vetor que deseja ver ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
			// quando nao tiver o vetor que vc digitou
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position!");
			//StackTrace mostra o erro em detalhes
			e.printStackTrace();
			sc.next();
			
			// se digitar uma letra ou caractere errado ou seja que não seja um número
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("***METHOD2 END***");
	}

}

