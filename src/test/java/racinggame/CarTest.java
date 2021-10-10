package racinggame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    void 자동차_이동() {
        Car car = new Car("jung");
        car.move(new MoveNumber(4));
        assertEquals(1, car.getPosition());
        car.move(new MoveNumber(5));
        assertEquals(2, car.getPosition());
    }

    @Test
    void 자동차_멈춤() {
        Car car = new Car("jung");
        car.move(new MoveNumber(3));
        assertEquals(0, car.getPosition());
        car.move(new MoveNumber(2));
        assertEquals(0, car.getPosition());
    }
}
