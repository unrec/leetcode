/*
https://leetcode.com/problems/max-consecutive-ones
#485
 */

package array;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0) return 0;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentSequence = 0;
            while (i < nums.length && nums[i] == 1) {
                currentSequence++;
                i++;
            }
            result = Math.max(result, currentSequence);
        }
        return result;
    }
}