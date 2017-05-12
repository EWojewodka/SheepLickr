package wroclaw.jemiol.GUI;

import java.awt.GridBagLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.TimerTask;

import javax.swing.ImageIcon;
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
		setLayout(new GridBagLayout());
		add(leftPanel, leftPanel.setLeftPanel());
		add(gamePanel, gamePanel.setGamePanel());
		setVisible(true);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		gameFrameTask();
		setCursor(Toolkit.getDefaultToolkit().createCustomCursor(new ImageIcon("src/resources/cursor.png").getImage(),
				new Point(0, 0), "HandCursor"));
		GameManager.getInstance().getPanelsManager().setLeftPanel(leftPanel);
		GameManager.getInstance().getPanelsManager().setGamePanel(gamePanel);
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
				GameManager.getInstance().getShephardManager().setMaxRespHeight(gamePanel.getHeight());

			}
		}, 0, 1000);
	}

}
