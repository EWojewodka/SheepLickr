package wroclaw.jemiol.manager;

import java.io.File;
import java.io.FileNotFoundException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class AudioManager {
	private Clip clip;
	private AudioInputStream audioInputStream;

	public AudioManager() throws FileNotFoundException {
		playAudio();
	}

	private void playAudio() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(new File("src/resources/mainThemeAudio.wav"));
			clip = (Clip) AudioSystem.getLine(new DataLine.Info(Clip.class, audioInputStream.getFormat()));
//			 clip.open(audioInputStream);
//			 clip.loop(Clip.LOOP_CONTINUOUSLY);
//			 clip.start();
			// TODO CHANGE AUDIO AFTER GUI
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public Clip getClip() {
		return clip;
	}

}
