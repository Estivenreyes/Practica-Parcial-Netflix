package model;

import java.util.Comparator;

public class SortByyear implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return o1.getYear()-o2.getYear();
	}

}
