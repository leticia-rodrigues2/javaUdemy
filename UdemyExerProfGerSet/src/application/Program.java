package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
        Account account;
		
		System.out.println("Entet account numeber");
		int number = entrada.nextInt();
		
		System.out.println("Entet account holder");
		entrada.nextLine();
		String holder= entrada.nextLine();
		System.out.println("IS there intial desit (y/n) ?");
        char response= entrada.next().charAt(0);
        
        
        if (response =='y') {
        	System.out.println("Enter intial deposit value");
        	double initialDeposit = entrada.nextDouble();
        	account= new Account (number, holder,initialDeposit );;
        }
        
        else {
        	account= new Account (number, holder);
        }
        
        System.out.println();
	System.out.println("Account data? ");
	System.out.println(account);
	
	System.out.println();
	System.out.print("Enter deposit value");
	double depositValue= entrada.nextDouble();
	account.deposit(depositValue);
	System.out.println("Updated account data: ");
	System.out.println(account);
	
	System.out.println();
	System.out.print("Enter withhdraw value");
	double witchdrawValue= entrada.nextDouble();
	account.withdraw(witchdrawValue);
	System.out.println("Updated account data: ");
	System.out.println(account);
	
	
	entrada.close();
	}

}
