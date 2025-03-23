package simple.view;

import simple.model.IModelAdapter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

/**
 * Temperature calculator frame.
 *
 * @author Mathias Ricken
 */
public class TempCalcFrame extends JFrame {
    /**
     * Create a new temperature calculator frame.
     *
     * @param modelAdapter adapter to one.simple.three.three2.full.general.model
     */
    public TempCalcFrame(IModelAdapter modelAdapter) {
        super("Temperature Calculator");
        setLayout(new BorderLayout(1, 2));
        add(new TempCalcView(modelAdapter), BorderLayout.CENTER);
        pack();
        Dimension screenSize;
        try {
            Toolkit tk = Toolkit.getDefaultToolkit();
            screenSize = tk.getScreenSize();
        }
        catch (AWTError awe) {
            screenSize = new Dimension (640, 480);
        }
        Dimension frameSize = getSize();
        
        /* Fill screen if the screen is smaller that qtfSize. */
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        
        /* Center the screen */
        int x = screenSize.width/2 - frameSize.width/2;
        int y = screenSize.height/2 - frameSize.height/2;
        System.out.println(x+" "+y);
        setLocation(x,y);
    }

    /**
     * Overridden so we can exit when window is closed.
     *
     * @param e event
     */
    protected void processWindowEvent(WindowEvent e) {
        super.processWindowEvent(e);
        if (WindowEvent.WINDOW_CLOSING == e.getID()) {
            System.exit(0);
        }
    }
}
