import org.junit.Test;
import static org.junit.Assert.*;

public class SnakeGameTest {

    @Test
    public void testCheckCollision() {
        SnakeGame game = new SnakeGame();
        game.initGame();
        game.inGame = true;
        game.x[0] = 0;
        game.y[0] = 0;
        game.leftDirection = true;
        game.checkCollision();
        assertFalse(game.inGame);

        game.inGame = true;
        game.x[0] = 300;
        game.y[0] = 300;
        game.rightDirection = true;
        game.checkCollision();
        assertFalse(game.inGame);

        game.inGame = true;
        game.x[0] = 150;
        game.y[0] = 300;
        game.upDirection = true;
        game.checkCollision();
        assertFalse(game.inGame);

        game.inGame = true;
        game.x[0] = 150;
        game.y[0] = 0;
        game.downDirection = true;
        game.checkCollision();
        assertFalse(game.inGame);
    }
}

