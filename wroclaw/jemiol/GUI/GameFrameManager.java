package wroclaw.jemiol.GUI;

import java.awt.GridBagLayout;
import java.util.TimerTask;

import javax.swing.JFrame;

import wroclaw.jemiol.manager.GameManager;

@SuppressWarnings("serial")
public class GameFrameManager extends JFrame {

	private GamePanel gamePanel;
	private LeftPanel leftPanel;

	public GameFrameManager() {
		gamePanel = new GamePanel();
		leftPanel = new LeftPanel();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridBagLayout());
		getContentPane().add(leftPanel, leftPanel.setLeftPanel());
		getContentPane().add(gamePanel, gamePanel.setGamePanel());
		getContentPane().setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		gameFrameTask();
	}

	public void gameFrameTask() {
		GameManager.getInstance().getTimeManager().getTimer().scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				repaint();
			}
		}, 0, 10);

		GameManager.getInstance().getTimeManager().getTimer().scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				GameManager.getInstance().getSheepManager().setMaxRespWidth(gamePanel.getWidth());

			}
		}, 0, 1000);
	}

}
