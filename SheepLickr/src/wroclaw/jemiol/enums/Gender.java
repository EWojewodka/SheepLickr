package wroclaw.jemiol.enums;

public enum Gender {
	/**
	 * 
	 */
	FEMALE("Female"),
	/**
	 * 
	 */
	MALE("Male");

	private String name;

	private Gender(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
