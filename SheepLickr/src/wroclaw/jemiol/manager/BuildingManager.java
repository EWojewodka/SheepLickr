package wroclaw.jemiol.manager;

import wroclaw.jemiol.bonus.BonusUnwrapper;
import wroclaw.jemiol.buildings.BuildingAbstract;
import wroclaw.jemiol.enums.Buildings;

public class BuildingManager<T extends BuildingAbstract> {

	@SuppressWarnings("unused")
	private T building;

	public BuildingManager() {

	}

	private boolean canBuy(Buildings building) {
		if (getBuilding(building).getCost() < GameManager.getInstance().getPlayerManager().getPlayer().getScore()) {
			return true;
		}
		return false;
	}
	/**
	 * Next level isn't currently level. <br/>
	 * It's level-improve method.
	 * @param building
	 */
	public void buyBuilding(Buildings building) {
		if (canBuy(building)) {
			substractScores(getBuilding(building).getCost());
			bonusUnwrapper(building);
			nextLevel(building);
			setCostAtNextLevel(building);
		}
	}
	
	private void bonusUnwrapper(Buildings building) {
		new BonusUnwrapper(building);
	}

	private void setCostAtNextLevel(Buildings building) {
		getBuilding(building).setCost(getBuilding(building).getCostAtNextLevel());
	}
	
	/**
	 * value should be negative
	 * 
	 * @param value
	 */
	private void substractScores(int value) {
		GameManager.getInstance().getPlayerManager().getPlayer().setScore(-value);
	}

	private void nextLevel(Buildings building) {
		getBuilding(building).setLevel(getBuilding(building).getLevel() + 1);
	}

	@SuppressWarnings("unchecked")
	public T getBuilding(Buildings building) {
		return (T) GameManager.getInstance().getPlayerManager().getPlayer().getPlayerBuildings().get(building);
	}

	public void setBuilding(T building) {
		this.building = building;
	}

}
