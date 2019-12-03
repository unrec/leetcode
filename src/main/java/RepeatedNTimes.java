/*
https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
#961
 */

import java.util.HashMap;
import java.util.Map;

public class RepeatedNTimes {
    public int repeatedNTimes(int[] A) {

        Map<Integer, Integer> count = new HashMap();
        for (int x : A) {
            count.put(x, count.getOrDefault(x, 0) + 1);
        }

        for (int k : count.keySet())
            if (count.get(k) > 1)
                return k;
        throw null;
    }
}
