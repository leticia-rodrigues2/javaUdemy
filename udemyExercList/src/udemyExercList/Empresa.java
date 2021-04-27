package udemyExercList;

public class Empresa {
private Integer id;
private String nome;
private Integer salario;


public Empresa(Integer id, String nome, Integer salario) {
	super();
	this.id = id;
	this.nome = nome;
	this.salario = salario;
}


public Integer getId() {
	return id;
}


public void setId(Integer id) {
	this.id = id;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public Integer getSalario() {
	return salario;
}


public void setSalario(Integer salario) {
	this.salario = salario;
}



public String toString() {
	return "Empresa id: " + id + ", nome: " + nome + ", salario: " + salario ;
}



}
