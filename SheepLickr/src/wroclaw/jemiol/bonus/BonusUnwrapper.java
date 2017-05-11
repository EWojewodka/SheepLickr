package wroclaw.jemiol.bonus;

import wroclaw.jemiol.buildings.BuildingAbstract;
import wroclaw.jemiol.enums.BuildingBonus;
import wroclaw.jemiol.enums.Buildings;
import wroclaw.jemiol.manager.GameManager;

public class BonusUnwrapper {

	//TODO
	public BonusUnwrapper(Buildings type) {
		BuildingAbstract buildingType = GameManager.getInstance().getBuildingManager().getBuilding(type);
		if (buildingType.getBuildingBonus() == BuildingBonus.MORE_SHEEP_BONUS_SMALL
				|| buildingType.getBuildingBonus() == BuildingBonus.MORE_SHEEP_BONUS_BIG) {
			new MoreSheep(type);
		} else if (buildingType.getBuildingBonus() == BuildingBonus.CYCLIC_SHEEPHERD_RESP) {
			new AddShepherd();
		}
	}

}
