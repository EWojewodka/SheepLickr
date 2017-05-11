package wroclaw.jemiol.GUI;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import wroclaw.jemiol.manager.GameManager;
import wroclaw.jemiol.util.Display;

public class LeftPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int panelSize;
	private PauseButtonLabel pauseButton;
	private BuildingsPanel buildingsPanel;

	public LeftPanel() {
		setVisible(true);
		setBackground(new Color(187, 207, 250));
		setBorder(BorderFactory.createMatteBorder(0, 0, 0, 3, Color.black));
		pauseButton = new PauseButtonLabel();
		buildingsPanel = new BuildingsPanel();
		add(pauseButton);
		add(buildingsPanel);
	}

	public int getPanelSize() {
		return panelSize;
	}

	public void setPanelSize(int panelSize) {
		this.panelSize = panelSize;
	}

	public PauseButtonLabel getPauseButton() {
		return pauseButton;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(GameManager.getInstance().getFontLoader().getMainFont());
		g.setColor(new Color(31, 98, 240));
		g.drawString(String.valueOf(GameManager.getInstance().getPlayerManager().getPlayer().getScore()),
				getWidth() / 3, 100);
	}

	public GridBagConstraints setLeftPanel() {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.weightx = 0.3;
		gbc.weighty = 1;
		gbc.ipadx = (int) (Toolkit.getDefaultToolkit().getScreenSize().width * 0.3);
		gbc.ipady = (int) (Display.getBestSize().height);
		return gbc;
	}

}
