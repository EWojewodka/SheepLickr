package wroclaw.jemiol.GUI;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

public class FontLoader {

	private Font mainFont;

	public FontLoader() throws FontFormatException, IOException {
		setMainFont(loadMainFont());
	}

	public Font getMainFont() {
		return mainFont;
	}

	public void setMainFont(Font mainFont) {
		this.mainFont = mainFont;
	}

	private Font loadMainFont() throws FontFormatException, IOException {
		Font font = Font.createFont(Font.TRUETYPE_FONT,
				new File("src/resources/font/orange juice 2.0.ttf"));
		return font.deriveFont(72f);
	}
}
