package baseball.validator;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BallNumberValidator implements Validator {

    private static final int MAX_NUMBER_LENGTH = 3;
    private static final String NUMBER_REGEX = "[1-9]+";

    @Override
    public void valid(String inputNumber) {
        checkNumberLength(inputNumber);
        checkNumberRegex(inputNumber);
        checkDuplicate(inputNumber);
    }

    private void checkNumberLength(String inputNumber) {
        if (inputNumber.length() != MAX_NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    private void checkNumberRegex(String inputNumber) {
        if (!inputNumber.matches(NUMBER_REGEX)) {
            throw new IllegalArgumentException();
        }
    }

    private void checkDuplicate(String inputNumber) {
        String[] inputNumbers = inputNumber.split("");
        Set<String> numberCheckers = new HashSet<>();
        Collections.addAll(numberCheckers, inputNumbers);
        if (numberCheckers.size() < MAX_NUMBER_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

}
