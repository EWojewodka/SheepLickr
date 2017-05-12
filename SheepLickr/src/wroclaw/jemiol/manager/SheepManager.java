package wroclaw.jemiol.manager;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

import wroclaw.jemiol.entity.Player;
import wroclaw.jemiol.entity.SheepEntity;
import wroclaw.jemiol.util.BonusDistributor;
import wroclaw.jemiol.util.TimeConversion;

public class SheepManager {
	private int maxRespWidth;
	private long timeOfSheepResp = 2000;
	private List<SheepEntity> sheepList;
	private List<SheepEntity> removedList;

	public SheepManager() {
		sheepList = new ArrayList<SheepEntity>();
		removedList = new ArrayList<>();
	}

	public List<SheepEntity> getSheepList() {
		return sheepList;
	}

	public void startSheepManager() {
		GameManager.getInstance().getTimeManager().getTimer().schedule(addSheep(), 0, timeOfSheepResp);
		GameManager.getInstance().getTimeManager().getTimer().schedule(removeSheep(), 0,
				TimeConversion.MILISECOND * 100);
	}

	public void checkMouseOnSheep(MouseEvent e) {
		Player player = GameManager.getInstance().getPlayerManager().getPlayer();
		for (SheepEntity sheep : GameManager.getInstance().getSheepManager().getSheepList()) {
			if (sheep.getSheepRectangle().contains(e.getX(), e.getY())) {
				player.setScore(sheep.getScore());
				System.out.println(sheep.getScore());
				BonusDistributor.getSheepBonus(sheep);
				GameManager.getInstance().getSheepManager().getRemovedList().add(sheep);
			}
		}
	}

	/**
	 * It's task responsible for creating new sheep. <br/>
	 * Time is set in startSheepManage()
	 * 
	 * @return
	 */
	public TimerTask addSheep() {
		return new TimerTask() {

			@Override
			public void run() {
				if (!GameManager.getInstance().getTimeManager().isFreezed()) {
					sheepList.add(new SheepEntity(maxRespWidth));
					System.out.println(timeOfSheepResp);
				}
			}
		};
	}

	/**
	 * Remove sheep from sheepList. <br/>
	 * Sheep is added to removedList if isAlive() = false <br/>
	 * After iteration loop, removedList is deleted from sheepList.
	 * 
	 * @return
	 */
	public TimerTask removeSheep() {
		return new TimerTask() {

			@Override
			public void run() {
				for (SheepEntity sheep : sheepList) {
					if (!sheep.isAlive()) {
						removedList.add(sheep);
					}
				}
				sheepList.removeAll(removedList);
				removedList.clear();
			}
		};
	}

	public int getMaxRespWidth() {
		return maxRespWidth;
	}

	public void setMaxRespWidth(int maxRespWidth) {
		this.maxRespWidth = maxRespWidth;
	}

	public List<SheepEntity> getRemovedList() {
		return removedList;
	}

	public long getTimeOfSheepResp() {
		return timeOfSheepResp;
	}

	public void setTimeOfSheepResp(long timeOfSheepResp) {
		this.timeOfSheepResp = timeOfSheepResp;
	}

}
