package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by gmcfeeters3345 on 10/16/2017.
 */

public class MainMenuScreen extends Game implements Screen {
    private Game game;
    public MainMenuScreen(final ProjectOdyssey game) throws InterruptedException {
        game.setScreen(new MarketBackEnd(this));
    }

    SpriteBatch batch;
    Texture img;
    int width = Gdx.app.getGraphics().getWidth();
    int height = Gdx.app.getGraphics().getHeight();
    public MainMenuScreen(Game projectOdyssey) {


        create();
        render();

    }



    @Override
    public void create() {



        batch = new SpriteBatch();
        img = new Texture("begin.jpg");

    }

    @Override
    public void render () {

        Gdx.gl.glClearColor(1, 1, 1, 1); //White background color
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, (width/2), (height/2), (412/2), (210/2), 412, 210, 1, 1, 90, 1, 1, 600, 300, false, false); //https://stackoverflow.com/questions/24748350/libgdx-rotate-a-texture-when-drawing-it-with-spritebatch
        batch.end();
        super.render();
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
