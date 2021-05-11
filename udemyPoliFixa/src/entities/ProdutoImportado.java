package entities;

public class ProdutoImportado extends Produto{
 private Double customsFee;
 
 public ProdutoImportado()
 {
	 super();
	 
 } 




public ProdutoImportado(String name, Double price, Double customsFee) {
	super(name, price);
	this.customsFee = customsFee;
}




@Override
 public double priceTag() {
		return super.priceTag() +customsFee;
	}


public double totalPrice() {
		return super.priceTag() +customsFee ;
	}




}
