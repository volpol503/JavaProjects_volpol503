package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class LibGDXR_Game15 extends Game {


	private AdsListener listener;
	public void reward(int money){}

	@Override
	public void create () {
		MainScreen screen = new MainScreen(this);
		setScreen(screen);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
	}



	@Override
	public void dispose () {
		super.dispose();
	}

	public AdsListener getListener() {
		return listener;
	}

	public void setListener(AdsListener listener) {
		this.listener = listener;
	}
}
