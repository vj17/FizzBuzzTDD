import com.package1.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class FizzBuzzTest {

    @Test
    public void testFizzForPositiveMultipleOf3() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int num = 27;
        Assertions.assertEquals("Fizz",fizzbuzz.generateFizzBuzz(num));
    }
}