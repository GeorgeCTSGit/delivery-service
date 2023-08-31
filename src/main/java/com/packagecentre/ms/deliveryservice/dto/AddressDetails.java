package com.packagecentre.ms.deliveryservice.dto;

public class AddressDetails {
	
	private int addrID;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private String postalCode;
	private String zone;
	
	public AddressDetails() {
		
	}
	
	public AddressDetails(int addrID, String line1, String line2, String city, String state, String postalCode,
			String zone) {
		super();
		this.addrID = addrID;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.zone = zone;
	}
	public int getAddrID() {
		return addrID;
	}
	public void setAddrID(int addrID) {
		this.addrID = addrID;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}

	@Override
	public String toString() {
		return "AddressDetails [addrID=" + addrID + ", line1=" + line1 + ", line2=" + line2 + ", city=" + city
				+ ", state=" + state + ", postalCode=" + postalCode + ", zone=" + zone + "]";
	}

}
