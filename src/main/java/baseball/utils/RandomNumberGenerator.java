package baseball.utils;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RandomNumberGenerator {

    private static final int MAX_NUMBER_LENGTH = 3;

    public static List<Integer> generate() {
        Set<Integer> randomNumber = new HashSet<>();
        while (randomNumber.size() < MAX_NUMBER_LENGTH) {
            randomNumber.add(Randoms.pickNumberInRange(1, 9));
        }
        return new LinkedList<>(randomNumber);
    }
}
