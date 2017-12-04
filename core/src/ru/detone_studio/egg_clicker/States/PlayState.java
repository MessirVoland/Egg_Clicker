package ru.detone_studio.egg_clicker.States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.detone_studio.egg_clicker.GameStateManager;

/**
 *
 * Created by asupd on 04.12.17.
 */

public class PlayState extends State {
    Sprite egg = new Sprite(new Texture(Gdx.files.internal("egg.png")));

    public PlayState(GameStateManager gsm) {
        super(gsm);
        egg.setPosition(0,0);

    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        egg.draw(sb);
    }

    @Override
    public void dispose() {

    }
}
