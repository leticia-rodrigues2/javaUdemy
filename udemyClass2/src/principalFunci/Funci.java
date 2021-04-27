package principalFunci;

import java.util.Scanner;

import relatoriFuncio.funcionario;
class Funci {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		
		funcionario x;
		
		x= new funcionario();
		
		System.out.println("Digite seu nome: ");
		x.nome=entrada.nextLine();
		
		System.out.println("Digite seu salario: ");
		x.salario=entrada.nextDouble();
		
		System.out.println("Digite a taxa de imposto");
		x.taxa=entrada.nextDouble();
		
		System.out.println("Digite a taxa de aumento");
		x.taxaAumen=entrada.nextDouble();
		
		
		
		System.out.println("Funcionario: "+ x.nome +" $ "+ x.salario);
		
		System.out.println("A taixa a se incremetada no salario é de : " + x.taxaAumen +"%");
		
		
		double salario2=x.salarioComDesconto();
		double aumento=x.salarioComaumento();
		
		System.out.println("Seu salario é de: "+x.nome+" $ "+ (salario2+aumento) );
		
		
		
		
	}

}
