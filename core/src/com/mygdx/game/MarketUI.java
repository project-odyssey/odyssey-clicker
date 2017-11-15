package com.mygdx.game;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by nleof4499 on 11/6/2017.
 */

public class MarketUI {

    private BitmapFont font;
    private SpriteBatch batch;

    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        font.setColor(Color.BLACK);
    }

    public void render() {
        batch.begin();
        font.draw(batch, String.valueOf(MarketBackEnd.iceCubePrice), 200, 200); //you can change the position as you like
        batch.end();
    }



}
