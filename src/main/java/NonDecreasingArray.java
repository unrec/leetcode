

import java.util.*;
import java.util.stream.Collectors;

public class NonDecreasingArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 0};
//        int[] nums = {1};

        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
        boolean isIncreasing = true;
        boolean flag = false;

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        if (list.size() == 1 || list.size() == 2) return true;

        if (list.get(0) > list.get(1)) flag = true; // check first 2 elements

        for (int i = 1; i < list.size() - 1; i++) {
            int b = list.get(i);
            int c = list.get(i + 1);

            if (b <= c) continue;       // go to the next elements

            // b > c cases:
            if (flag) {                 // check if a[i] > a[i+1] for the 2nd time
                isIncreasing = false;
                break;
            }

            if (i + 2 == list.size()) { // check if the elements at the end of array

                continue;
            }

            if (b > c) {                // check at the middle of the array
                flag = true;
                int a = list.get(i - 1);
                int d = list.get(i + 2);

                if (c <= a && d <= b) {
                    isIncreasing = false;
                    break;
                }
            }
        }
        return isIncreasing;
    } // end of method
} // end of class


//class Solution {
//    public boolean checkPossibility(int[] a) {
//        int modified = 0;
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] < a[i - 1]) {
//                if (modified++ > 0) return false;
//                if (i - 2 < 0 || a[i - 2] <= a[i]) a[i - 1] = a[i]; // lower a[i - 1]
//                else a[i] = a[i - 1]; // rise a[i]
//            }
//        }
//        return true;
//    }
//}