package controller;

import java.util.LinkedList;
import model.ItemList;
import model.Item;
import processing.core.PApplet;

public class Controller {

	private PApplet app;
	private ItemList item;

	public Controller(PApplet app) {

		this.app = app;
		item = new ItemList(app);
	}

	public void SortBy(char key) {

		item.SortBy(key);

	}

	public LinkedList<Item> itemList() {
		return item.getItemList();

	}
	
	public void Create() {
		
		item.CreateItem();
	}
}