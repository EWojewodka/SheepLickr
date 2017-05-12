package wroclaw.jemiol.GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Set;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JLabel;

import wroclaw.jemiol.entity.Shepherd;
import wroclaw.jemiol.manager.GameManager;

@SuppressWarnings("serial")
public class ShepherdInfo extends JLabel implements MouseListener {

	public ShepherdInfo(Shepherd shepherd) {
		super();
		setPreferredSize(new Dimension(300, 150));
		setSize(getPreferredSize());
		setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		setVisible(true);
		setOpaque(true);
		setLayout(new FlowLayout());
		setText("<html> Name: " + shepherd.getName() + "<br/>" + "Score per sec.: " + shepherd.getScorePerSec()
				+ "<br/>" + "Powers: " + toStringTab(shepherd.getPowers()) + "<br/>" + "Inclinations: "
				+ shepherd.getInclinations().getName() + "</html>");
		addMouseListener(this);
	}

	private String toStringTab(Set<?> list) {
		String[] tab = new String[list.size()];
		String textOut = "";
		int index = 0;
		for (Object element : list) {
			tab[index] = element.toString();
			index++;
		}
		for(int i=0; i < tab.length; i++) {
			textOut += tab[i] + " ";
		}
		return textOut;
	}

	public void showInfo() {
		GameManager.getInstance().getPanelsManager().getLeftPanel().add(Box.createHorizontalGlue());
		GameManager.getInstance().getPanelsManager().getLeftPanel().add(this);
		GameManager.getInstance().getPanelsManager().getLeftPanel().revalidate();
	}

	public void hideInfo() {
		GameManager.getInstance().getPanelsManager().getLeftPanel().remove(this);
		GameManager.getInstance().getPanelsManager().getLeftPanel().revalidate();
		GameManager.getInstance().getShephardManager().setInfoIsShowed(false);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		hideInfo();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

}
