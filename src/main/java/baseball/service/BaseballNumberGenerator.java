package baseball.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseballNumberGenerator {

    public static List<Integer> generator() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        while(numbers.size() != 3) {
            int number = random.nextInt();
            if(!numbers.contains(number)) {
                numbers.add(number);
            }
        }

        return numbers;
    }
}
