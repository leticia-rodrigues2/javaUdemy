package udemyExcMatriz;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
Scanner entrada= new Scanner(System.in);
		
		int n = entrada.nextInt();
		int m = entrada.nextInt();
		int[][] mat = new int[n][m];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = entrada.nextInt();
			}
		}
		
		int opc ;
		opc=entrada.nextInt();
		


		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == opc) {
					
					System.out.println();
					System.out.println("Position " + i + "," + j + ":");
					
					if (i < mat.length-1) {
						System.out.println("Numero embaixo: " +mat[(i+1)][j]  );
					}
					
					 if (i!=0) {
						System.out.println("Numero emcima: " +mat[(i-1)][j]  );
						}
					 
					 if (j>=0) {
							System.out.println("Numero a esquerda " +mat[i][(j-1)]  );
							}
							
					  if (j < mat[i].length-1) {
								System.out.println("Numero a direita " +mat[i][(j+1)]  );
								}
				}
			}
		}
	
}
}
