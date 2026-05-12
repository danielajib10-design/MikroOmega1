package Core;


import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class GamePanel extends JPanel {

    private JLabel title;
    private JButton startButton;
    private JButton exitButton;

    public GamePanel() {
        setLayout(new BorderLayout());
        setBackground(Color.BLUE);


        // nadpis
        title = new JLabel("Quiz App", SwingConstants.CENTER);
        title.setFont(new Font(" ", Font.PLAIN, 32));
        title.setForeground(Color.WHITE);
        title.setBorder(new EmptyBorder(30, 0, 0, 0));
        add(title, BorderLayout.NORTH);

        // pocet talcitek, pocet rad a vzdalenost mezi nima
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 0, 15));

        // velikost tlacitek
        buttonPanel.setBorder(new EmptyBorder(80, 130, 80, 130));


        // tlacitko na spusteni quizzu
        startButton = new JButton("Spustit kvíz");
        startButton.setFont(new Font(" ", Font.PLAIN, 16));
        startButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Kvíz bude spuštěn..."));
        startButton.setBackground(Color.GREEN);
        startButton.setForeground(Color.BLACK);

        //tlacitko na konec
        exitButton = new JButton("Ukončit");
        exitButton.setFont(new Font(" ", Font.PLAIN, 16));
        exitButton.addActionListener(e -> System.exit(0));
        exitButton.setBackground(Color.RED);

        buttonPanel.add(startButton);
        buttonPanel.add(exitButton);

        buttonPanel.setBackground(Color.BLUE);

        buttonPanel.setOpaque(false);

        add(buttonPanel, BorderLayout.CENTER);

        //odstraneni obdelniku kolem textu
        startButton.setFocusPainted(false);
        exitButton.setFocusPainted(false);
    }

    //metoda na kresleni do okna
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}
