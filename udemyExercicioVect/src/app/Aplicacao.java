package app;

public class Aplicacao {
	private int nQuarto;
	public int getnQuarto() {
		return nQuarto;
	}



	public void setnQuarto(int nQuarto) {
		this.nQuarto = nQuarto;
	}



	private String nome;
	 private String email;
	 private int qntd;
	
	 
	 
	 
 


public Aplicacao(int nQuarto,String name, String email, int qntd) {
		super();
		this.nQuarto = nQuarto;
		this.nome = name;
		this.email = email;
		this.qntd= qntd;
	}



public String getName() {
	return nome;
}



public void setName(String name) {
	this.nome = name;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}
public int getQntd() {
	return qntd;
}



public void setQntd(int qntd) {
	this.qntd = qntd;
}

public String toString() {
return  nQuarto + "Nome :"+nome + ",email : " + email +" Qauntidade de pessoas no quarto"+qntd;
}

	
}
