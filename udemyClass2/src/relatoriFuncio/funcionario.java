package relatoriFuncio;

public class funcionario {
	public String nome;
	public double salario ;
	public double taxa;
	public double taxaAumen;
	
	

public double salarioComDesconto() {
		
		return salario-taxa;
		
		
	}



public double salarioComaumento() {
	
	double porcento =  ((salario*taxaAumen)/100);
	
	
	return  porcento;
	
	
}


}
