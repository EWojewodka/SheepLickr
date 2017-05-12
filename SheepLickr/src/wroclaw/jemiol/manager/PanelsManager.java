package wroclaw.jemiol.manager;

import javax.swing.JPanel;

public class PanelsManager {

	private JPanel leftPanel;
	private JPanel gamePanel;

	public PanelsManager() {
		leftPanel = null;
		gamePanel = null;
	}

	public JPanel getLeftPanel() {
		return leftPanel;
	}

	public void setLeftPanel(JPanel leftPanel) {
		this.leftPanel = leftPanel;
	}

	public JPanel getGamePanel() {
		return gamePanel;
	}

	public void setGamePanel(JPanel gamePanel) {
		this.gamePanel = gamePanel;
	}

}
