package Core;

import javax.swing.*;

public class GameFrame {

    private JFrame jFrame;
    private JButton jButton;

    public GameFrame(GamePanel gamePanel) {

        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLocation(500, 200);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(gamePanel);
        jFrame.setVisible(true);
    }






}
