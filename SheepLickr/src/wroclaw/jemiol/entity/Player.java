package wroclaw.jemiol.entity;

import java.io.FileNotFoundException; 
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;

import wroclaw.jemiol.buildings.Church;
import wroclaw.jemiol.buildings.Inn;
import wroclaw.jemiol.buildings.LaborOffice;
import wroclaw.jemiol.buildings.Pasture;
import wroclaw.jemiol.buildings.Sheepfold;
import wroclaw.jemiol.buildings.TowerOfSkill;
import wroclaw.jemiol.enums.Buildings;
import wroclaw.jemiol.enums.Religion;
import wroclaw.jemiol.util.RandomVar;

public class Player {
	private List<Shepherd> playerShepherd;
	private Map<Buildings, Object> playerBuildings;
	private int score;
	private double religionRatio;
	private Religion religion;

	public Player() throws JSONException, FileNotFoundException {
		score = 0;
		playerShepherd = new ArrayList<>();
		playerBuildings = setPlayerBuildingsOnStart();
		religion = RandomVar.getRandomReligion();
		religionRatio = 1.2;
	}

	private Map<Buildings, Object> setPlayerBuildingsOnStart() {
		Map<Buildings, Object> buildingMap = new HashMap<>();
		buildingMap.put(Buildings.PASTURE, new Pasture());
		buildingMap.put(Buildings.SHEEPFOLD, new Sheepfold());
		buildingMap.put(Buildings.LABOR_OFFICE, new LaborOffice());
		buildingMap.put(Buildings.TOWER_OF_SKILL, new TowerOfSkill());
		buildingMap.put(Buildings.CHURCH, new Church());
		buildingMap.put(Buildings.INN, new Inn());
		return buildingMap;
	}

	public void setReligionRatio(double religionRatio) {
		this.religionRatio = religionRatio;
	}

	public double getReligionRatio() {
		return religionRatio;
	}

	public Religion getReligion() {
		return religion;
	}

	public List<Shepherd> getPlayerShepherd() {
		return playerShepherd;
	}

	public Map<Buildings, Object> getPlayerBuildings() {
		return playerBuildings;
	}

	public void setPlayerBuildings(Map<Buildings, Object> playerBuildings) {
		this.playerBuildings = playerBuildings;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int scoreToAdd) {
		this.score = getScore() + scoreToAdd;
	}

}
