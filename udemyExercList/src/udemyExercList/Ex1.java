package udemyExercList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		List <Empresa>list = new ArrayList< > ();
	  
		int n;
		System.out.println("How many employees will be registered? ");
	    n= entrada.nextInt();
	    
	    for (int i =0 ; i<n ; i++) {
	    	System.out.print("Id: ");
	    	int id = entrada.nextInt();
	    	entrada.nextLine();
	    	System.out.print("Nome : ");
	    	String nome= entrada.nextLine();
	    	System.out.print("Salario: ");
	    	int salario = entrada.nextInt();
	    	 list.add(new Empresa (id, nome ,salario));
	    }
	    
	    for (Empresa x : list) {
			System.out.println(x.toString());
		}
	    
	}

}
