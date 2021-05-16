package udemyFinally;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exem1 {
	public static void main(String[] args) {
		File file = new File("/home/leticia/Área de Trabalho/lets.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} 
		
		//O finally é executado independentemente de terocorrido ou não uma exceção. 
		finally {
			if (sc != null) {
				sc.close();
			}
			System.out.println("***FINALLY EXECUTADO***");
		}
	}
}
