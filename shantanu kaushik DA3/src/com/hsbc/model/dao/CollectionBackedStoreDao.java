package com.hsbc.model.dao;

import java.util.ArrayList;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;

public class CollectionBackedStoreDao implements Dao{
	
	ArrayList<FoodItems> foodArray=new ArrayList<>();
	ArrayList<Electronics> electronicsArray=new ArrayList<>();
	ArrayList<Apparel> apparelArray=new ArrayList<>();
	

	@Override
	public FoodItems storeFoodItem(FoodItems foodItem) {
		// TODO Auto-generated method stub
		foodArray.add(foodItem);
		return foodItem;
	}

	@Override
	public Electronics storeElectronincs(Electronics electronics) {
		// TODO Auto-generated method stub
		electronicsArray.add(electronics);
		return electronics;
	}

	@Override
	public Apparel storeApparel(Apparel apparel) {
		// TODO Auto-generated method stub
		apparelArray.add(apparel);
		return apparel;
	}

	@Override
	public FoodItems[] fetchFoodItems() {
		// TODO Auto-generated method stub
		FoodItems[] food=foodArray.toArray(new FoodItems[foodArray.size()]);
		return food;
	}

	@Override
	public Electronics[] fetchElectronincs() {
		// TODO Auto-generated method stub
		Electronics[] eleArray=electronicsArray.toArray(new Electronics[electronicsArray.size()]);
		return eleArray;
	}

	@Override
	public Apparel[] fetchApparel() {
		// TODO Auto-generated method stub
		Apparel[] appArray=apparelArray.toArray(new Apparel[apparelArray.size()]);
		return appArray;
	}

}
