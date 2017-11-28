package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import static com.mygdx.game.MarketBackEnd.*;

/**
 * Created by gmcfeeters3345 on 10/16/2017.
 */

public class MarketUI extends Game implements Screen {
    private Game game;
    private BitmapFont font;


    SpriteBatch batch;
    Texture img;
    int width = Gdx.app.getGraphics().getWidth();
    int height = Gdx.app.getGraphics().getHeight();
    public MarketUI(MainMenuScreen marketBackEnd) {


        create();
        render();

    }



    @Override
    public void create() {
        batch.begin();
        font.draw(batch, String.valueOf(iceCubePrice), 20, 20); //you can change the position as you like
        batch.end();
        super.render();
    }




    @Override
    public void render () {

    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        System.out.println("FUCKKKKKKKKKKKKK Price");
        super.render();
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
