package baseball.controller;

import baseball.domain.Baseball;
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
    }

    public void play() {
        String userInput = inputView.readBaseballNumbers();
    }

    public void reset() {

    }

}
