package wroclaw.jemiol.buildings;

import java.awt.event.MouseEvent;

import wroclaw.jemiol.enums.BuildingBonus;
import wroclaw.jemiol.enums.Buildings;

@SuppressWarnings("serial")
public class Sheepfold extends BuildingAbstract {

	public final static int MAX_LEVEL = 10;

	public Sheepfold() {
		super();
		pathToColorImage = "src/resources/sheepfold.jpeg";
		pathToGreyImage = "src/resources/sheepfold_grey.jpg";
		this.type = Buildings.SHEEPFOLD;
		this.cost = 175;
		this.maxLevel = MAX_LEVEL;
		this.buildingBonus = BuildingBonus.MORE_SHEEP_BONUS_BIG;
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
