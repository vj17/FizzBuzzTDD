import com.package1.FizzBuzz;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    public void testFizz() {
        FizzBuzz fizzbuzz = new FizzBuzz();
        int num = 27;
        fizzbuzz.generateFizzBuzz(num);
    }
}