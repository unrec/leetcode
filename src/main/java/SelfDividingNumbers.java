/*
https://leetcode.com/problems/self-dividing-numbers
#728
*/

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        // boolean self = true;

        for (int i = left; i <= right; i++) {
            if (i % 10 == 0) continue;

            int num = i;
            do {
                int s = num % 10;
                if (s == 0 || i % s != 0) break;
                num /= 10;
            } while (num != 0);

            if (num == 0) list.add(i);
        }
        return list;
    } // end of method
} // end of class

