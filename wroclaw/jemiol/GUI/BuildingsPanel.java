package wroclaw.jemiol.GUI;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BuildingsPanel extends JPanel {

	public BuildingsPanel() {
		setVisible(true);
		setPreferredSize(new Dimension(50, 50));
		setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.black));
	}
}
