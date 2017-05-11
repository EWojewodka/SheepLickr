package wroclaw.jemiol.GUI;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import wroclaw.jemiol.manager.GameManager;

@SuppressWarnings("serial")
public class PauseButtonLabel extends JLabel implements MouseListener {

	private boolean gamePanelIsFreezed = false;

	public PauseButtonLabel() {
		setSize(40, 40);
		setIcon(getLabelImage());
		addMouseListener(this);
		setVisible(true);
	}

	private ImageIcon getLabelImage() {
		ImageIcon ic = new ImageIcon("src/resources/pauseButton.png");
		Image newImage = ic.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		return new ImageIcon(newImage);
	}

	public boolean isGamePanelIsFreezed() {
		return gamePanelIsFreezed;
	}

	public void setGamePanelIsFreezed(boolean gamePanelIsFreezed) {
		this.gamePanelIsFreezed = gamePanelIsFreezed;
	}

	public void changeGamePanelFreezing() {
		if (GameManager.getInstance().getTimeManager().isFreezed()) {
			GameManager.getInstance().getTimeManager().setFreezed(false);
		} else {
			GameManager.getInstance().getTimeManager().setFreezed(true);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		changeGamePanelFreezing();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
