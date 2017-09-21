
package treino_auditivo;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Humberto
 */
public class Player implements LineListener{
    
     /**
     * this flag indicates whether the playback completes or not.
     */
    boolean playCompleted;
     
    /**
     * Play a given audio file.
     * @param audioFilePath Path of the audio file.
     */
    void play(String audioFilePath) {
        File audioFile = new File(audioFilePath);
 
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
 
            AudioFormat format = audioStream.getFormat();
 
            DataLine.Info info = new DataLine.Info(Clip.class, format);
 
            Clip audioClip = (Clip) AudioSystem.getLine(info);
 
            audioClip.addLineListener(this);
 
            audioClip.open(audioStream);
             
            audioClip.start();
             
           // while (!playCompleted) {
                // wait for the playback completes
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                //playCompleted = true;
            //}
             
            audioClip.close();
             
        } catch (UnsupportedAudioFileException ex) {
            System.out.println("O arquivo de áudio solicitado não é válido.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("O áudio solicitado não está disponível.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Erro ao tocar o áudio.");
            ex.printStackTrace();
        }
     
    }

    public void update(LineEvent event) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
