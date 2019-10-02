package com.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player {
	Texture img;
	Sprite sprite;
	
	Player(){
		img = new Texture("commando2.png");
		sprite = new Sprite(img);
	
	}
	
	void draw(SpriteBatch batch){
		
		batch.draw(sprite, 50, 100);
	}
}
