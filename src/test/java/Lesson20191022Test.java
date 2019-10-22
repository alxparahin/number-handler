import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lesson20191022Test {

    @BeforeEach
    void setUp() {
        System.out.println("before test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("after test");
    }

    @Test
    void zeroStrings() {
        assertEquals(1+2+3+4+5,Lesson20191022.zeroStrings(5));
    }

    @Test
    void englishByNumber() {
        assertEquals(26,Lesson20191022.englishByNumber(5));
    }
}