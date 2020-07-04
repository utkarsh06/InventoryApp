package com0.inventory;

public class Inventory {
	
	//@ManyToOne for composite objects 
	private Item item;
	private String name;
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Inventory [item=" + item + ", name=" + name + "]";
	}

	
}
