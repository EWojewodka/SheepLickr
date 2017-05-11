package wroclaw.jemiol.enums;

public enum Buildings {
	/**
	 * 
	 */
	PASTURE("Pasture"),
	/**
	 * 
	 */
	SHEEPFOLD("Sheepfold"),
	/**
	 * 
	 */
	LABOR_OFFICE("Labor office"),
	/**
	 * 
	 */
	TOWER_OF_SKILL("Tower of skill"),
	/**
	 * 
	 */
	CHURCH("Church"),
	/**
	 * 
	 */
	INN("Inn");

	private String name;

	private Buildings(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
