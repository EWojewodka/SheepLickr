package wroclaw.jemiol.buildings;

import java.util.HashSet;

import wroclaw.jemiol.enums.BuildingBonus;

public class Sheepfold extends BuildingAbstract {

	public final static int MAX_LEVEL = 10;

	public Sheepfold() {
		this.level = 1;
		this.maxLevel = MAX_LEVEL;
		this.experience = 0;
		this.bought = true;
		this.buildingBonus = new HashSet<BuildingBonus>();
		buildingBonus.add(BuildingBonus.MORE_SHEEP_BONUS);
	}

}
