package racinggame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RaceCountTest {
    @Test
    void 경주_횟수_입력() {
        String input = "5";
        RaceCount raceCount = new RaceCount(input);
        assertEquals(Integer.parseInt(input), raceCount.getGameCount());
    }

    @Test
    void 정수_아닌경우_입력시_에러() {
        String input = "abc";
        assertThrows(NumberFormatException.class, () -> new RaceCount(input));
    }
}
