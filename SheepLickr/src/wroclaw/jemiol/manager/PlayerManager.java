package wroclaw.jemiol.manager;

import java.io.FileNotFoundException;

import org.json.JSONException;

import wroclaw.jemiol.entity.Player;

public class PlayerManager {

	Player player;

	public PlayerManager() throws JSONException, FileNotFoundException {
		player = new Player();
	}

	public Player getPlayer() {
		return player;
	}
	
}
