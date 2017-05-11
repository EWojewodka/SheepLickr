package wroclaw.jemiol.util;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Display {

	public static Dimension getBestSize() {
		return new Dimension(Toolkit.getDefaultToolkit().getScreenSize().width / 4,
				Toolkit.getDefaultToolkit().getScreenSize().height - 80);
	}
	
}
