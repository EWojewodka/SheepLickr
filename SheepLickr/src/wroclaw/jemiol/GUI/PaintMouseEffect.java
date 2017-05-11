package wroclaw.jemiol.GUI;

import java.awt.Point;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import wroclaw.jemiol.manager.GameManager;

@SuppressWarnings("serial")
public class PaintMouseEffect extends JLabel {

	private JPanel panel;

	public PaintMouseEffect(Point point, JPanel panel) {
		this.panel = panel;
		setSize(50, 50);
		setIcon(new ImageIcon("src/resources/hitPow.png"));
		setOpaque(false);
		setLocation((int)point.getX() - 25, (int)point.getY()-25);
		panel.add(this);
		GameManager.getInstance().getTimeManager().getTimer().schedule(task(), 100, 2000);
	}

	public TimerTask task() {
		return new TimerTask() {

			@Override
			public void run() {
				panel.remove(PaintMouseEffect.this);
			}
		};
	}

}
