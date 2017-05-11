package wroclaw.jemiol.buildings;

import java.awt.event.MouseEvent;

import wroclaw.jemiol.enums.BuildingBonus;
import wroclaw.jemiol.enums.Buildings;

@SuppressWarnings("serial")
public class Church extends BuildingAbstract {

	public static final int MAX_LEVEL = 5;

	public Church() {
		super();
		pathToColorImage = "src/resources/church.jpg";
		pathToGreyImage = "src/resources/church_grey.jpg";
		this.type = Buildings.CHURCH;
		this.cost = 3000;
		this.maxLevel = MAX_LEVEL;
		this.buildingBonus = BuildingBonus.HOLLY_MASS;
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
