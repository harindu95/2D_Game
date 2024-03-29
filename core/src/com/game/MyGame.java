package com.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGame extends ApplicationAdapter{
	SpriteBatch batch;
	Texture img;
	Player player;
	InputHandler input;
	
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("wallpaper.jpg");
		player = new Player();
		input = new InputHandler(player);
		Gdx.input.setInputProcessor(input);
	}

	@Override
	public void render () {
		input.render();
		
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		player.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	
	
	
}
