package wroclaw.jemiol.buildings;

import java.awt.event.MouseEvent;

import wroclaw.jemiol.enums.BuildingBonus;
import wroclaw.jemiol.enums.Buildings;

@SuppressWarnings("serial")
public class TowerOfSkill extends BuildingAbstract {

	public static final int MAX_LEVEL = 5;

	public TowerOfSkill() {
		super();
		this.pathToColorImage = "src/resources/tower.jpg";
		this.pathToGreyImage = "src/resources/tower_grey.jpg";
		this.type = Buildings.TOWER_OF_SKILL;
		this.cost = 1900;
		this.maxLevel = MAX_LEVEL;
		this.buildingBonus = BuildingBonus.BONUS_SKILL_FOR_ALL_SHEEPHERD;
		setIcon(getImage());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		buy();
		if (level >= 1) {
			changeImage();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		showInfo();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		hideInfo();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
