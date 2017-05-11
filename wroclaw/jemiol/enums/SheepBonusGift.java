package wroclaw.jemiol.enums;

import wroclaw.jemiol.entity.Shepherd;

public enum SheepBonusGift {
	/**
	 * 
	 */
	NOTHING(0, 0, 0, null),
	/**
	 * 
	 */
	SUPER_GOLD(200, 0, 0, null),
	/**
	 * 
	 */
	COOLDOWN_REDUCTION(0, 0, 0.20, null),
	/**
	 * 
	 */
	BONUS_SHEPHERD(0, 0, 0, null), // TODO FINISH SHEEPHERD ENTITY
	/**
	 * 
	 */
	DOUBLE_MOUSE(0, 2, 0, null);

	private int gold, mouseMultiplicity;
	private double reduction;
	private Shepherd bonusShepherd;

	private SheepBonusGift(int gold, int mouseMultiplicity, double reduction, Shepherd bonusShepherd) {
		this.gold = gold;
		this.mouseMultiplicity = mouseMultiplicity;
		this.reduction = reduction;
		this.bonusShepherd = bonusShepherd;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}

	public int getMouseMultiplicity() {
		return mouseMultiplicity;
	}

	public void setMouseMultiplicity(int mouseMultiplicity) {
		this.mouseMultiplicity = mouseMultiplicity;
	}

	public double getReduction() {
		return reduction;
	}

	public void setReduction(double reduction) {
		this.reduction = reduction;
	}

	public Shepherd getBonusShepherd() {
		return bonusShepherd;
	}

	public void setBonusShepherd(Shepherd bonusShepherd) {
		this.bonusShepherd = bonusShepherd;
	}

}
