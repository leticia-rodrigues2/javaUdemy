package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
	
	private Integer quantity;
	private Double price;
	private Product product;
	
	public OrderItem (int quantity2, double productPrice, Product product2) {
		
	}

	public OrderItem(Integer quantity, Double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double subTotal() {
		return quantity * price;
	}
	@Override
	public String toString() {
		return product.getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
}
}
