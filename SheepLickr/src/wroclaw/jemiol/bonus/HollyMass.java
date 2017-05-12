package wroclaw.jemiol.bonus;

import wroclaw.jemiol.manager.GameManager;

public class HollyMass {

	public HollyMass(int level) {
		changeReligionRatio(level);
	}

	private void changeReligionRatio(int level) {
		GameManager.getInstance().getPlayerManager().getPlayer().setReligionRatio(
				GameManager.getInstance().getPlayerManager().getPlayer().getReligionRatio() + (level * 1.3));
	}
}
