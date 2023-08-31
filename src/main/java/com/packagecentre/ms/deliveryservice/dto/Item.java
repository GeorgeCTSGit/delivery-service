package com.packagecentre.ms.deliveryservice.dto;

public class Item {
	
	private int itemID;
	private String itemName;
	private int price;
	private int quantity;
	private int total;
	
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Item(int itemID, String itemName, int price, int quantity, int total) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
	}
	
	public Item() {
		
	}
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", itemName=" + itemName + ", price=" + price + ", quantity=" + quantity
				+ ", total=" + total + "]";
	}

}