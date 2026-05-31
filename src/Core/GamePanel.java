package Core;


import Quiz.QuizFrame;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
/**
 * The main panel of the application, showing the home screen.
 * Contains a title, a button to start the quiz, and a button to exit the application.
 */
public class GamePanel extends JPanel {

    private JLabel title;
    private JButton startButton;
    private JButton exitButton;
    /**
     * Sets up the layout, title label,
     * and both buttons with their action listeners.
     */
    public GamePanel() {
        setLayout(new BorderLayout());
        setBackground(new Color(50, 50, 80));

        title = new JLabel("Quiz App", SwingConstants.CENTER);
        title.setFont(new Font(" ", Font.PLAIN, 32));
        title.setForeground(Color.WHITE);
        title.setBorder(new EmptyBorder(30, 0, 0, 0));
        add(title, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 0, 15));

        buttonPanel.setBorder(new EmptyBorder(80, 130, 80, 130));


        startButton = new JButton("Spustit kvíz");
        startButton.setFont(new Font(" ", Font.PLAIN, 16));
        //startButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Kvíz bude spuštěn..."));
        startButton.addActionListener(e -> new QuizFrame());
        startButton.setBackground(Color.GREEN);
        startButton.setForeground(Color.BLACK);

        exitButton = new JButton("Ukončit");
        exitButton.setFont(new Font(" ", Font.PLAIN, 16));
        exitButton.addActionListener(e -> System.exit(0));
        exitButton.setBackground(Color.RED);

        buttonPanel.add(startButton);
        buttonPanel.add(exitButton);

        buttonPanel.setBackground(Color.BLUE);

        buttonPanel.setOpaque(false);

        add(buttonPanel, BorderLayout.CENTER);


        startButton.setFocusPainted(false);
        exitButton.setFocusPainted(false);
    }

    /**
     * Paints the panel contents.
     * Calls the parent implementation to correctly render the background.
     *
     * @param g the graphics context used for drawing
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}
