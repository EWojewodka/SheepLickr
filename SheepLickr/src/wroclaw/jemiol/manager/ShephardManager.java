package wroclaw.jemiol.manager;

import java.awt.event.MouseEvent;
import java.util.TimerTask;

import wroclaw.jemiol.GUI.ShepherdInformation;
import wroclaw.jemiol.entity.Shepherd;

public class ShephardManager {

	private int maxRespHeight;

	public ShephardManager() {
	}

	public TimerTask getBonusFromShepherd(Shepherd shepherd) {
		return new TimerTask() {
			@Override
			public void run() {
				GameManager.getInstance().getPlayerManager().getPlayer().setScore(shepherd.getScorePerSec());
			}
		};
	}

	public ShepherdInformation showShepherdInfo(MouseEvent e) {
		for (Shepherd shepherd : GameManager.getInstance().getPlayerManager().getPlayer().getPlayerShepherd()) {
			if (shepherd.getShepherdRectangle().contains(e.getX(), e.getY())) {
				return new ShepherdInformation(shepherd);
			}
		}
		return null;
	}

	public int getMaxRespHeight() {
		return maxRespHeight;
	}

	public void setMaxRespHeight(int maxRespHeight) {
		this.maxRespHeight = maxRespHeight;
	}

}
