package com.package1;

public class FizzBuzz {
    public String generateFizzBuzz(Object o){

        int num = (Integer.parseInt(o.toString()));

        if (num % 3 == 0 && num % 5 == 0)
            return "FizzBuzz";

        else if (num % 3 == 0)
            return "Fizz";

        else if (num % 5 == 0)
            return "Buzz";

        return "" + num;
    }
}
