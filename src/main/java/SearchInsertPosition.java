/*
https://leetcode.com/problems/search-insert-position/
#35
*/

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        if (target <= nums[0]) return 0;
        if (target > nums[size - 1]) return size;

        for (int i = 1; i < nums.length; i++) {
            if (target <= nums[i]) return i;
        }

        return 0;
    } // end of method
} // end of class
