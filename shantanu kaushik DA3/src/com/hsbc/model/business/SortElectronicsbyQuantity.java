package com.hsbc.model.business;

import java.util.Comparator;

import com.hsbc.model.beans.Electronics;

public class SortElectronicsbyQuantity implements Comparator<Electronics>{

	@Override
	public int compare(Electronics o1, Electronics o2) {
		// TODO Auto-generated method stub
		return o1.getQuantity()-o2.getQuantity();
	}


}
