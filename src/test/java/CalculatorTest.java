import org.example.Calculator;
import org.junit.jupiter.api.*;

/**
 * Unit tests for Calculator
 *
 * @author Vinod John
 * @Date 07.12.2022
 */
public class CalculatorTest {
    Calculator calculator;

    @BeforeAll // Executed before all the methods in this class
    public static void globalSetup() {
        System.out.println("Inside Before All..");
    }

    @AfterAll // Executed after all the methods in this class
    public static void finishTests(){
        System.out.println("Tests execution completed!");
    }

    @BeforeEach // Executed before every Test case
    public void setup() {
        System.out.println("Starting test...");
        calculator = new Calculator();
    }

    @AfterEach // Executed after every Test case
    public void finishTest() {
        System.out.println("Test execution done!");
    }

    @DisplayName("Add Two Numbers Test")
    @Test
    public void whenAddTwoNumbersCalled_shouldReturnValue(){
        float result = calculator.addTwoNumbers(3, 9);
        float result2 = calculator.addTwoNumbers(2.5f, 4.23f);

        Assertions.assertAll(
                () -> Assertions.assertEquals(12, result),
                () -> Assertions.assertEquals(6.73, result2)
        );
    }

    @Disabled
    @Test
    public void whenMultiplyTwoNumbersCalled_shouldReturnValue() {
        float result = calculator.multiplyTwoNumbers(3, 4);

        Assertions.assertTrue(result == 12);
    }
}
