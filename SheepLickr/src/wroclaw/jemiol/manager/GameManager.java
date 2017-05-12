package wroclaw.jemiol.manager;

import java.awt.FontFormatException;
import java.io.IOException;

import org.json.JSONException;

import wroclaw.jemiol.GUI.FontLoader;

public enum GameManager {
	INSTANCE;

	TimeManager timeManager;
	SheepManager sheepManager;
	PlayerManager playerManager;
	FontLoader fontLoader;
	ShephardManager shephardManager;
	AudioManager audioManager;
	BuildingManager<?> buildingManager;
	PanelsManager panelsManager;

	@SuppressWarnings("rawtypes")
	private GameManager() {
		timeManager = new TimeManager();
		sheepManager = new SheepManager();
		shephardManager = new ShephardManager();
		buildingManager = new BuildingManager();
		panelsManager = new PanelsManager();
		try {
			audioManager = new AudioManager();
			fontLoader = new FontLoader();
			playerManager = new PlayerManager();
		} catch (FontFormatException | IOException | JSONException e) {
			e.printStackTrace();
		}
	}

	public static GameManager getInstance() {
		return GameManager.INSTANCE;
	}
	
	public PanelsManager getPanelsManager() {
		return panelsManager;
	}

	public BuildingManager<?> getBuildingManager() {
		return buildingManager;
	}

	public ShephardManager getShephardManager() {
		return shephardManager;
	}

	public TimeManager getTimeManager() {
		return timeManager;
	}

	public SheepManager getSheepManager() {
		return sheepManager;
	}

	public PlayerManager getPlayerManager() {
		return playerManager;
	}

	public FontLoader getFontLoader() {
		return fontLoader;
	}

	public AudioManager getAudioManager() {
		return audioManager;
	}

}
