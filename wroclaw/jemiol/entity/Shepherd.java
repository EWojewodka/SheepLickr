package wroclaw.jemiol.entity;

import java.awt.Image;
import java.awt.Rectangle;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

import javax.swing.ImageIcon;

import org.json.JSONException;

import wroclaw.jemiol.enums.Gender;
import wroclaw.jemiol.enums.Powers;
import wroclaw.jemiol.util.RandomVar;

public class Shepherd {
	private Set<Powers> powers;
	private double timeToBreak;
	private String name;
	private Set<Gender> inclinations;
	private Gender gender;
	private int posX, posY;

	public Shepherd() throws JSONException, FileNotFoundException {
		super();
		this.gender = RandomVar.getRandomGender();
		this.name = getRandomName();
		this.inclinations = new HashSet<Gender>();
		this.powers = RandomVar.getRandomPowers();
		this.posX = RandomVar.getRandomIntBetween(0, 400);
		this.posY = 400;
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

	public double getTimeToBreak() {
		return timeToBreak;
	}

	public void setTimeToBreak(double timeToBreak) {
		this.timeToBreak = timeToBreak;
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

}
