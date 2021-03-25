package com.package1;

public class FizzBuzz {
    public String generateFizzBuzz(int num) {

        if(num % 3 == 0 && num % 5 == 0)
            return "FizzBuzz";

        if (num % 3 == 0)
            return "Fizz";

        return "Buzz";
    }
}
