package model;

import processing.core.PApplet;
import processing.core.PImage;
import view.Main;

public class Item {
	
	private PApplet app;
	private String name, type;
	private PImage image;
	private int year, rating;

	public Item (PApplet app, String name, int year, String type, int rating, PImage image) {
		
		this.app = app;
		this.image = image;
		this.name = name;
		this.rating = rating;
		this.type = type;
		this.year = year;

	}

	public void draw(int posX) {
		app.textSize(20);

		app.image(image, posX, 20,200,200);
		app.text(name, posX, 30 + 210);
		app.text(year, posX, 30 + 240);
		app.text(type, posX, 30 + 270);
		app.text(rating, posX, 30 + 300);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public void paint(int posX) {
		app.textSize(20);
		
		app.image(image, posX, 20,200,200);
	}
	
	public int compareTo(Item nextItem) {
		// TODO Auto-generated method stub
		return this.rating-nextItem.getRating();
	}

	

}
