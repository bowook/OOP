package baseball.domain;

import baseball.service.BaseballNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class Baseball {
    private List<Integer> computerBaseballNumbers;

    public Baseball() {
        this.computerBaseballNumbers = new ArrayList<>();
    }

    public void computerNumbersGenerator() {
        computerBaseballNumbers = BaseballNumberGenerator.generator();
    }
}
