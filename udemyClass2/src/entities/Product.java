package entities;

public class Product {
 public String name;
 public double price;
 public int quantity;
	
 public double totalValueInStock() {
	 return price*quantity;
 }
 
 public void addProduts(int quantity) {
	 // para referecias o atributo e nao o parameto (int quantity) usa-se o this
	 
	 this.quantity+= quantity;
 }
 
 public void removeProducts(int quantity) {
	
	 this.quantity-=quantity;
	 
 }
  public String toString() {
	  return name
			  + ",$"
			  + String.format("%.2f", price)
			  +", "
			  + quantity
			  + "unitis, Total : $"
	           +totalValueInStock();
	  
  } 
}
