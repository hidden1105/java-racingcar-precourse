package racinggame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNameTest {

    @Test
    void 이름_입력_받기() {
        String input = "pobi,crong,honux";
        CarName carName = new CarName(input);
        assertThat(carName.getNames()).containsExactly( "pobi", "crong", "honux");
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
