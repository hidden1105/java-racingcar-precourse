package racinggame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RaceTest {
    @Test
    void 경기_생성() {
        CarName carName = new CarName("pobi,crong,honux");
        Race race = new Race(Race.generateCars(carName), new RaceCount("5"));
        assertEquals(3, race.getCars().size());
    }
}
