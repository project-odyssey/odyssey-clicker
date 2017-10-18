package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sun.javafx.scene.paint.GradientUtils;

import org.lwjgl.opengl.Display;

public class ProjectOdyssey extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;

	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("play.jpg");
		//41
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1); //White background color
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 300, 300, 150, 100, 300, 200, 1, 1, 90, 1, 1, 300, 200, false, false); //https://stackoverflow.com/questions/24748350/libgdx-rotate-a-texture-when-drawing-it-with-spritebatch
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
