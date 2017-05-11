package wroclaw.jemiol.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

import wroclaw.jemiol.entity.Shepherd;

@SuppressWarnings("serial")
public class ShepherdInformation extends JLabel implements MouseListener {

	private Shepherd shepherd;

	public ShepherdInformation(Shepherd shepherd) {
		this.shepherd = shepherd;
		setPreferredSize(new Dimension(150, 150));
		setVisible(true);
		setOpaque(true);
		setText(shepherd.getName());
		setBackground(Color.orange);
		addMouseListener(this);
		setLocation(shepherd.getPosX(), shepherd.getPosY());
	}

	public String[] getPowers() {
		String[] powers = new String[3];
		for (int i = 0; i < shepherd.getPowers().size(); i++) {
			powers[i] = shepherd.getPowers().iterator().next().name();
		}
		return powers;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

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
		setVisible(false);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
