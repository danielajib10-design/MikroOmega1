package Quiz;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class QuizPanel extends JPanel {

    private final QuizLogic quizLogic;
    private final JLabel questionCounter;
    private final JLabel questionLabel;
    private final JButton[] answerButtons;

    public QuizPanel() {
        this.quizLogic = new QuizLogic();

        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(20, 20, 20, 20));
        setBackground(new Color(151, 141, 141, 255));

        questionCounter = new JLabel("", SwingConstants.CENTER);
        questionCounter.setFont(new Font("SansSerif", Font.BOLD, 16));
        questionCounter.setForeground(Color.WHITE);
        add(questionCounter, BorderLayout.NORTH);

        questionLabel = new JLabel("", SwingConstants.CENTER);
        questionLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        questionLabel.setForeground(Color.WHITE);
        add(questionLabel, BorderLayout.CENTER);

        JPanel answersPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        answersPanel.setOpaque(false);

        answerButtons = new JButton[4];
    }
}