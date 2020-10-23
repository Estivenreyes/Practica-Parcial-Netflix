package model;

import java.util.Comparator;

public class SortBytype implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		// TODO Auto-generated method stub
		return o1.getType().compareTo(o2.getType());
	}
}