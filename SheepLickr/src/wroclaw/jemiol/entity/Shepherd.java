package wroclaw.jemiol.entity;

import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Rectangle;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;
import java.util.TimerTask;

import javax.swing.ImageIcon;

import org.json.JSONException;

import wroclaw.jemiol.enums.Gender;
import wroclaw.jemiol.enums.Powers;
import wroclaw.jemiol.manager.GameManager;
import wroclaw.jemiol.util.RandomVar;

public class Shepherd {
	private int posX, posY;
	private String name;
	private Set<Powers> powers;
	private Set<Gender> inclinations;
	private Gender gender;
	private double timeAliveInSec;

	public Shepherd() throws JSONException, FileNotFoundException {
		this.gender = RandomVar.getRandomGender();
		this.name = getRandomName();
		this.inclinations = new HashSet<Gender>();
		this.powers = RandomVar.getRandomPowers();
		this.posX = RandomVar.getRandomIntBetween(0, 400);
		this.posY = GameManager.getInstance().getShephardManager().getMaxRespHeight() - 100;
		GameManager.getInstance().getTimeManager().getTimer().schedule(shepherdUpdate(), 0, 10);
		GameManager.getInstance().getTimeManager().getTimer().scheduleAtFixedRate(
				GameManager.getInstance().getShephardManager().getBonusFromShepherd(this), 1000, 1000);
	}

	private TimerTask shepherdUpdate() {
		return new TimerTask() {
			// TODO INFO
			@Override
			public void run() {
				isEntered();
				timeAliveInSec += 0.01;
			}
		};
	}

	private boolean isEntered() {
		return getShepherdRectangle().contains(MouseInfo.getPointerInfo().getLocation());
	}

	public String getRandomName() throws JSONException, FileNotFoundException {
		if (this.gender == Gender.MALE) {
			return RandomVar.getRandomMaleName();
		} else {
			return RandomVar.getRandomFemaleName();
		}
	}

	public Rectangle getShepherdRectangle() {
		return new Rectangle(posX, posY, 100, 100);
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public Image getShepherdImage() {
		ImageIcon ic = new ImageIcon("src/resources/shepherd.png");
		return ic.getImage();
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Set<Powers> getPowers() {
		return powers;
	}

	public void setPowers(Set<Powers> powers) {
		this.powers = powers;
	}

	public Set<Gender> getInclinations() {
		return inclinations;
	}

	public void setInclinations(Set<Gender> inclinations) {
		this.inclinations = inclinations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScorePerSec() {
		return (int) timeAliveInSec;
	}

	public double getTimeAliveInSec() {
		return timeAliveInSec;
	}

}
