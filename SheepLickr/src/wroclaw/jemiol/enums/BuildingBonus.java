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
	CYCLIC_SHEEPHERD_RESP("New sheepherd for 60 sec"),
	/**
	 * 
	 */
	SHEEPHERD_REGENERATION("Cooldown reduction");

	private String name;

	private BuildingBonus(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
