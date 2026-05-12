package Quiz;

import javax.swing.*;

public class QuizFrame {

    private JFrame jFrame;

    public QuizFrame() {

        jFrame = new JFrame("Quiz");
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.add(new QuizPanel());
        jFrame.setVisible(true);
    }
}
