package view;

import controller.Controller;
import model.ItemList;
import processing.core.PApplet;

public class Main extends PApplet{

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	Controller controller;
	ItemList itemList;
	String [] datos;
	
	public void settings() {
		size(1280, 720);
	}
	
	public void setup() {
		controller= new Controller(this);
		controller.Create();
		datos = loadStrings("./data/netflix.txt");
		itemList = new ItemList(this);
	}
	
	public void draw() {
		
		background(0);
		itemList.CreateItem();

		for (int i = 0; i < controller.itemList().size(); i++) {

			controller.itemList().get(i).draw(10+(210*i));
		}
			
		textSize(30);
		text("Pulse R para ordenar por rating", 10, 400);
		text("Pulse y para ordenar por año", 10, 450);
		text("Pulse n para ordenar por nombre", 10, 500);
		text("Pulse t para ordenar por tipo", 10, 550);
		
	}
	
	public void keyPressed() {
		
		controller.SortBy(key);
		
	}

}
