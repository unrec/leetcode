/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array
#26
*/

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        int counter = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                nums[counter++] = nums[i];
            }
        }

        if (counter == 0) return 1;
        if (nums[nums.length - 1] > nums[counter - 1])
            nums[counter++] = nums[nums.length - 1];

        return counter;
    } // end of method
} // end of class
