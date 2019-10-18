import static org.junit.jupiter.api.Assertions.*;

class MainTest {

/*
    Main main;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        main = new Main();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        main = null;
    }
*/

/*
    @org.junit.jupiter.api.Test
    void main() {
    }
*/

    @org.junit.jupiter.api.Test
    void getMathMiddle() {
        double[] numbers = new double[]{2d,2d,5d};
        assertEquals(3d, Main.getMathMiddle(numbers));
    }

/*    @org.junit.jupiter.api.Test
    void getPrimeNumbers() {
    }

    @org.junit.jupiter.api.Test
    void existsNumberArgument() {
    }
*/
}