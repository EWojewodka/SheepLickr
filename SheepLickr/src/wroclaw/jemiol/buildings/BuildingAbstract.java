package wroclaw.jemiol.buildings;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import wroclaw.jemiol.enums.BuildingBonus;
import wroclaw.jemiol.enums.Buildings;
import wroclaw.jemiol.manager.GameManager;

@SuppressWarnings("serial")
public abstract class BuildingAbstract extends JLabel implements MouseListener {
	protected int level;
	protected int maxLevel;
	protected int cost;
	protected int costAtNextLevel;
	protected boolean bought;
	protected ImageIcon image;
	protected String pathToColorImage, pathToGreyImage;
	protected Dimension dimension;
	protected Buildings type;
	protected BuildingBonus buildingBonus;
	protected JLabel buildInfo;

	public BuildingAbstract() {
		super();
		this.level = 0;
		this.dimension = new Dimension(70, 70);
		this.bought = false;
		this.setSize(dimension);
		this.setPreferredSize(dimension);
		this.setMaximumSize(dimension);
		this.addMouseListener(this);
		this.setHorizontalAlignment(JLabel.CENTER);
	}

	protected boolean checkMouseClicked(MouseEvent e) {
		if (this.contains(e.getX(), e.getY())) {
			return true;
		}
		return false;
	}

	public ImageIcon getImage() {
		ImageIcon ic;
		if (bought != true) {
			ic = new ImageIcon(this.pathToGreyImage);
		} else {
			ic = new ImageIcon(this.pathToColorImage);
		}
		Image image = ic.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
		return new ImageIcon(image);
	}

	protected void changeImage() {
		if (bought != true) {
			bought = true;
			setIcon(getImage());
			revalidate();
		}
	}

	protected void showInfo() {
		JLabel info = new JLabel();
		info.setFont(new Font("Monospaced", Font.BOLD, 10));
		info.setLocation(0, 0);
		info.setVisible(true);
		info.setOpaque(true);
		info.setSize(this.getSize());
		info.setText("<html>"+ 
				type.getName() + "<br/>" +
				"Level: " + level + "<br/>" +
				"Bonus: " + buildingBonus.getName() + "<br/>" + 
				"Cost at next level: " + cost + "<br/>" + 
		"</html>");
		info.setBackground(new Color(187, 207, 250));
		info.setForeground(Color.black);
		info.setHorizontalAlignment(JLabel.CENTER);
		this.buildInfo = info;
		this.add(buildInfo);
	}
	
	protected void buy() {
		GameManager.getInstance().getBuildingManager().buyBuilding(type);
	}
	
	protected void hideInfo() {
		this.remove(buildInfo);
	}

	public Buildings getType() {
		return type;
	}

	public void setType(Buildings type) {
		this.type = type;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getMaxLevel() {
		return maxLevel;
	}

	public void setMaxLevel(int maxLevel) {
		this.maxLevel = maxLevel;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public boolean isBought() {
		return bought;
	}

	public void setBought(boolean bought) {
		this.bought = bought;
	}

	public int getCostAtNextLevel() {
		return (int) (cost*level * 1.8);
	}

	public void setCostAtNextLevel(int costAtNextLevel) {
		this.costAtNextLevel = costAtNextLevel;
	}

	public BuildingBonus getBuildingBonus() {
		return buildingBonus;
	}

	public void setBuildingBonus(BuildingBonus buildingBonus) {
		this.buildingBonus = buildingBonus;
	}

}
