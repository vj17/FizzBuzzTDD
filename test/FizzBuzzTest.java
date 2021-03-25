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
            Assertions.assertEquals("Enter integers only", fizzbuzz.generateFizzBuzz(str));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " Enter integers only");
        }
    }

    @Test
    public void testFizzBuzzForEmptyString() {
        try {
            String str = " ";
            Assertions.assertEquals("Enter integers only", fizzbuzz.generateFizzBuzz(str));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " Enter integers only");
        }
    }

    @Test
    public void testFizzBuzzForStringsContainingNumbers() {
        String str = "34";
        Assertions.assertEquals("34", fizzbuzz.generateFizzBuzz(str));
    }

    @Test
    public void testFizzForPositiveDecimalMultipleOf3() {
        try {
            double num = 2.7;
            Assertions.assertEquals("Enter integers only",fizzbuzz.generateFizzBuzz(num));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " Enter integers only");
        }
    }

    @Test
    public void testFizzForNegativeDecimalMultipleOf3() {
        try {
            double num = -2.7;
            Assertions.assertEquals("Enter integers only",fizzbuzz.generateFizzBuzz(num));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " Enter integers only");
        }
    }

    @Test
    public void testFizzForPositiveDecimalMultipleOf5() {
        try {
            double num = 2.5;
            Assertions.assertEquals("Enter integers only",fizzbuzz.generateFizzBuzz(num));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " Enter integers only");
        }
    }

    @Test
    public void testFizzForNegativeDecimalMultipleOf5() {
        try {
            double num = -2.5;
            Assertions.assertEquals("Enter integers only",fizzbuzz.generateFizzBuzz(num));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " Enter integers only");
        }
    }

    @Test
    public void testFizzForPositiveDecimalMultiplesOf3And5() {
        try {
            double num = 4.5;
            Assertions.assertEquals("Enter integers only",fizzbuzz.generateFizzBuzz(num));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " Enter integers only");
        }
    }

    @Test
    public void testFizzForNegativeDecimalMultiplesOf3And5() {
        try {
            double num = -1.5;
            Assertions.assertEquals("Enter integers only",fizzbuzz.generateFizzBuzz(num));
        }
        catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " Enter integers only");
        }
    }

}