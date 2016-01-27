// imported library
import javax.swing.SwingUtilities;

/**
 * @author punkdawa
 */
public class Main {
    
    // initializing main frame
    private static void createMainFrame() {
        new Window().initMainFrame();
    }
    
    // run main frame
    @SuppressWarnings("Convert2Lambda")
    public static void main (String [] args) {
        SwingUtilities.invokeLater (new Runnable() {
            @Override
            public void run() {
                createMainFrame();
            }
        });
    }
}
