package luciferdisciple.demo.gameloop;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

/**
 *
 * @author Lucifer Disciple <piotr.momot420@gmail.com>
 */
public class TimerApplication extends InteractiveApplication {
    
    private long totalMiliseconds = 0;
    
    public TimerApplication(Screen screen) {
        super(screen);
    }

    @Override
    protected void initialize() {
        
    }

    @Override
    protected void draw(Screen screen) {
        long minute = (this.totalMiliseconds / 1000) / 60;
        long second = (this.totalMiliseconds / 1000) % 60;
        long milisecond = this.totalMiliseconds % 1000;
        String formatedTime = String.format(
            "%1$02d:%2$02d.%3$03d",
            minute, second, milisecond
        );
        screen.newTextGraphics().putString(
                TerminalPosition.TOP_LEFT_CORNER,
                formatedTime
        );
        screen.newTextGraphics().putString(
            new TerminalPosition(0, 2),
            "Press ESC to exit."
        );
    }

    @Override
    protected void update(long timeDelta) {
        this.totalMiliseconds += timeDelta;
    }

    @Override
    protected void receiveInput(KeyStroke keyStroke) {
        if (keyStroke.getKeyType() == KeyType.Escape)
            stop();
    }    
}
