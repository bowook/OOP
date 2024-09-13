package baseball.controller;

import baseball.domain.Baseball;
import baseball.service.Conversion;
import baseball.service.Validate;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballController {
    private final Baseball baseball;
    private final InputView inputView;
    private final OutputView outputView;

    public BaseballController() {
        this.baseball = new Baseball();
        this.inputView = new InputView();
        this.outputView = new OutputView();
        outputView.startMessage();
    }
    public void run() {
        baseball.computerNumbersGenerator();
        play();
    }

    public void play() {
        while (true) {
            String userInput = inputView.readBaseballNumbers();

            boolean validateFlag;

            try {
                validateFlag = Validate.validator(userInput);
            } catch (IllegalArgumentException e) {
                // 예외가 발생하면 메시지를 출력하고 루프를 계속합니다.
                validateFlag = false;
            }
            if(!validateFlag) {
                break;
            }

            boolean endFlag = outputView.printMessage(baseball.compare(Conversion.stringToList(userInput)));

            while(endFlag) {
                outputView.endMessage();
                userInput = inputView.readCommandNumbers();
                int commandType = Validate.commandValidator(userInput);
                if(commandType == 1) {
                    run();
                    return;
                }
                else if(commandType == 2) {
                    return;
                }
            }
        }
    }

}
