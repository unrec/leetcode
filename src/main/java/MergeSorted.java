

import java.util.*;

public class MergeSorted {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
//        MergeSorted sol = new MergeSorted();
//        int[] out = sol.merge(nums1, 3, nums2, 3);
//        System.out.println(Arrays.toString(out));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (i >= 0 && j >= 0) {
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    /* to new array using merge sorting */
//    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] c = new int[m + n];
//        int i = 0, j = 0, k = 0;
//
//        while (i < m && j < n) {
//            int a = nums1[i];
//            int b = nums2[j];
//
//            if (a < b) {
//                c[k++] = nums1[i++];
//                continue;
//            }
//            if (a == b) {
//                c[k++] = nums1[i++];
//                c[k++] = nums2[j++];
//                continue;
//            }
//            if (a > b) c[k++] = nums2[j++];
//        }
//
//        while (i < m) {
//            c[k++] = nums1[i++];
//        }
//        while (j < n) {
//            c[k++] = nums2[j++];
//        }
//        return c;
//} // end of method
}// end of class
