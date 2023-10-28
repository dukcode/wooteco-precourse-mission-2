package racingcar;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RacingCarTest {

    @Test
    public void RacingCar는_actionNumber가_4_이상이면_움직인다() throws Exception {
        // given
        int actionNumber = 4;
        int initialPosition = 4;
        RacingCar car = new RacingCar(new Name("test"), new Position(4));

        // when
        car.move(actionNumber);

        //then
        assertThat(car.getPosition().getPosition()).isEqualTo(initialPosition + 1);
    }

    @Test
    public void RacingCar는_actionNumber가_4_미만이면_움직이지_않는다() throws Exception {
        // given
        int actionNumber = 3;
        int initialPosition = 4;
        RacingCar car = new RacingCar(new Name("test"), new Position(4));

        // when
        car.move(actionNumber);

        //then
        assertThat(car.getPosition().getPosition()).isEqualTo(initialPosition);
    }

}