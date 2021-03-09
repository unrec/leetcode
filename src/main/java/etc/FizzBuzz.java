/*
https://leetcode.com/problems/fizz-buzz
#412
*/

package etc;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output.add("etc.FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                output.add("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                output.add("Buzz");
                continue;
            }
            output.add(Integer.toString(i));
        }
        return output;
    }
}
