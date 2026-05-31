package End;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class EndingPanel extends JPanel {

    public EndingPanel(int correct, int total) {
        setLayout(new BorderLayout());
        setBackground(new Color(50, 50, 80));


        JLabel title = new JLabel("Výsledek", SwingConstants.CENTER);
        title.setFont(new Font(" ", Font.BOLD, 32));
        title.setForeground(Color.WHITE);
        title.setBorder(new EmptyBorder(40, 0, 0, 0));
        add(title, BorderLayout.NORTH);


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setOpaque(false);
        centerPanel.setBorder(new EmptyBorder(60, 0, 0, 0));


        JLabel scoreLabel = new JLabel(correct + " / " + total, SwingConstants.CENTER);
        scoreLabel.setFont(new Font(" ", Font.BOLD, 48));
        scoreLabel.setForeground(Color.WHITE);
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        centerPanel.add(scoreLabel);
        add(centerPanel, BorderLayout.CENTER);


        JButton exitButton = new JButton("Ukončit");
        exitButton.setBackground(Color.RED);
        exitButton.setForeground(Color.WHITE);
        exitButton.setFont(new Font(" ", Font.BOLD, 14));
        exitButton.setFocusPainted(false);
        exitButton.setBorderPainted(false);
        exitButton.addActionListener(e -> System.exit(0));

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.setBackground(new Color(50, 50, 80));
        bottomPanel.setBorder(new EmptyBorder(0, 0, 15, 15));
        bottomPanel.add(exitButton);
        add(bottomPanel, BorderLayout.SOUTH);
    }
}