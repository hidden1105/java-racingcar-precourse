package racinggame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNameTest {

    @Test
    void 이름_입력_받기() {
        String input = "pobi,crong,honux";
        CarName carName = new CarName(input);
        assertEquals(input, carName.getNames());
    }

    @Test
    void 빈문자열_입력시_에러() {
        assertThrows(IllegalArgumentException.class, () -> new CarName(""));
    }

    @Test
    void 이름_5자_초과_입력시_에러() {
        String input = "12345,123456";
        assertThrows(IllegalArgumentException.class, () -> new CarName(input));
    }
}
