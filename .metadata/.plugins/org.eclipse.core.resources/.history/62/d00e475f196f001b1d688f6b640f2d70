import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int total = 0;
		double media = 0;

		double[] vetorA = new double[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("digite um valor :");
			vetorA[i] = entrada.nextDouble();
		}
		int qntdImp = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				qntdImp++;

			}
		}
		
			int qntdPar = 0;

			for (int i = 0; i < vetorA.length; i++) {
				if (vetorA[i] % 2 == 0) {
					qntdPar++;

				}

			}
		
		
	System.out.println("A procentagem de impar é : "+(100*qntdImp)/10);
	System.out.println("A procentagem de par é : "+(100*qntdPar)/10);
	}

}
