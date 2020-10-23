package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class ItemList {
	
	PApplet app;
	String[] netflix;
	String[] information;
	String[] bname, btype, byear, brating; 
	String name, type;
	PImage image;
	String imageName;
	SortByname byName;
	SortBytype byType;
	SortByyear byYear;
	int year, rating;
	private LinkedList<Item> itemList;

	public ItemList (PApplet app) {
		
		this.app = app;
		netflix = app.loadStrings("./data/netflix.txt");
		itemList = new LinkedList <Item>();
		byName = new SortByname();
		byType = new SortBytype();
		byYear = new SortByyear();
		
		bname = new String [6];
		btype = new String [6];
		byear = new String [6];
		brating = new String [6];
		
	}
	
	public void CreateItem() {
		for (int i = 0; i < netflix.length; i++) {
			
			information = netflix[i].split(",");
			name = information[0];
			imageName = name.toLowerCase().replaceAll(" ", " ");
			year = Integer.parseInt(information[1]);
			rating = Integer.parseInt(information[2]);
			type = information [3];
			image = app.loadImage("./data/img" + "/" + imageName + "" + ".jpg");
			
			itemList.add(new Item(app, name, year, type, rating, image));
			
			
		}
	}
	
	public void SortBy(char key) {

		switch (key) {

		case 'r':

			Collections.sort(itemList);
			//sorry profe no supe arreglar este Sort 

			for (int i = 0; i < itemList.size(); i++) {

				String name = itemList.get(i).getName();
				String year = Integer.toString(itemList.get(i).getYear());
				String rating = Integer.toString(itemList.get(i).getRating());
				String type = (itemList.get(i).getType());

				String line = name + "," + year + "," + rating + "," + type;
				brating[i] = line;

				app.saveStrings(app.dataPath("ByRating.txt"), brating);
			}

			break;
		case 'n':

			Collections.sort(itemList, byName);

			for (int i = 0; i < itemList.size(); i++) {

				String name = itemList.get(i).getName();
				String year = Integer.toString(itemList.get(i).getYear());
				String rating = Integer.toString(itemList.get(i).getRating());
				String type = (itemList.get(i).getType());

				String line = name + "," + year + "," + rating + "," + type;
				bname[i] = line;

				app.saveStrings(app.dataPath("ByName.txt"), bname);
			}

			break;

		case 'y':

			Collections.sort(itemList, byYear);
			for (int i = 0; i < itemList.size(); i++) {

				String name = itemList.get(i).getName();
				String year = Integer.toString(itemList.get(i).getYear());
				String rating = Integer.toString(itemList.get(i).getRating());
				String type = (itemList.get(i).getType());

				String line = name + "," + year + "," + rating + "," + type;
				byear[i] = line;

				app.saveStrings(app.dataPath("ByYear.txt"), byear);
			}
			break;
		case 't':
			Collections.sort(itemList, byType);
			for (int i = 0; i < itemList.size(); i++) {

				String name = itemList.get(i).getName();
				String year = Integer.toString(itemList.get(i).getYear());
				String rating = Integer.toString(itemList.get(i).getRating());
				String type = (itemList.get(i).getType());

				String line = name + "," + year + "," + rating + "," + type;
				btype[i] = line;

				app.saveStrings(app.dataPath("ByType.txt"), btype);
			}

			break;
		}

	}

	public String[] getNetflix() {
		return netflix;
	}

	public void setNetflix(String[] netflix) {
		this.netflix = netflix;
	}

	public String[] getInformation() {
		return information;
	}

	public void setInformation(String[] information) {
		this.information = information;
	}

	public LinkedList<Item> getItemList() {
		return itemList;
	}

	public void setMovieList(LinkedList<Item> itemList) {
		this.itemList = itemList;
	}
}
	
	
}
