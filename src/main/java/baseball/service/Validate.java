package baseball.service;

import java.util.HashSet;
import java.util.Set;

public class Validate {

    public static boolean validator(String userInput) {
        if (userInput == null || userInput.isBlank()) {
            throw new IllegalArgumentException("중복되지 않는 3자리의 수를 입력해주세요.");
        }
        if (userInput.length() != 3) {
            throw new IllegalArgumentException("3자리의 수를 입력해주세요.");
        }
        if (!userInput.matches("\\d+")) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }
        if (!hasUniqueDigits(userInput)) {
            throw new IllegalArgumentException("숫자만 입력해주세요.");
        }

        return true; // 모든 검증을 통과하면 true 반환
    }


    public static int commandValidator(String userCommandInput) {
        if(!(userCommandInput.equals("1") || userCommandInput.equals("2"))) {
            throw new IllegalArgumentException("1또는 2를 입력해주세요.");
        }
        else if (userCommandInput.equals("1")) {
            return 1;
        }
        else {
            return 2;
        }
    }

    private static boolean hasUniqueDigits(String userInput) {
        Set<Character> digitSet = new HashSet<>();
        for (char c : userInput.toCharArray()) {
            if (!digitSet.add(c)) {
                return false;
            }
        }
        return true;
    }
}
