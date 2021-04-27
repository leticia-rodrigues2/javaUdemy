package dadosDobanco;

public class informacoes {
private String nome;
private double conta;
private double saldoConta=0;
private double saque ;
private double deposito;
private double depositoIncial;
private double valorinicial;


public informacoes(String nome, double conta) {
	this.nome = nome;
	this.conta = conta;
}




public informacoes(String nome, double conta, double depositoIncial) {
	super();
	this.nome = nome;
	this.conta = conta;
	deposito = (depositoIncial);
}




public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}


public double getConta() {
	return conta;
}

public  double getSaldoConta() {
	

	return saldoConta;
	
}

public void saque (double saque) {
	saldoConta -= saque +5;
}

public void setDepositoIncial(double depositoIncial) {
	this.depositoIncial = depositoIncial;
	
}

public void deposito(double deposito) {
	saldoConta += deposito;
	
}

public double getDepositoIncial(double saldoConta) {
	saldoConta =+ valorinicial;
	return depositoIncial;
}
public void setValorinicial(double valorinicial) {
	this.valorinicial = valorinicial;
}


}
