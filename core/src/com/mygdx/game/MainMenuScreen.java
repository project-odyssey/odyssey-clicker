package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;

/**
 * Created by gmcfeeters3345 on 10/16/2017.
 */

public class MainMenuScreen extends Game implements Screen {

    SpriteBatch batch;
    Texture img;
    ImageButton startButton;

    public MainMenuScreen(Game projectOdyssey) {
        create();
        render();
    }



    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("begin.jpg");
        Drawable drawable = new TextureRegionDrawable(new TextureRegion(img));
        startButton = new ImageButton(drawable); //theoretically places the "img" image in the button
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
    public void show() {
        
    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
