package entities;

public class OutsourcedEmployee extends Employee{

	private Double adtionalCharge;

	
	public OutsourcedEmployee () {
		super();
	}


	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double adtionalCharge) {
		super(name, hours, valuePerHour);
		this.adtionalCharge = adtionalCharge;
	}


	public Double getAdtionalCharge() {
		return adtionalCharge;
	}


	public void setAadtionalCharge(Double adtionalCharge) {
		this.adtionalCharge = adtionalCharge;
	}
	
	@Override

	  public double payment() {
		return super.payment() + (adtionalCharge *1.1);
		
		  
	  }
	
}
