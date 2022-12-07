import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * String and list examples of AssertJ
 *
 * @author Vinod John
 * @Date 07.12.2022
 */
public class AssertJExample {

    @Test
    public void stringTest1() {
        String str = "I am a Java Developer";

        Assertions.assertThat(str)
                .contains("Java")
                .isNotEmpty();
    }
}
