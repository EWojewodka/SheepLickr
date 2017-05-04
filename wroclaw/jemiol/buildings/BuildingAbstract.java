package wroclaw.jemiol.buildings;

import java.util.Set;

import wroclaw.jemiol.enums.BuildingBonus;

public abstract class BuildingAbstract {
	protected int level;
	protected int maxLevel;
	protected int experience;
	protected int expToNextLevel;

	protected String name;
	protected Set<BuildingBonus> buildingBonus;
	protected int cost;
	protected int costAtNextLevel;
	protected boolean bought = false;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getExpToNextLevel() {
		return expToNextLevel;
	}

	public void setExpToNextLevel(int expToNextLevel) {
		this.expToNextLevel = expToNextLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<BuildingBonus> getBuildingBonus() {
		return buildingBonus;
	}

	public void setBuildingBonus(Set<BuildingBonus> buildingBonus) {
		this.buildingBonus = buildingBonus;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public boolean isBought() {
		return bought;
	}

	public void setBought(boolean bought) {
		this.bought = bought;
	}

	public int getCostAtNextLevel() {
		return costAtNextLevel;
	}

	public void setCostAtNextLevel(int costAtNextLevel) {
		this.costAtNextLevel = costAtNextLevel;
	}

}
