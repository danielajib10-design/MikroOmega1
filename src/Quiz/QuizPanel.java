package Quiz;

import End.EndingFrame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * Panel that displays the quiz in progress.
 * Contains the question text, a question counter and four answer buttons.
 */
public class QuizPanel extends JPanel {

    private final QuizLogic quizLogic;
    private final JLabel questionCounter;
    private final JLabel questionLabel;
    private final JButton[] answerButtons;
    /**
     * Initializes the quiz panel – builds all UI components and displays the first question.
     */
    public QuizPanel() {
        this.quizLogic = new QuizLogic();

        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(20, 20, 20, 20));
        setBackground(new Color(50, 50, 80));

        questionCounter = new JLabel("", SwingConstants.CENTER);
        questionCounter.setFont(new Font(" ", Font.BOLD, 16));
        questionCounter.setForeground(Color.WHITE);
        add(questionCounter, BorderLayout.NORTH);

        questionLabel = new JLabel("", SwingConstants.CENTER);
        questionLabel.setFont(new Font(" ", Font.BOLD, 20));
        questionLabel.setForeground(Color.WHITE);
        add(questionLabel, BorderLayout.CENTER);

        JPanel answersPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        answersPanel.setOpaque(false);

        answerButtons = new JButton[4];

        for (int i = 0; i < 4; i++) {
            final int index = i;
            answerButtons[i] = new JButton();
            answerButtons[i].setFont(new Font(" ", Font.BOLD, 14));
            answerButtons[i].setBackground(new Color(70, 130, 180));
            answerButtons[i].setForeground(Color.WHITE);
            answerButtons[i].setFocusPainted(false);
            answerButtons[i].setBorderPainted(false);
            answerButtons[i].addActionListener(e -> handleAnswer(index));
            answersPanel.add(answerButtons[i]);
        }

        add(answersPanel, BorderLayout.SOUTH);


        displayQuestion();
    }
    /**
     * Displays the current question and its answers in the UI.
     * Updates the question counter label, question text, and answer button labels.
     */
    private void displayQuestion() {
        Question q = quizLogic.getActualQuestion();
        if (q == null) return;

        questionCounter.setText("Otázka " + quizLogic.getNumberOfQuestion() + " / " + quizLogic.getTotal());
        questionLabel.setText(q.getQuestion());

        String[] answers = q.getAnswers();
        for (int i = 0; i < 4; i++) {
            answerButtons[i].setText(answers[i]);
            answerButtons[i].setEnabled(true);
        }
    }
    /**
     * Handles the user clicking an answer button.
     * Passes the answer to the quiz logic.
     * @param index the index of the chosen answer (0–3)
     */
    private void handleAnswer(int index) {

        quizLogic.answer(index);

        if (quizLogic.end()) {
            SwingUtilities.getWindowAncestor(this).dispose();
            new EndingFrame(quizLogic.getNumberOfCorrect(), quizLogic.getTotal());
        } else {

            displayQuestion();
        }
    }
}

