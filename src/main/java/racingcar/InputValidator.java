package racingcar;

import static racingcar.MessageBox.NAME_EMPTY_EXCEPTION_MESSAGE;
import static racingcar.MessageBox.NUMBER_FORMAT_EXCEPTION_MESSAGE;

public class InputValidator {

    private InputValidator(){}

    public static void validateCarNames(final String[] carNames) {
        for (String carName : carNames) {
            if (carName.equals("")) {
                throw new IllegalArgumentException(NAME_EMPTY_EXCEPTION_MESSAGE);
            }
        }
    }

    public static void validateAttemptNum(final String attemptNum) {
        try {
            Integer.parseInt(attemptNum);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(NUMBER_FORMAT_EXCEPTION_MESSAGE);
        }
    }
}
