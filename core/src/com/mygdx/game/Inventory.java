package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

/**
 * Created by gmcfeeters3345 on 10/16/2017.
 */

public class Inventory extends Game implements Screen, GestureDetector.GestureListener{
    int ice;
    private Stage stage;
    private SpriteBatch batch;
    private ImageButton iceButton;
    public Inventory(final ProjectOdyssey game) {
        stage = new Stage();
        batch = new SpriteBatch();

        //Button skin
        Skin iceButtonSkin = new Skin();
        iceButtonSkin.add("iceButton", new Texture("buttons/ice.png"));

        //Button Style
        ImageButton.ImageButtonStyle iceButtonStyle = new ImageButton.ImageButtonStyle();
        iceButtonStyle.imageUp = iceButtonSkin.getDrawable("iceButton"); // Unpressed
        iceButtonStyle.imageDown = iceButtonSkin.getDrawable("iceButton"); // Pressed

        //Ice button
        iceButton = new ImageButton(iceButtonStyle);
        int buttonSize = (int) (100 * Gdx.graphics.getDensity());
        iceButton.setSize(buttonSize, buttonSize);
        int width = (int) ((Gdx.graphics.getWidth() - iceButton.getWidth())/2);
        int height = (int) ((Gdx.graphics.getHeight() - iceButton.getHeight())/4);
        iceButton.setBounds(width, height, iceButton.getWidth(), iceButton.getHeight());
        iceButton.addListener(new InputListener() {
            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                //game.setScreen(new PlayScreen(game)); // Switch screen to game state
                //iceButton.setDisabled(true);

            }
        });
        stage.addActor(iceButton);
        System.out.println("onetwofour");
        Gdx.gl.glClearColor(1, 1, 1, 1); //White background color

        int[] inventory = new int[10];

        for(int i=0; i < inventory.length; i++){

        }
    }


    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void create() {

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

    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {
        System.out.println("onetwofour");
        return true;
    }

    @Override
    public boolean tap(float x, float y, int count, int button) {

        if (count > 0 ){
            ice = count;

            System.out.println(count);
            System.out.println(ice);
        }
        return false;
    }

    @Override
    public boolean longPress(float x, float y) {
        return false;
    }

    @Override
    public boolean fling(float velocityX, float velocityY, int button) {
        return false;
    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {
        return false;
    }

    @Override
    public boolean panStop(float x, float y, int pointer, int button) {
        return false;
    }

    @Override
    public boolean zoom(float initialDistance, float distance) {
        return false;
    }

    @Override
    public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
        return false;
    }

    @Override
    public void pinchStop() {

    }
}
