package wroclaw.jemiol.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;

import wroclaw.jemiol.entity.Shepherd;

@SuppressWarnings("serial")
public class ShepherdInformation extends JLabel {

	public ShepherdInformation(Shepherd shepherd) {
		setPreferredSize(new Dimension(150, 150));
		setBackground(Color.white);
		setBorder(BorderFactory.createMatteBorder(3, 3, 3, 3, Color.BLACK));
		setLayout(new BorderLayout());
	}

}
