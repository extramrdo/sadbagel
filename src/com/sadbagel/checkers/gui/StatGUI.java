package com.sadbagel.checkers.gui;

import java.awt.Font;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.gui.TextField;

import com.sadbagel.checkers.backend.CheckerStats;

public class StatGUI {
	
	private int activated = 0;
	private Image title = null;
	private TextField text = null;
	
	public StatGUI(){
		
	}
	
	public void init(){
		title = ResourceManager.getImage("titleStatistics");//TODO: V This is what is wrong with the whole idea. I don't know how to get the text box to pop up. Set text's text field to CheckerStats.text() and we're good. 
		text = new TextField(Globals.GAME.getContainer(), (org.newdawn.slick.Font) new UnicodeFont(new Font("Times New Roman", 20, 20)), 4, 4, 300, 400);
	}
	
	public void toggle(){
		activated = (activated + 1) % 2;
		CheckerStats.refresh();
		text.setText(CheckerStats.text());
	}
	
	public boolean isActivated(){
		return (activated == 1 ? true : false);
	}
	
	public void update(GameContainer container, int delta)
			throws SlickException {
		//Updates options of the menu
	}
	
	public void render(GameContainer container, Graphics g) throws SlickException {
		//Renders the menu on the current container
		if(isActivated()){
			g.setColor(new Color(0,0,0,200));
			g.fillRect(0, 0, 800, 600);
			
			title.draw(210, 42);

			text.render(container, g);
			
			//Draw the statistics to the screeeeen
			
		}
	}
	
	

}
