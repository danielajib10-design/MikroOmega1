package End;

import javax.swing.*;

public class EndingFrame {

    private JFrame jFrame;

    public EndingFrame(int correct, int total) {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(new EndingPanel(correct, total));
        jFrame.setVisible(true);
    }
}
