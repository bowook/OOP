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
    }
    public void run() {
        outputView.startMessage();
        baseball.computerNumbersGenerator();
    }

}
