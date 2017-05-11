package wroclaw.jemiol.GUI;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

import wroclaw.jemiol.enums.Buildings;
import wroclaw.jemiol.manager.GameManager;

@SuppressWarnings("serial")
public class BuildingsPanel extends JPanel {

	public BuildingsPanel() {
		Dimension dimension = new Dimension(300,300);
		this.setSize(dimension);
		this.setPreferredSize(dimension);
		setVisible(true);
		setLayout(new GridLayout(3, 3));
		setOpaque(false);
		this.add((Component) GameManager.getInstance().getPlayerManager().getPlayer().getPlayerBuildings().get(Buildings.PASTURE));
		this.add((Component) GameManager.getInstance().getPlayerManager().getPlayer().getPlayerBuildings().get(Buildings.SHEEPFOLD));
		this.add((Component) GameManager.getInstance().getPlayerManager().getPlayer().getPlayerBuildings().get(Buildings.LABOR_OFFICE));
		this.add((Component) GameManager.getInstance().getPlayerManager().getPlayer().getPlayerBuildings().get(Buildings.TOWER_OF_SKILL));
		this.add((Component) GameManager.getInstance().getPlayerManager().getPlayer().getPlayerBuildings().get(Buildings.CHURCH));
		this.add((Component) GameManager.getInstance().getPlayerManager().getPlayer().getPlayerBuildings().get(Buildings.INN));
	}
}
