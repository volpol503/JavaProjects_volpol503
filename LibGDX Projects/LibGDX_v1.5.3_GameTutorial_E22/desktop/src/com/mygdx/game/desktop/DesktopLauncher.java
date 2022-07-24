package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.LibGDX_Game22;

public class DesktopLauncher {

	public static LwjglApplication application;
	public static LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
	public static void main (String[] arg) {

		config.width = 720;
		config.height = 480;
		config.backgroundFPS = 60;
		config.foregroundFPS = 60;


		new LwjglApplication(new LibGDX_Game22(), config);
	}
}
