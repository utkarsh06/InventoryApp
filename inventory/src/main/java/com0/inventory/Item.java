package com0.inventory;

public class Item {
	
	
	private String Name;
	private int quantity;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Item [Name=" + Name + ", quantity=" + quantity + "]";
	}
	
	
	
}
