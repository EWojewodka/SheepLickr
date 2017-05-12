package wroclaw.jemiol.bonus;

import wroclaw.jemiol.enums.BuildingBonus;
import wroclaw.jemiol.enums.Buildings;
import wroclaw.jemiol.manager.GameManager;

public class BonusUnwrapper {

	// TODO
	public BonusUnwrapper(Buildings type) {
		BuildingBonus buildingType = GameManager.getInstance().getBuildingManager().getBuilding(type)
				.getBuildingBonus();

		if (buildingType == BuildingBonus.MORE_SHEEP_BONUS_SMALL
				|| buildingType == BuildingBonus.MORE_SHEEP_BONUS_BIG) {
			new MoreSheep(type);
		} else if (buildingType == BuildingBonus.CYCLIC_SHEEPHERD_RESP) {
			new AddShepherd();
		} else if (buildingType == BuildingBonus.BONUS_SKILL_FOR_ALL_SHEEPHERD) {
			new AddSkills();
		} else if (buildingType == BuildingBonus.HOLLY_MASS) {
			new HollyMass(GameManager.getInstance().getBuildingManager().getBuilding(type).getLevel());
		}
	}

}
