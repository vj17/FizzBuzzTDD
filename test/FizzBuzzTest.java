import com.package1.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class FizzBuzzTest {

    FizzBuzz fizzbuzz = new FizzBuzz();

    @Test
    public void testFizzForPositiveMultipleOf3() {
        int num = 27;
        Assertions.assertEquals("Fizz",fizzbuzz.generateFizzBuzz(num));
    }

    @Test
    public void testBuzzForPositiveMultipleOf5() {
        int num = 25;
        Assertions.assertEquals("Buzz", fizzbuzz.generateFizzBuzz(num));
    }
}