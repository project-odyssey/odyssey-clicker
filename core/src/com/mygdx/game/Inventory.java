package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
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
    private String iceString;
    int[] inventory = new int[10];
    private BitmapFont font = new BitmapFont(Gdx.files.internal("buttons/ocra.ttf"));
    private GlyphLayout layout;
    private Stage stage;
    private SpriteBatch batch;
    private ImageButton iceButton;
    public Inventory(final ProjectOdyssey game) {
        this.font = font;
        ice = 0;
        iceString = "Ice: " + ice;
        font = new BitmapFont();
        stage = new Stage();
        batch = new SpriteBatch();
        layout = new GlyphLayout();

        AssetManager manager = game.assets;
        manager.finishLoading();
        //font = manager.get("fonts/ocra.ttf");

        iceString = "Welcome to your Odyssey";

        font.getData().setScale(10);

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
                ice++;
                inventory[0] = ice;
            }
        });
        stage.addActor(iceButton);


        Gdx.input.setInputProcessor(new InputMultiplexer(stage, new GestureDetector(this)));


        for(int i=0; i < inventory.length; i++){

        }
        System.out.println(ice);
    }

    public void draw() {
        batch.begin();
        layout.setText(font, iceString);
        font.setColor(1, 0, 0, 1);
        font.draw(batch,
                iceString,
                Gdx.graphics.getWidth() / 3,
                Gdx.graphics.getHeight() / 3
        );
        batch.end();
    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        //game.assets.update();
        // Set background color
        Gdx.gl.glClearColor(1, 1, 1, 1); //White background color
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        // Draw play button
        iceButton.getImage();
        iceButton.draw(batch, 1);
        //font.draw(batch, "Ice: "+ ice, Gdx.graphics.getWidth()/4, Gdx.graphics.getHeight()/2);

        batch.end();

        stage.act();
        stage.draw();
        super.render();
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
        batch.dispose();
        font.dispose();
        screen.dispose();
    }

    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {
        System.out.println("onetwofour");
        return true;
    }

    @Override
    public boolean tap(float x, float y, int count, int button) {

       /* if (count > 0 ){
            ice = count;
            System.out.println(count);
            System.out.println(ice);
        }*/
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
