package com.hsbc.model.business;

import java.util.Comparator;

import com.hsbc.model.beans.FoodItems;

public class SortFoodItemsByQuantity implements Comparator<FoodItems>{

	@Override
	public int compare(FoodItems o1, FoodItems o2) {
		// TODO Auto-generated method stub
		return o1.getQuantity()-o2.getQuantity();
	}
	
}
