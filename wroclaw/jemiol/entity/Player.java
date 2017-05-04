package wroclaw.jemiol.entity;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.json.JSONException;

import wroclaw.jemiol.manager.GameManager;

public class Player {
	@SuppressWarnings("unused")
	private List<Shepherd> playerShepherd;
	private Set<?> playerBuildings;
	private int score;

	public Player() throws JSONException, FileNotFoundException {
		score = 0;
		playerBuildings = new HashSet<>();
	}

	public List<Shepherd> getPlayerShepherd() {
		return GameManager.getInstance().getShephardManager().getShepherdList();
	}

	public Set<?> getPlayerBuildings() {
		return playerBuildings;
	}

	public void setPlayerBuildings(Set<?> playerBuildings) {
		this.playerBuildings = playerBuildings;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
