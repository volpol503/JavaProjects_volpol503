package com.mygdx.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.game.LibGDX_Game21;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = LibGDX_Game21.TITLE + " Blackpoint Game " + LibGDX_Game21.VERSION;
		config.vSyncEnabled = true;
		config.useGL30 = true;
		config.width = 480;
		config.height = 320;


		new LwjglApplication(new LibGDX_Game21(), config);
	}
}
