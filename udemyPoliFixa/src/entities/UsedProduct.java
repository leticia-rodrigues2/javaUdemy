package entities;

import java.util.Date;

public class UsedProduct extends Produto{
 private Date date;
 
 public  UsedProduct() {
	 super();
 }

 
public UsedProduct(String name, Double price, Date date) {
	super(name, price);
	this.date = date;
}


public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

@Override
public double priceTag() {
		return super.priceTag();
	}
 
 
}
