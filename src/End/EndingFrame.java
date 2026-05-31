package End;

import javax.swing.*;
/**
 * JFrame that displays the results panel after the quiz is completed.
 * */
public class EndingFrame {

    private JFrame jFrame;
    /**
     * Creates and displays the results window.
     *
     * @param correct the number of correctly answered questions
     * @param total   the total number of questions in the quiz
     */
    public EndingFrame(int correct, int total) {
        jFrame = new JFrame();
        jFrame.setSize(500, 500);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(new EndingPanel(correct, total));
        jFrame.setVisible(true);
    }
}
