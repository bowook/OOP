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

            boolean validateFlag = Validate.validator(userInput);

            if(!validateFlag) {
                break;
            }

            boolean endFlag = outputView.printMessage(baseball.compare(Conversion.stringToList(userInput)));

            while(endFlag) {
                userInput = inputView.readCommandNumbers();
                int commandType = Validate.commandValidator(userInput);
                if(commandType == 1) {
                    break;
                }
                else if(commandType == 2) {
                    return;
                }
            }
        }
    }

}
