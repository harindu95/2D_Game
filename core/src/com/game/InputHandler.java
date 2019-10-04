package com.game;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Input.Keys;

public class InputHandler implements InputProcessor {

	Player player;
	int UP = 0;
	int DOWN = 1;
	int LEFT = 2;
	int RIGHT = 3;

	boolean keys[] = new boolean[4];

	InputHandler(Player player) {
		this.player = player;
	}

	void render() {
		if (keys[UP])
			player.jump();
		if (keys[LEFT])
			player.walkLeft();
		if (keys[RIGHT])
			player.walkRight();
		if (keys[DOWN])
			player.goDown();
	}

	@Override
	public boolean keyDown(int keycode) {
		if (keycode == Keys.UP)
			keys[UP] = true;
		if (keycode == Keys.LEFT)
			keys[LEFT] = true;
		if (keycode == Keys.RIGHT)
			keys[RIGHT] = true;
		if (keycode == Keys.DOWN)
			keys[DOWN] = true;

		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		if (keycode == Keys.UP)
			keys[UP] = false;
		if (keycode == Keys.LEFT)
			keys[LEFT] = false;
		if (keycode == Keys.RIGHT)
			keys[RIGHT] = false;
		if (keycode == Keys.DOWN)
			keys[DOWN] = false;
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
