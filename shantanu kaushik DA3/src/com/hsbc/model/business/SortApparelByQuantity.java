package com.hsbc.model.business;
import com.hsbc.model.beans.*;
import java.util.Comparator;

public class SortApparelByQuantity implements Comparator<Apparel>{

	@Override
	public int compare(Apparel o1, Apparel o2) {
		// TODO Auto-generated method stub
		return o1.getQuantity()-o2.getQuantity();
	}

	
}
