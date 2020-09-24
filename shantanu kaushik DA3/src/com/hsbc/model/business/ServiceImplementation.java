package com.hsbc.model.business;

import java.util.Arrays;

import com.hsbc.model.beans.Apparel;
import com.hsbc.model.beans.Electronics;
import com.hsbc.model.beans.FoodItems;
import com.hsbc.model.dao.Dao;
import com.hsbc.model.utility.Type;
import com.hsbc.model.utility.UserFactory;

public class ServiceImplementation implements Service {
	private Dao dao;
	public ServiceImplementation() {
		// this is the way you get different instance
		dao = (Dao)UserFactory.getInstance(Type.DAO);
	}
	
	
	@Override
	public FoodItems storeFoodItem(FoodItems foodItem) {
		// TODO Auto-generated method stub
		FoodItems foodCreated=dao.storeFoodItem(foodItem);
		return foodCreated;
	}
	@Override
	public Electronics storeElectronics(Electronics electronics) {
		// TODO Auto-generated method stub
		Electronics electronicsCreated=dao.storeElectronincs(electronics);
		return electronicsCreated;
	}
	@Override
	public Apparel storeApparel(Apparel apparel) {
		// TODO Auto-generated method stub
		Apparel apparelCreated=dao.storeApparel(apparel);
		return apparelCreated;
	}


	@Override
	public FoodItems[] getFoodItems() {
		// TODO Auto-generated method stub
		FoodItems[] foodArray=dao.fetchFoodItems();
		Arrays.sort(foodArray, new SortFoodItemsByQuantity());
		if(foodArray.length<=3) {
			return foodArray;
		}
			FoodItems[] ft=new FoodItems[3];
			ft[0]=foodArray[0];
			ft[1]=foodArray[1];
			ft[2]=foodArray[2];
			return ft;
		
	}


	@Override
	public Electronics[] getElectronics() {
		
		Electronics[] eleArray=dao.fetchElectronincs();
		Arrays.sort(eleArray, new SortElectronicsbyQuantity());
		if(eleArray.length<=3) {
			return eleArray;
		}
			Electronics[] ele=new Electronics[3];
			ele[0]=eleArray[0];
			ele[1]=eleArray[1];
			ele[2]=eleArray[2];
			return ele;
	}


	@Override
	public FoodItems[] getApperal() {
		Apparel[] appArray=dao.fetchApparel();
		Arrays.sort(appArray, new SortApparelByQuantity());
		if(appArray.length<=3) {
			return appArray;
		}
			Apparel[] app=new Apparel[3];
			app[0]=appArray[0];
			app[1]=appArray[1];
			app[2]=appArray[2];
			return app;
	}
	
	
}
