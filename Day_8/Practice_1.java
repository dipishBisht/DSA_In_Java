package Day_8;

public class Practice_1 {

    public static void main(String[] args) {

        /*
         * char[] ch = { 'h', 'e', 'l', 'l', 'o' };
         * reverseString(ch);
         *
         * for (char i : ch) {
         * System.out.println(i);
         * }
         */

        /*
         * int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
         * int val = 2;
         *
         * int k = removeElements(nums, val);
         * System.out.println("k -> " + k);
         */

        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int ans = removeDuplicates(nums);
        System.out.println("ans ->" + ans);

        for (int i : nums) {
            System.out.println(i);
        }

    }

    // + Reverse the array of string (char)
    public static void reverseString(char[] s) {

        int l = 0, r = s.length - 1;

        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }

        /*
         * The loop starts from 0 and ends when the left is greater than the right
         * pointer,
         * which is n/2, and for extra space we have used some variables
         * 
         * So,
         * 
         * T.C -> O(N/2) -> O(N)
         * S.C -> O(1)
         */
    }

    // + Remove elements
    public static int removeElements(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val)
                nums[k++] = nums[i];
        }

        return k;
    }

    // + Remove duplicate elements from sorted array
    public static int removeDuplicates(int[] nums) {

        int curVal = nums[0];
        int p1 = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != curVal) {
                nums[p1++] = nums[i];
                curVal = nums[i];
            }
        }

        return p1;

        /*
         * In this, a single loop runs from  1 -> length, and for extra space we have used
         * some variables.
         * 
         * So,
         * 
         * T.C -> O(N)
         * S.C -> O(1)
         */
    }
}
