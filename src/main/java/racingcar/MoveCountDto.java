package racingcar;

public class MoveCountDto {

    int moveCount;

    public MoveCountDto(String moveCount) {
        try {
            this.moveCount = Integer.parseInt(moveCount);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }
}
