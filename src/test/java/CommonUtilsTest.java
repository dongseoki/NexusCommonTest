import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonUtilsTest {
    @Test
    void test() {
        // given
        String expected = "test";

        // when
        String actual = "test";

        // then
        assertEquals(expected, actual);
    }

    @Test
    void CommonUtils_allAdd() {
        // given
        int expected = 10;

        // when
        int actual = CommonUtils.allAdd(1, 2, 3, 4);

        // then
        assertEquals(expected, actual);
    }

    @Test
    void CommonUtils_allMultiply() {
        // given
        int expected = 24;

        // when
        int actual = CommonUtils.allMultiply(1, 2, 3, 4);

        // then
        assertEquals(expected, actual);
    }
}