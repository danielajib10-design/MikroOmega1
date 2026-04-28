package Core;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private JButton jButton;

    public GamePanel() {

        jButton = new JButton("Zacit quizz");
        jButton.setSize(200, 100);
        this.add(jButton);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.fillRect(200, 100, 200, 50);
    }


}
