package Principal;

import java.util.Scanner;

import app.Aplicacao;

public class Programa {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nome ,email;
		int qntd , nQuarto;

		
		System.out.println("Digite a quentidade quartor a ser reservado");
		int n = entrada.nextInt();
		Aplicacao[] vect = new Aplicacao[n];

	
	for (int i=0; i<n ;i++) {
		System.out.println("Qual é o numero do qurto");
		nQuarto=entrada.nextInt();
		entrada.nextLine();
		System.out.println("Nome:");
		nome =entrada.nextLine();
		entrada.nextLine();
		System.out.println("Email");
		email=entrada.nextLine();
		System.out.println("Quantidade de pessoas no quarto");
		qntd=entrada.nextInt();
		vect[i] = new Aplicacao(nQuarto,nome,email, qntd);
		
		
	
		

		

	}
	
	
	System.out.println();
	
	for (int i=0; i<vect.length; i++) {
	if (vect[i] != null) {
	System.out.println(i + " " + vect[i]);
	}
	
	
	
	
	

			
			
		
	
	
	
	
	
	
	entrada.close();
		
		
		
		
		
	
	
	
		
	}

}
}
