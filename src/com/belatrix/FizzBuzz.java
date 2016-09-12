package com.belatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by rgamarra on 12/09/16.
 */
public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ= "Buzz";

    public List<String> generate(int fizz, int buzz, int quantity){
        ArrayList<String> result = new ArrayList<>();
        String element;
        String string;

        for (Integer i = 1; i <= quantity; i++) {
            string = "";

            if (i % fizz == 0) {
                string += this.FIZZ;
            }

            if (i % buzz == 0) {
                string += this.BUZZ;
            }

            if (string == "") {
                element = i.toString();
            } else {
                element = string;
            }

            result.add(element);

        }
        return result;
    }
}
