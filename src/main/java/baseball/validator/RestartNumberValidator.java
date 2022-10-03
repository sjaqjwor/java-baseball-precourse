package baseball.validator;

public class RestartNumberValidator implements Validator {

    private static final String RESTART_NUMBER_REGEX = "[1-2]{1}";

    @Override
    public void valid(String inputNumber) {
        if (!inputNumber.matches(RESTART_NUMBER_REGEX)) {
            throw new IllegalArgumentException();
        }
    }
}
