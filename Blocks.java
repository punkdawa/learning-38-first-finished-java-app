// imported library
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JPanel;

/**
 * @author punkdawa
 */
public class Blocks {
    
    // initiating Blocks Array
    public void initBlocks() {
        Container container = Window.viewerBoard;
        container.setLayout(new GridLayout(8, 8));
    }
    
    // testing random colors, last int is alpha
    private final Random random = new Random();
    private Color rC() {
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)/*, random.nextInt(255)*/);
    }
    
    // stating array int
    public JPanel [][] blocksArray = new JPanel[8][8];
    int cols = 0;
    int rows = 0;
    
    // create array of blocks
    public Blocks() {
        initBlocks();
        for (cols = 0; cols < blocksArray.length; cols++) {
            JPanel colsPanel = new JPanel();
            colsPanel.setBackground(rC());
            colsPanel.setVisible(true);
            Window.viewerBoard.add(colsPanel);

            for (rows = 1; rows < blocksArray[cols].length; rows++) {
                JPanel rowsPanel = new JPanel();
                rowsPanel.setBackground(rC());
                rowsPanel.setVisible(true);
                Window.viewerBoard.add(rowsPanel);
            }
        }
    }
}
