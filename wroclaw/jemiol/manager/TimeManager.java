package wroclaw.jemiol.manager;

import java.util.Timer;

public class TimeManager {

	private Timer timer;
	private boolean freezed;

	public TimeManager() {
		timer = new Timer();
		freezed = false;
	}

	public Timer getTimer() {
		return timer;
	}

	public void setTimer(Timer timer) {
		this.timer = timer;
	}

	public boolean isFreezed() {
		return freezed;
	}

	public void setFreezed(boolean freezed) {
		this.freezed = freezed;
	}

}
