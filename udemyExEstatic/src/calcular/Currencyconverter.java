package calcular;

public class Currencyconverter {


	public static double custo (double dollars,double price) {
		double totalReais= dollars*price;
		double porcento= (totalReais*6)/100;
		
		
		return totalReais + porcento ;
	}
}

