package com.hsbc.model.business;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;

public interface Service {
	public FoodItems storeFoodItem(FoodItems foodItem);
	public Electronics storeElectronics(Electronics electronics);
	public Apparel storeApparel(Apparel apparel);
	
	public FoodItems[] getFoodItems();
	public Electronics[] getElectronics();
	public FoodItems[] getApperal();
	
}
