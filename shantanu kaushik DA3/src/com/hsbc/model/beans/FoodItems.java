package com.hsbc.model.beans;

public class FoodItems {
	private int itemCode;
	private String name;
	private int unitPrice;
	private String dom; //date of manufacture
	private String doe; //date of expiry
	private boolean veg;
	private int quantity;
	
	public FoodItems(int itemCode, String itemName, int unitPrice, String dom, String doe, boolean veg) {
		super();
		this.itemCode = itemCode;
		this.name = itemName;
		this.unitPrice = unitPrice;
		this.dom = dom;
		this.doe = doe;
		this.veg = veg;
	}

	public int getItemCode() {
		return itemCode;
	}

//	public void setItemCode(int itemCode) {
//		this.itemCode = itemCode;
//	}

	public String getname() {
		return name;
	}

	public void setname(String itemName) {
		this.name = itemName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDom() {
		return dom;
	}

	public void setDom(String dom) {
		this.dom = dom;
	}

	public String getDoe() {
		return doe;
	}

	public void setDoe(String doe) {
		this.doe = doe;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}
	

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", name=" + name + ", unitPrice=" + unitPrice + ", dom=" + dom
				+ ", doe=" + doe + ", veg=" + veg + "]";
	}
	
	
	
}
