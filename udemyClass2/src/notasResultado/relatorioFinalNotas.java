package notasResultado;

import java.util.Scanner;

import calcularNotas.guardarNotar;

public class relatorioFinalNotas {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		
		guardarNotar aluno;
		aluno = new guardarNotar();
		
		System.out.println("Nome do aluno");
		aluno.nome=entrada.nextLine();
		
		System.out.println("Qual foi a nota no 1 semestre ?");
		aluno.nota1=entrada.nextDouble();
		
		System.out.println("Qual foi a nota no 2 semestre ?");
		aluno.nota2=entrada.nextDouble();
		
		System.out.println("Qual foi a nota no 3 semestre ?");
		aluno.nota3=entrada.nextDouble();
		
		double notaFinal=aluno.calcularNotas();
		
		if (notaFinal >=60) {
			System.out.println("APROVADO ");
			System.out.println(" SUA NOTA FOI "+ notaFinal);
			
			
			
		}
		else {
			System.out.println("REPROVADO ");
			System.out.println( "SUA NOTA FOI "+ notaFinal);
			System.out.println("Faltaram " + (60-notaFinal) + " pontos para você ser aprovado");
		}

	}

}
