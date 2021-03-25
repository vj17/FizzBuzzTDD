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

    @Test
    public void testFizzBuzzForPositiveMultiplesOf3And5() {
        int num = 45;
        Assertions.assertEquals("FizzBuzz", fizzbuzz.generateFizzBuzz(num));
    }

    @Test
    public void testFizzBuzzFor0() {
        int num = 0;
        Assertions.assertEquals("FizzBuzz", fizzbuzz.generateFizzBuzz(num));
    }

    @Test
    public void testFizzForNegativeMultipleOf3() {
        int num = -3;
        Assertions.assertEquals("Fizz",fizzbuzz.generateFizzBuzz(num));
    }

    @Test
    public void testBuzzForNegativeMultipleOf5() {
        int num = -10;
        Assertions.assertEquals("Buzz",fizzbuzz.generateFizzBuzz(num));
    }

    @Test
    public void testFizzBuzzForNegativeMultiplesOf3And5() {
        int num = -15;
        Assertions.assertEquals("FizzBuzz", fizzbuzz.generateFizzBuzz(num));
    }

    @Test
    public void testFizzBuzzForNumbersThatAreNotMultiplesOf3And5() {
        int num = 4;
        Assertions.assertEquals("4", fizzbuzz.generateFizzBuzz(num));
    }

    @Test
    public void testFizzBuzzForStringsContainingAlphabets() {
        try {
            String str = "abcd";
            Assertions.assertEquals("Enter numbers only", fizzbuzz.generateFizzBuzz(str));
        }
        catch (NumberFormatException e) {
            System.out.println("Enter numbers only");
        }
    }

    @Test
    public void testFizzBuzzForStringsContainingNumbers() {
        String str = "34";
        Assertions.assertEquals("34", fizzbuzz.generateFizzBuzz(str));
    }
}