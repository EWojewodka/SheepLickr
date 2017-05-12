package wroclaw.jemiol.bonus;

import wroclaw.jemiol.entity.Shepherd;
import wroclaw.jemiol.manager.GameManager;
import wroclaw.jemiol.util.RandomVar;

public class AddSkills {

	
	public AddSkills() {
		for(Shepherd shepherd : GameManager.getInstance().getPlayerManager().getPlayer().getPlayerShepherd()) {
			shepherd.getPowers().add(RandomVar.getRandomPowers());
		}
	}
}
