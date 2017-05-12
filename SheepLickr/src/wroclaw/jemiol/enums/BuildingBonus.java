package wroclaw.jemiol.enums;

public enum BuildingBonus {
	/**
	 * 
	 */
	MORE_SHEEP_BONUS_SMALL("More sheeps"),
	/**
	 * 
	 */
	MORE_SHEEP_BONUS_BIG("A LOT OF SHEEPS"),
	/**
	 * 
	 */
	BONUS_SKILL_FOR_ALL_SHEEPHERD("More skills for sheepherds"),
	/**
	 * 
	 */
	HOLLY_MASS("Bonus for religious"),
	/**
	 * 
	 */
	CYCLIC_SHEEPHERD_RESP("New sheepherd"),
	/**
	 * 
	 */
	SHEEPHERD_REGENERATION("Cooldown reduction"); //TODO ADD TO BONUS UNWRAPPER AFTER POWERS

	private String description;

	private BuildingBonus(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
