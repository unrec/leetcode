/*
https://leetcode.com/problems/squares-of-a-sorted-array
#50
*/

import java.util.*;

public class SquaresSortedArray {
    public int[] sortedSquares(int[] A) {
        int[] output = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            output[i] = A[i] * A[i];
        }
        Arrays.sort(output);
        return output;
    }
}

// slow implementation using collections
// class Solution {
//     public int[] sortedSquares(int[] A) {
//         List<Integer> in = new ArrayList<>();
//         in = Arrays.stream(A).boxed().collect(Collectors.toList());
//         List<Integer> out = new ArrayList<>(A.length);
//         int[] output;

//         for (Integer number : in) {
//             out.add(number*number);
//         }

//         Collections.sort(out);

//         output = out.stream().mapToInt(i -> i).toArray();
//         return output;
//     }
// }
