package baseball.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputView {

    public String readBaseballNumbers() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자를 입력해주세요 : ");
        String input = "";
        try {
            input = br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return input;
    }

    public String readCommandNumbers() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String input = "";
        try {
            input = br.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return input;
    }
}
