package wroclaw.jemiol.GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;

import wroclaw.jemiol.entity.SheepEntity;
import wroclaw.jemiol.entity.Shepherd;
import wroclaw.jemiol.manager.GameManager;
import wroclaw.jemiol.util.Display;

@SuppressWarnings("serial")
public class GamePanel extends JPanel implements MouseInputListener {

	private int panelSize;

	public GamePanel() {
		setVisible(true);
		setBackground(new Color(31, 98, 240));
		addMouseListener(this);
		GameManager.getInstance().getSheepManager().startSheepManager();
		setLayout(new FlowLayout());
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (SheepEntity sheep : GameManager.getInstance().getSheepManager().getSheepList()) {
			g.drawImage(sheep.getSheepImage(), sheep.getPosX(), sheep.getPosY(), 50, 50, null);
		}
		for (Shepherd shepherd : GameManager.getInstance().getPlayerManager().getPlayer().getPlayerShepherd()) {
			g.drawImage(shepherd.getShepherdImage(), shepherd.getPosX(), shepherd.getPosY(), 100, 100, null);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		GameManager.getInstance().getSheepManager().checkMouseOnSheep(e);
		GameManager.getInstance().getPlayerManager().getPlayer().setScore(1);
		new PaintMouseEffect(e.getPoint(), this);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {

	}

	public int getPanelSize() {
		return panelSize;
	}

	public void setPanelSize(int panelSize) {
		this.panelSize = panelSize;
	}

	public GridBagConstraints setGamePanel() {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.LINE_END;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 0.7;
		gbc.weighty = 1;
		gbc.ipadx = (int) (Toolkit.getDefaultToolkit().getScreenSize().width * 0.7);
		gbc.ipady = (int) (Display.getBestSize().height);
		return gbc;
	}

}
