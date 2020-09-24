package com.hsbc.model.utility;

import com.hsbc.model.business.ServiceImplementation;
import com.hsbc.model.dao.CollectionBackedStoreDao;

public class UserFactory {
	
	public static Object getInstance(Type type) {
		Object obj = null;
		switch(type) {
		case DAO : 
			obj = new CollectionBackedStoreDao();
			break;
		case SERVICE :
			obj = new ServiceImplementation();
			break;
		}
		return obj;
	}
}
