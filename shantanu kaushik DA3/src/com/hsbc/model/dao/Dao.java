package com.hsbc.model.dao;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;

public interface Dao {
	public FoodItems storeFoodItem(FoodItems foodItem);
	public Electronics storeElectronincs(Electronics electronics);
	public Apparel storeApparel(Apparel apparel);
	
	public FoodItems[] fetchFoodItems();
	public Electronics[] fetchElectronincs();
	public Apparel[] fetchApparel();
}
