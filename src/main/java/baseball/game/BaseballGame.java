package baseball.game;

import baseball.player.Player;
import baseball.referee.CompareResult;
import baseball.referee.Referee;
import baseball.referee.RefereeResult;
import baseball.utils.RandomNumberGenerator;
import baseball.validator.BallNumberValidator;
import baseball.validator.RestartNumberValidator;
import baseball.validator.Validator;
import baseball.view.BallNumbersInput;
import baseball.view.GameRestartInput;
import baseball.view.ResultOutput;

import java.util.List;

public class BaseballGame implements Game {

    private boolean isRunning;
    private Validator ballNumberValidator;
    private Validator restartNumberValidator;
    private Referee referee;
    private List<Integer> randomBallNumbers;
    private Player opponent;
    private Player user;

    public BaseballGame(Player opponent, Player user) {
        this.opponent = opponent;
        this.user = user;
    }

    @Override
    public void start() {
        String inputNumber = BallNumbersInput.input();
        ballNumberValidator.valid(inputNumber);
        RefereeResult refereeResult = referee.compareTwoBalls(user.createBall(inputNumber), opponent.createBall(randomBallNumbers));
        ResultOutput.output(refereeResult.getHint());
        isRunning = refereeResult.getCompareResult() == CompareResult.ANSWER;
    }

    @Override
    public boolean finish() {
        ResultOutput.output(BaseballGameConstant.answer);
        String inputRestart = GameRestartInput.input();
        restartNumberValidator.valid(inputRestart);
        return inputRestart.equals(BaseballGameConstant.restartFlag);
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }

    public void init() {
        this.isRunning = false;
        this.referee = new Referee();
        this.ballNumberValidator = new BallNumberValidator();
        this.restartNumberValidator = new RestartNumberValidator();
        this.randomBallNumbers = RandomNumberGenerator.generate();
    }
}
