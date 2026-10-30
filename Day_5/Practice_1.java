package Day_5;

import java.util.HashMap;
import java.util.Map;

public class Practice_1 {

    public static void main(String[] args) {

        // int[] arr = { 4, 1, 2, 1, 4 };
        // int singleValue = singleNumber2(arr);
        // System.out.println(singleValue);

        int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        int missing = missingNumber(nums);
        System.out.println(missing);
    }

    // + Find the single number present in an array
    public static int singleNumber(int[] arr) {

        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!m.containsKey(arr[i]))
                m.put(arr[i], 1);
            else
                m.put(arr[i], m.get(arr[i]) + 1);
        }

        for (Map.Entry<Integer, Integer> i : m.entrySet()) {
            if (i.getValue() == 1)
                return i.getKey();
        }

        return -1;

        /*
         * The first loops runs from 0 -> n, and inside that loop containsKey(), get(),
         * put() operations of HashMap takes
         * O(1) constant time
         * 
         * So, total time for first loop is N x O(1) = O(N)
         * 
         * The second loop runs for every element in the map, which takes O(N) in the
         * worst case.
         * 
         * That's why total T.C -> O(N) + O(N) -> O(2N) -> O(N)
         * 
         * 
         * The space complexity will also be O(N) because of HashMap which grows linear
         * wih the size of input array
         *
         * 
         * T.C -> O(N)
         * S.C -> O(N)
         */
    }

    // + 2nd way to find a single number present in an array
    public static int singleNumber2(int[] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }

        return ans;

        /*
         * In this the loop is run from 0 -> n, so the time it takes is O(N), and there
         * is no extra space used is variable
         * ans which is constant so the extra space occupied is O(1).
         * 
         * 
         * T.C -> O(N)
         * S.C -> O(1)
         */
    }

    // + Find missing number in an array
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            sum = sum - nums[i];
        }

        return sum;

        /*
         * The loop run from 0 -> n which takes n time, and 3 variables used n, sum, and
         * i which is constant so space used
         * is constant.
         * 
         * 
         * T.C -> O(N)
         * S.C -> O(1)
         */
    }
}
