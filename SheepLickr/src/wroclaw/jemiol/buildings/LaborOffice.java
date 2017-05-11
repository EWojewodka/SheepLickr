package wroclaw.jemiol.buildings;

import java.awt.event.MouseEvent;

import wroclaw.jemiol.enums.BuildingBonus;
import wroclaw.jemiol.enums.Buildings;

@SuppressWarnings("serial")
public class LaborOffice extends BuildingAbstract {

	public static final int MAX_LEVEL = 12;

	public LaborOffice() {
		super();
		pathToColorImage = "src/resources/laborOffice.png";
		pathToGreyImage = "src/resources/laborOffice_grey.jpg";
		this.type = Buildings.LABOR_OFFICE;
		this.cost = 500;
		this.maxLevel = MAX_LEVEL;
		this.buildingBonus = BuildingBonus.CYCLIC_SHEEPHERD_RESP;
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
