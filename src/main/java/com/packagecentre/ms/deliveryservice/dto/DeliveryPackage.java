package com.packagecentre.ms.deliveryservice.dto;

import java.util.List;

public class DeliveryPackage  {
	
	private String packageID;
	private AddressDetails addr;
	private List<Item> items;
	private int custID;
	private String orderID;
	
	public String getPackageID() {
		return packageID;
	}
	public void setPackageID(String packageID) {
		this.packageID = packageID;
	}
	public AddressDetails getAddr() {
		return addr;
	}
	public void setAddr(AddressDetails addr) {
		this.addr = addr;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
	@Override
	public String toString() {
		return "DeliveryPackage [packageID=" + packageID + ", addr=" + addr + ", items=" + items + ", custID=" + custID
				+ ", orderID=" + orderID + "]";
	}
	
}
