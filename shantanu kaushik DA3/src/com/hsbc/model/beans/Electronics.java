package com.hsbc.model.beans;

public class Electronics {
	private int itemCode;
	private String name;
	private int unitPrice;
	private int warrenty;
	private int quantity;
	public Electronics(int itemCode, String name, int unitPrice, int warrenty, int quantity) {
		super();
		this.itemCode = itemCode;
		this.name = name;
		this.unitPrice = unitPrice;
		this.warrenty = warrenty;
		this.quantity = quantity;
	}
	public int getItemCode() {
		return itemCode;
	}
	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getWarrenty() {
		return warrenty;
	}
	public void setWarrenty(int warrenty) {
		this.warrenty = warrenty;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", name=" + name + ", unitPrice=" + unitPrice + ", warrenty="
				+ warrenty + ", quantity=" + quantity + "]";
	}
	
	
}
