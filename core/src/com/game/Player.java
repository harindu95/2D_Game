package com.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player {
	Texture img;
	Sprite sprite;
	int x,y;
	
	Player(){
		img = new Texture("commando2.png");
		sprite = new Sprite(img);
		x = 50;
		y = 100;
	}
	
	void draw(SpriteBatch batch){
		sprite.setPosition(x, y);
		sprite.draw(batch);
	}
	
	void jump() {
		y += 10;
	}
	
	void walkLeft() {
		x -= 5;
	}
	
	void walkRight() {
		x += 5;
	}
	
	void goDown() {
		y -= 10;
	}
}
