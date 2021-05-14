package entities;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	

	public Company(String name, Double salaAnu, Integer numberOfEmployees) {
		super(name, salaAnu);
		this.numberOfEmployees = numberOfEmployees;
	}

	


	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}




	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}




	@Override
	public Double tax() {
		if (numberOfEmployees > 10) {
			return getSalaAnu() * 0.14;
		}
		else {
			return getSalaAnu() * 0.16;
		}
	}
}