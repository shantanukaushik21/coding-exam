package com.hsbc.model.beans;

public class Apparel {
	private int itemCode;
	private String name;
	private int unitPrice;
	private String size;
	private String material;
	private int quantity;
	public Apparel(int itemCode, String name, int unitPrice, String size, String material, int quantity) {
		super();
		this.itemCode = itemCode;
		this.name = name;
		this.unitPrice = unitPrice;
		this.size = size;
		this.material = material;
		this.quantity = quantity;
	}
	public int getItemCode() {
		return itemCode;
	}
//	public void setItemCode(int itemCode) {
//		this.itemCode = itemCode;
//	}
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", name=" + name + ", unitPrice=" + unitPrice + ", size=" + size
				+ ", material=" + material + ", quantity=" + quantity + "]";
	}
	
	
	
}
