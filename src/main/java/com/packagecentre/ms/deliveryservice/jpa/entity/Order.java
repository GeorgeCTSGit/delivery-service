package com.packagecentre.ms.deliveryservice.jpa.entity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "Orders")
public class Order {
	
	@Column(name = "id")
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "item_id")
	private int itemID;
	
	@Column(name = "ord_id")
	private String orderID;
	
	@Column(name = "cust_id")
	private int custID;
	
	@Column(name = "addr_id")
	private int addrID;
	
	@Column(name = "pkg_id")
	private String pkgID;//can be of format "custID_addrID_P_mmddyyhhmm"
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "total_price")
	private int total;
	
	@Column(name = "ord_status")
	private String status;//CREATED, PACKAGED, DELIVERY, PACKAGING_FAILED, DELIVERY_FAILED
	
	@Column(name = "ord_dt")
	private LocalDateTime orderDate;
	
	@Column(name = "status_dt")
	private LocalDateTime orderStatusDate;
	
	
	public Order() {
		
	}
	

	/*public Order(Integer id, String orderID, int custID, int addrID, String pkgID, int quantity, int total,
			String status) {
		super();
		this.id = id;
		this.orderID = orderID;
		this.custID = custID;
		this.addrID = addrID;
		this.pkgID = pkgID;
		this.quantity = quantity;
		this.total = total;
		this.status = status;
	}*/
	
	public Order(String orderID, int custID, int addrID, String pkgID, int quantity, int total,
			String status, int itemID) {
		super();
		//this.id = id;
		this.orderID = orderID;
		this.custID = custID;
		this.addrID = addrID;
		this.pkgID = pkgID;
		this.quantity = quantity;
		this.total = total;
		this.status = status;
		this.orderDate = LocalDateTime.now();
		this.itemID = itemID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getItemID() {
		return itemID;
	}


	public void setItemID(int itemID) {
		this.itemID = itemID;
	}


	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public int getAddrID() {
		return addrID;
	}

	public void setAddrID(int addrID) {
		this.addrID = addrID;
	}

	public String getPkgID() {
		return pkgID;
	}

	public void setPkgID(String pkgID) {
		this.pkgID = pkgID;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public LocalDateTime getOrderStatusDate() {
		return orderStatusDate;
	}


	public void setOrderStatusDate(LocalDateTime orderStatusDate) {
		this.orderStatusDate = orderStatusDate;
	}
	
	

}
