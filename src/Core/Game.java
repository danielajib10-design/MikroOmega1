package Core;

/**
 * Top-level class that initializes the application.
 * Creates a GamePanel and a GameFrame to start the UI.
 */
public class Game {

    private GameFrame gameFrame;
    private GamePanel gamePanel;

    /**
     * Starts the application by initializing the game panel and the main window.
     */
    public Game() {
        gamePanel = new GamePanel();
        gameFrame = new GameFrame(gamePanel);

    }
}
