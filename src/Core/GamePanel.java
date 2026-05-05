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

        //nadpis
        title = new JLabel("Quiz App", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 28));
        title.setBackground(Color.BLUE);
        add(title, BorderLayout.NORTH);



        // pocet talcitek, pocet rad a vzdalenost mezi nima
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 100, 100));


        // velikost tlacitek
        buttonPanel.setBorder(new EmptyBorder(100, 150, 100, 150));

        // tlacitko na spusteni quizzu
        startButton = new JButton("Spustit kvíz");
        startButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Kvíz bude spuštěn..."));
        startButton.setBackground(Color.GREEN);

        //tlacitko na konec
        exitButton = new JButton("Ukončit");
        exitButton.addActionListener(e -> System.exit(0));
        exitButton.setBackground(Color.GREEN);

        buttonPanel.add(startButton);
        buttonPanel.add(exitButton);

        buttonPanel.setBackground(Color.BLUE);

        add(buttonPanel, BorderLayout.CENTER);
    }

    //metoda na kresleni do okna
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}
