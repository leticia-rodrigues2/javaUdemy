package entities;

public abstract class TaxPayer {

	private String name;
	private Double salaAnu;
	

	public TaxPayer(String name, Double salaAnu) {
		super();
		this.name = name;
		this.salaAnu = salaAnu;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalaAnu() {
		return salaAnu;
	}


	public void setSalaAnu(Double salaAnu) {
		this.salaAnu = salaAnu;
	}


	public abstract Double tax();
}