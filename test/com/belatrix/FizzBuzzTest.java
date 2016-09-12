package com.belatrix;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rgamarra on 12/09/16.
 */
public class FizzBuzzTest {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void resultLengthShouldBeTheSameAsQuantity() throws Exception {
        //arrange
        int fizz = 3;
        int buzz = 5;
        int quantity = 30;

        //act
        List<String> result = this.fizzBuzz.generate(fizz, buzz, quantity);

        //assert
        boolean pass = true;
        int passValue = quantity;
        int failValue = quantity + 100;
        int expected = pass ? passValue : failValue;
        assertEquals(expected, result.size());
        System.out.println(result);
    }

    @Test
    public void shouldReturnFizzTwice() throws Exception {
        // arrange
        int fizz = 3;
        int buzz = 5;
        int quantity = 6;

        //act
        List<String> result = this.fizzBuzz.generate(fizz, buzz, quantity);

        // assert
        int resultValue = 0;
        for (int i = 0; i < result.size(); i++) {
            if(result.get(i).equals(this.fizzBuzz.FIZZ)) {
                resultValue++;
            }
        }
        boolean pass = true;
        int passValue = 2;
        int failValue = result.size();
        int expected = pass ? passValue : failValue;

        assertEquals(expected, resultValue);
        System.out.println(resultValue);
    }

    @Test
    public void shouldReturnBuzzOnce() throws Exception {
        // arrange
        int fizz = 3;
        int buzz = 5;
        int quantity = 6;

        //act
        List<String> result = this.fizzBuzz.generate(fizz, buzz, quantity);

        // assert
        int resultValue = 0;
        for (int i = 0; i < result.size(); i++) {
            if(result.get(i).equals(this.fizzBuzz.BUZZ)) {
                resultValue++;
            }
        }
        boolean pass = true;
        int passValue = 1;
        int failValue = result.size();
        int expected = pass ? passValue : failValue;

        assertEquals(expected, resultValue);
        System.out.println(resultValue);
    }

    @Test
    public void shouldReturnFizzBuzzOn15() throws Exception {
        // arrange
        int fizz = 3;
        int buzz = 5;
        int quantity = 20;
        int index = 15;

        //act
        List<String> result = this.fizzBuzz.generate(fizz, buzz, quantity);
        String resultValue = result.get(index-1);

        // assert
        boolean pass = true;
        String passValue = this.fizzBuzz.FIZZ + this.fizzBuzz.BUZZ;
        String failValue = this.fizzBuzz.BUZZ;
        String expected = pass ? passValue : failValue;

        assertEquals(expected, resultValue);
        System.out.println(resultValue);
    }
}