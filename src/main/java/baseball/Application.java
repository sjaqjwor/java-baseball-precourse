package baseball;

import baseball.game.BaseballGame;
import baseball.game.GameManager;
import baseball.player.Opponent;
import baseball.player.Player;
import baseball.player.User;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Player<List<Integer>> opponent = new Opponent();
        Player<String> user = new User();
        BaseballGame baseballGame = new BaseballGame(opponent,user);
        GameManager gameManager = new GameManager(baseballGame);
        gameManager.run();

    }
}
