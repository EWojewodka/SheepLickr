package wroclaw.jemiol.buildings;

import java.awt.event.MouseEvent;

import wroclaw.jemiol.enums.BuildingBonus;
import wroclaw.jemiol.enums.Buildings;

@SuppressWarnings("serial")
public class Pasture extends BuildingAbstract {

	public static final int MAX_LEVEL = 20;

	public Pasture() {
		super();
		pathToColorImage = "src/resources/pasture.jpg";
		pathToGreyImage = "src/resources/pasture_grey.jpg";
		this.type = Buildings.PASTURE;
		this.cost = 50;
		this.maxLevel = MAX_LEVEL;
		this.buildingBonus = BuildingBonus.MORE_SHEEP_BONUS_SMALL;
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
