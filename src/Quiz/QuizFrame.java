package Quiz;

import javax.swing.*;
/**
 * JFrame that displays the quiz panel.
 */
public class QuizFrame {

    private JFrame jFrame;
    /**
     * Creates and displays the quiz window with default size and position settings.
     */
    public QuizFrame() {

        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jFrame.add(new QuizPanel());
        jFrame.setVisible(true);
    }
}
