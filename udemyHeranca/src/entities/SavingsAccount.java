package entities;

public class SavingsAccount extends Account {
   private Double interestRate;
   
   public SavingsAccount() {
	   super();
   }

public SavingsAccount(Integer number, String holder, Double balance, Double interrestRate) {
	super(number, holder, balance);
	this.interestRate = interestRate;
}

public Double getInterestRate() {
	return interestRate;
}

public void setInterrestRate(Double interestRate) {
	this.interestRate = interestRate;
}
   
   public void updateBalance() {
	   balance += balance* interestRate;
   }
}
