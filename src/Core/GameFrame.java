package Core;

import javax.swing.*;
/**
 * The main application window JFrame.
 */
public class GameFrame {

    private JFrame jFrame;
    /**
     * Creates and displays the main application window with the given game panel.
     * @param gamePanel the panel to be added to the window
     */
    public GameFrame(GamePanel gamePanel) {

        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setVisible(true);
    }
}
