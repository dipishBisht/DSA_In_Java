package Day_7;

import java.util.Arrays;

public class Practice_1 {

    public static void main(String[] args) {

        /*
         * int[] nums1 = { 1, 2, 3, 0, 0, 0 };
         * int m = 3, n = 3;
         * int[] nums2 = { 2, 5, 6 };
         *
         * mergeSortedArrays(nums1, nums2, m, n);
         * for (int i : nums1) {
         * System.out.println(i);
         */

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int profit=maxProfit(prices);
        System.out.println(profit);

    }

    // + Function to merge sorted array in non-decending order
    // + Here we are using a extra space
    public static void mergeSortedArrays(int[] nums1, int[] nums2, int m, int n) {

        int[] nums1Copy = Arrays.copyOf(nums1, m);
        int p1 = 0, p2 = 0;

        for (int i = 0; i < m + n; i++) {
            if (p2 >= n || (p1 < m && nums1Copy[p1] <= nums2[p2])) {
                nums1[i] = nums1Copy[p1++];
            } else {
                nums1[i] = nums2[p2++];
            }
        }

        /*
         * In this, we are using loop from 0 -> m + n, and for extra space we have
         * created
         * an array of nums[m] size.
         * 
         * So,
         * 
         * T.C -> O(m + n)
         * S.C -> O(m)
         */
    }

    // + Without using any extra space
    public static void mergeSortedArrays2(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1, p2 = n - 1;
        for (int i = nums1.length - 1; i >= 0; i--) {

            if (p2 < 0)
                break;

            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[i] = nums1[p1--];
            } else {
                nums1[i] = nums2[p2--];
            }
        }

        /*
         * In this, we are using loop from nums1.length - 1 -> 0, and for extra space we
         * have
         * created some variables.
         * 
         * So,
         * 
         * T.C -> O(m + n)
         * S.C -> O(1)
         */
    }

    // + Function to find best time to buy and sell a stock
    public static int maxProfit(int[] prices) {

        int minVal = prices[0], maxProfit=0;

        for (int i = 1; i < prices.length; i++) {
            if (minVal > prices[i]) {
                minVal = prices[i];
            }

            int profit = prices[i]-minVal;
            maxProfit=Math.max(maxProfit, profit);
        }

        return maxProfit;

        /*
         * The loop runs from 1 -> n, and for extra space we have used some variables.
         *
         * So,
         * 
         * T.C -> O(N)
         * S.C -> O(1)
         */
    }
}
