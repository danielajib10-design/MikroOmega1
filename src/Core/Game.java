package Core;


public class Game {

    private GameFrame gameFrame;
    private GamePanel gamePanel;


    public Game() {
        gamePanel = new GamePanel();
        gameFrame = new GameFrame(gamePanel);

    }


}
