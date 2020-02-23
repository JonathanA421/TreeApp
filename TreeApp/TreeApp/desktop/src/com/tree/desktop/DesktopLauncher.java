package com.tree.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tree.TreeMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1500;
		config.height= 800;
		config.title = "GrowingTree";
		new LwjglApplication(new TreeMain(), config);
	}
}
