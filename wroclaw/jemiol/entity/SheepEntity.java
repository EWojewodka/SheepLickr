package wroclaw.jemiol.entity;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.TimerTask;

import javax.swing.ImageIcon;

import wroclaw.jemiol.enums.Gender;
import wroclaw.jemiol.enums.Religion;
import wroclaw.jemiol.enums.SheepBonusGift;
import wroclaw.jemiol.manager.GameManager;
import wroclaw.jemiol.util.RandomVar;

public class SheepEntity {
	private int posX, posY;
	private SheepBonusGift bonus;
	private Gender gender;
	private Religion religion;
	private boolean alive;
	private int speedOfFalling;
	private int maxRespWidth;

	public SheepEntity(int maxRespWidth) {
		posX = RandomVar.getRandomIntBetween(0, maxRespWidth);
		posY = 0;
		this.bonus = RandomVar.getRandomBonusSheep();
		this.gender = RandomVar.getRandomGender();
		this.alive = true;
		this.speedOfFalling = RandomVar.getRandomIntBetween(1, 4);
		this.religion = RandomVar.getRandomReligion();
		GameManager.getInstance().getTimeManager().getTimer().scheduleAtFixedRate(updateSheep(), 0, 10);
	}

	public void sheepFalling() {
		setPosY(posY + speedOfFalling);
	}

	private void shouldBeDead() {
		if (posY > 1300) {
			setAlive(false);
		}
	}

	public Image getSheepImage() {
		ImageIcon ic = new ImageIcon("src/resources/sheep1.png");
		return ic.getImage();
	}

	public TimerTask updateSheep() {
		return new TimerTask() {

			@Override
			public void run() {
				if (!GameManager.getInstance().getTimeManager().isFreezed()) {
					shouldBeDead();
					sheepFalling();
				}
			}
		};
	}

	public Religion getReligion() {
		return religion;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
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

	public SheepBonusGift getBonus() {
		return bonus;
	}

	public Gender getGender() {
		return gender;
	}

	public Rectangle getSheepRectangle() {
		return new Rectangle(posX, posY, 50, 50);
	}

	public int getMaxRespWidth() {
		return maxRespWidth;
	}

	public void setMaxRespWidth(int maxRespWidth) {
		this.maxRespWidth = maxRespWidth;
	}

}
