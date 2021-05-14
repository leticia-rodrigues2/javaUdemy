package entities;

public class Individual extends TaxPayer {

	private Double despeSaude;
	
	

	
	public Individual(String name, Double salaAnu, Double despeSaude) {
		super(name, salaAnu);
		this.despeSaude = despeSaude;
	}
	
		

	public Double getDespeSaude() {
		return despeSaude;
	}



	public void setDespeSaude(Double despeSaude) {
		this.despeSaude = despeSaude;
	}



	@Override
	public Double tax() {
		if (getSalaAnu() < 20000.0) {
			return getSalaAnu() * 0.15 - despeSaude * 0.5;
		}
		else {
			return getSalaAnu() * 0.25 - despeSaude * 0.5;
		}
	}

}
