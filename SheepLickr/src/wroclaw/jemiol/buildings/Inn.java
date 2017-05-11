package wroclaw.jemiol.buildings;

import java.awt.event.MouseEvent;

import wroclaw.jemiol.enums.BuildingBonus;
import wroclaw.jemiol.enums.Buildings;

@SuppressWarnings("serial")
public class Inn extends BuildingAbstract {

	public static final int MAX_LEVEL = 3;

	public Inn() {
		super();
		pathToColorImage = "src/resources/inn.png";
		pathToGreyImage = "src/resources/inn_grey.jpg";
		this.type = Buildings.INN;
		this.cost = 5000;
		this.maxLevel = MAX_LEVEL;
		this.buildingBonus = BuildingBonus.SHEEPHERD_REGENERATION;
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
