package wroclaw.jemiol.bonus;

import wroclaw.jemiol.buildings.BuildingAbstract;
import wroclaw.jemiol.enums.Buildings;
import wroclaw.jemiol.manager.GameManager;

public class MoreSheep {

	private final double smallBonus = 1.1;
	private final double bigBonus = 1.3;

	public MoreSheep(Buildings building) {
		if (building == Buildings.PASTURE) {
			addSmallBonus();
		} else if (building == Buildings.SHEEPFOLD) {
			addBigBonus();
		}
	}

	private void addSmallBonus() {
		BuildingAbstract building = GameManager.getInstance().getBuildingManager().getBuilding(Buildings.PASTURE);
		GameManager.getInstance().getSheepManager()
				.setTimeOfSheepResp((long) (GameManager.getInstance().getSheepManager().getTimeOfSheepResp()
						- (building.getLevel() * (Math.pow(building.getLevel(), smallBonus)*100))));
	}

	private void addBigBonus() {
		BuildingAbstract building = GameManager.getInstance().getBuildingManager().getBuilding(Buildings.SHEEPFOLD);
		GameManager.getInstance().getSheepManager()
				.setTimeOfSheepResp((long) (GameManager.getInstance().getSheepManager().getTimeOfSheepResp()
						- (building.getLevel() * (Math.pow(building.getLevel(), bigBonus) / (bigBonus * 0.8)) * 10)));
	}

}
