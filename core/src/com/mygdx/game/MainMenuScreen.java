package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Event;
import com.badlogic.gdx.scenes.scene2d.EventListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

/**
 * Created by gmcfeeters3345 on 10/16/2017.
 */

public class MainMenuScreen extends Game implements Screen {

    SpriteBatch batch;
    Texture img;
    ImageButton startButton;
    TextButton sButton;
    private Stage mainMenuStage;

    public MainMenuScreen(Game projectOdyssey) {
        create();
        render();
    }



    @Override
    public void create() {
        batch = new SpriteBatch();

        img = new Texture("begin.jpg");
        Drawable drawable = new TextureRegionDrawable(new TextureRegion(img));
        startButton = new ImageButton(drawable); //places "img" in the button

        mainMenuStage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(mainMenuStage);
    }

    @Override
    public void render () {
        int width = (int) ((Gdx.graphics.getWidth() - startButton.getWidth())/4.2);
        int height = (int) ((Gdx.graphics.getHeight())*1.43);
        Gdx.gl.glClearColor(1, 1, 1, 1); //White background color
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        batch.draw(img, height, width, 0, 0, 500, 200, 1, 1, 90, 1, 1, 500, 200, false, false); //https://stackoverflow.com/questions/24748350/libgdx-rotate-a-texture-when-drawing-it-with-spritebatch
        batch.end();

        if (startButton.isPressed()){
            System.out.print("Success");
        }
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
