package pkg63player;

import java.awt.event.ActionEvent;
import javax.swing.Timer;

/**
 *
 * @author tala
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Splashscreen hehe = new Splashscreen();
        hehe.setVisible(true);

        Timer delayTimer = new Timer(500, (ActionEvent e) -> {
            hehe.TransitionTimer(hehe);
        });
        delayTimer.setRepeats(false);
        delayTimer.start();
    }
    
}
