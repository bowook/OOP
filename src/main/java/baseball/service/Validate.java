package baseball.service;

import java.util.HashSet;
import java.util.Set;

public class Validate {

    public boolean validator(String userInput) {
        try {
            if(userInput.isBlank()) {
                throw new IllegalArgumentException("중복되지 않는 3자리의 수를 입력해주세요.");
            }
            else if(userInput.length() != 3) {
                throw new IllegalArgumentException("3자리의 수를 입력해주세요.");
            }
            else if (!userInput.matches("\\d+")) {
                throw new IllegalArgumentException("숫자만 입력해주세요.");
            }
            else if (!hasUniqueDigits(userInput)) {
                throw new IllegalArgumentException("중복되지 않는 숫자를 입력해주세요.");
            }
            return true;
        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    private boolean hasUniqueDigits(String userInput) {
        Set<Character> digitSet = new HashSet<>();
        for (char c : userInput.toCharArray()) {
            if (!digitSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}