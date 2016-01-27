// imported library
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 * @author punkdawa
 */
public class Window {
    
    // initators
    public void initMainFrame() {
        Container container = mainFrame.getContentPane();
        container.setLayout(null);
    }
    private static void createBlocks() {
        new Blocks().initBlocks();
    }
    
    // stating things
    public static JFrame mainFrame = new JFrame("learning 38");
    public static JPanel viewerBoard = new JPanel();
    public static JButton randomize = new JButton("RANDOMIZER");
    
    // forming main window
    @SuppressWarnings("Convert2Lambda")
    public Window() {
        initMainFrame();
        mainFrame.setSize(237,357);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setAlwaysOnTop(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        
        // viewer blocks background
        mainFrame.add(viewerBoard);
        viewerBoard.setBounds(15, 15, 200, 200);
        viewerBoard.setBackground(new Color(222, 222, 222));
        viewerBoard.setVisible(true);
        
        // viewer panel (container)
        JPanel viewerPanel = new JPanel();
        mainFrame.add(viewerPanel);
        viewerPanel.setBounds(10, 10, 210, 210);
        viewerPanel.setBackground(new Color(111, 111, 111));
        viewerPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        viewerPanel.setVisible(true);
        
        // blocks button looks & state
        mainFrame.add(randomize);
        randomize.setFocusPainted(false);
        randomize.setRolloverEnabled(true);
        randomize.setForeground(Color.GRAY);
        randomize.setFont(new Font("Courier", Font.BOLD, 16));
        randomize.setMargin(new Insets(0, 0, 0, 0));
        randomize.setBounds(10, 230, 210, 90);
        randomize.setVisible(true);
        randomize.addActionListener(new ActionListener() {
            // calling blocks
            @Override
            public void actionPerformed(ActionEvent e) {
                viewerBoard.removeAll();
                createBlocks();
                viewerBoard.revalidate();
                viewerBoard.repaint();
                System.out.println("randomizing...");
            }
        });
    }
}
