package banco;

import java.util.Scanner;

import dadosDobanco.informacoes;
public class mostrarInformar {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String resp;
	double conta1;
		
	 
	  System.out.println("Enter account number:");  
		System.out.println("Digite o número da conta : ");
		conta1= entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Enter account holder:");
		System.out.println("Digite o nome do titula da conta : ");
		String nome= entrada.nextLine();
	
		informacoes dados = new informacoes(nome,conta1);
		
		System.out.println("deseja realizar um deposito incial ? (s)sim (n)não");
		String depositoInicial= entrada.nextLine();
		

		if(depositoInicial.equals("s")) {
			System.out.println("Qual valor deseja deposita ?");
		double valorI= entrada.nextDouble();
		dados.deposito(valorI);
			
			entrada.nextLine();
		}
		do {
		System.out.println("Qual operção você deseja realizar ? ");
		System.out.println("(1) SAQUE ");
		System.out.println("(2) DEPOSITO");
		int resposta = entrada.nextInt();
		
		if(resposta==1) {
			
			System.out.println("Qual valor você deseja retirar");
			dados.saque(entrada.nextDouble());
			entrada.nextLine();
		}
		
		if (resposta == 2) {
		System.out.println("Qual valor você deseja deposita");
		
		dados.deposito( entrada.nextDouble());
		

		entrada.nextLine();
		
		
		}
		
			System.out.println();
			System.out.println("SEU EXTRATO BANCARIO : ");
			
			System.out.print(dados.getConta());
			System.out.print(" Nome "+ dados.getNome() + "  ");
			System.out.println("Saldo R$"+ dados.getSaldoConta() + "  ");

			
			System.out.println("DESJA FAZER UMA NOVA OPERAÇÃO ? (s)Sim (n)Não");
			 resp = entrada.nextLine();
			 
	}while (resp.equals("s"));
	
		entrada.close();
			
			
			
			
		}
		
		
		
	
	}


