import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;

class Sound {
	public void eat() {
		try {
			//open an audio input stream
			URL url = this.getClass().getClassLoader().getResource("./eat.wav");
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
			//get a sound clip resource
			Clip clip = AudioSystem.getClip();
			//open audio clip and load samples from the audio input stream
			clip.open(audioIn);
			clip.start();
		} catch (UnsupportedAudioFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (LineUnavailableException e) {
			e.printStackTrace();
        }
    }
}