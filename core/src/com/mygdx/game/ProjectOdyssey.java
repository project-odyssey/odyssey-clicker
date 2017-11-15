package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ProjectOdyssey extends Game {
	SpriteBatch batch;
	private Game game;

	public ProjectOdyssey(){
		this.game = this;
	}

	@Override
	public void render(){
		Gdx.gl.glClearColor(1, 1, 1, 1); //White background color
		super.render();
	}

	@Override
	public void create () {
		batch = new SpriteBatch();
		try {
			game.setScreen(new MainMenuScreen(this));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}


	@Override
	public void dispose () {
		batch.dispose();
		screen.dispose();
	}

}
