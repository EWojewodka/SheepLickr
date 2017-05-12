package wroclaw.jemiol.manager;

import java.awt.event.MouseEvent;
import java.util.TimerTask;

import wroclaw.jemiol.GUI.ShepherdInfo;
import wroclaw.jemiol.entity.Shepherd;

public class ShephardManager {

	private int maxRespHeight;
	private ShepherdInfo shepherdInfo;
	private boolean infoIsShowed;

	public ShephardManager() {
		infoIsShowed = false;
	}

	public TimerTask getBonusFromShepherd(Shepherd shepherd) {
		return new TimerTask() {
			@Override
			public void run() {
				GameManager.getInstance().getPlayerManager().getPlayer().setScore(shepherd.getScorePerSec());
			}
		};
	}

	public Shepherd isShepherdClicked(MouseEvent e) {
		for (Shepherd shepherd : GameManager.getInstance().getPlayerManager().getPlayer().getPlayerShepherd()) {
			if (shepherd.getShepherdRectangle().contains(e.getPoint())) {
				return shepherd;
			}
		}
		return null;
	}

	public void fillShepherdInfoLabel(Shepherd shepherd) {
		if (!infoIsShowed) {
			this.shepherdInfo = new ShepherdInfo(shepherd);
			this.shepherdInfo.showInfo();
			infoIsShowed = true;
		}
	}

	public boolean isInfoIsShowed() {
		return infoIsShowed;
	}

	public void setInfoIsShowed(boolean infoIsShowed) {
		this.infoIsShowed = infoIsShowed;
	}

	public int getMaxRespHeight() {
		return maxRespHeight;
	}

	public void setMaxRespHeight(int maxRespHeight) {
		this.maxRespHeight = maxRespHeight;
	}

	public ShepherdInfo getShepherdInfo() {
		return shepherdInfo;
	}

	public void setShepherdInfo(ShepherdInfo shepherdInfo) {
		this.shepherdInfo = shepherdInfo;
	}

}
