package model;

import java.util.Comparator;

	public class SortByname implements Comparator<Item> {

		@Override
		public int compare(Item arg0, Item arg1) {
			// TODO Auto-generated method stub
			return arg0.getName().compareTo(arg1.getName());
		}

	}

