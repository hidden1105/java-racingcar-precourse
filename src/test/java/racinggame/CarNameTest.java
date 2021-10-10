package racinggame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarNameTest {

    @Test
    void 자동차_이름_입력_받기() {
        String input = "pobi,crong,honux";
        CarName carName = new CarName(input);
        assertEquals(input, carName.getNames());
    }

    @Test
    void 자동차_빈문자열_입력시_에러() {
        assertThrows(IllegalArgumentException.class, () -> new CarName(""));
    }
}
