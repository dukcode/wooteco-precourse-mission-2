package racingcar;

public class Application {
    public static void main(String[] args) {
        RacingCarGame game = new RacingCarGame(new RacingGameConsoleView());
        game.play();
    }
}
