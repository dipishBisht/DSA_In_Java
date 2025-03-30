import java.util.*;

public class practice2 {

    public static void main(String[] args) {

        // String[] arr = { "5", "-2", "4", "C", "D", "9", "+", "+" };
        // int ans = findScore(arr);
        // System.out.println(ans);

        // towerOfHanoi("T1", "T2", "T3", 3);

        // int[] arr = { 1, 4, 2, 3, 4, 1, 5 };
        // int ans = findFirstOccurance(arr, 5, 0);
        // System.out.println(ans);

        // int[] arr = { 1, 4, 2, 3, 4, 1, 5 };
        // int ans = findLastOccurance(arr, 1, 0);
        // System.out.println(ans);

        // int[] nums = { 2, 7, 9, 3, 1 };
        // int[] memo = new int[nums.length + 1];
        // Arrays.fill(memo, -1);
        // int ans = houseRobber(nums, memo, 0);
        // System.out.println(ans);

        // int[] arr = { 1, 2, 2 };
        // List<List<Integer>> result = new ArrayList<>();
        // findUniquePermutation(arr, result, 0);
        // System.out.println(result);

        int[] arr = { 1, 2, 2 };
        List<List<Integer>> result = new ArrayList<>();
        findUniqueSubsets(arr, result, new ArrayList<>(), 0);
        System.out.println(result);
    }

    public static int findScore(String[] arr) {

        List<Integer> score = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "C") {
                score.remove(score.size() - 1);
            } else if (arr[i] == "D") {
                score.add(2 * score.get(score.size() - 1));
            } else if (arr[i] == "+") {
                score.add(score.get(score.size() - 1) + score.get(score.size() - 2));
            } else {
                score.add(Integer.parseInt(arr[i]));
            }
        }

        int sum = 0;

        for (int i = 0; i < score.size(); i++) {
            sum = sum + score.get(i);
        }

        return sum;
    }

    public static void towerOfHanoi(String t1, String t2, String t3, int disks) {

        if (disks == 0) {
            return;
        }

        towerOfHanoi(t1, t3, t2, disks - 1);
        System.out.println("Disk " + disks + " from " + t1 + " to " + t2);
        towerOfHanoi(t3, t2, t1, disks - 1);
    }

    public static int findFirstOccurance(int[] arr, int num, int idx) {

        if (idx == arr.length)
            return -1;

        if (arr[idx] == num)
            return idx;

        return findFirstOccurance(arr, num, idx + 1);
    }

    public static int findLastOccurance(int[] arr, int num, int idx) {
        if (idx == arr.length)
            return -1;

        int result = findLastOccurance(arr, num, idx + 1);

        if (arr[idx] == num && result == -1)
            return idx;

        return result;
    }

    public static int houseRobber(int[] nums, int[] memo, int idx) {
        if (idx >= nums.length)
            return 0;

        if (memo[idx] != -1)
            return memo[idx];

        int option1 = houseRobber(nums, memo, idx + 1);

        int option2 = nums[idx] + houseRobber(nums, memo, idx + 2);

        memo[idx] = Math.max(option1, option2);

        return memo[idx];
    }

    public static void findUniquePermutation(int[] arr, List<List<Integer>> result, int idx) {

        if (idx == arr.length) {
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                temp.add(arr[i]);
            }

            result.add(temp);
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = idx; i < arr.length; i++) {
            if (set.contains(arr[i]))
                continue;
            set.add(arr[i]);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
            findUniquePermutation(arr, result, idx + 1);
            temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }

    public static void findUniqueSubsets(int[] arr, List<List<Integer>> result, List<Integer> subsets, int idx) {

        if (idx == arr.length) {
            result.add(new ArrayList<>(subsets));
            return;
        }

        subsets.add(arr[idx]);
        findUniqueSubsets(arr, result, subsets, idx + 1);
        subsets.remove(subsets.size() - 1);

        while (idx + 1 < arr.length && arr[idx] == arr[idx + 1]) {
            idx++;
        }

        findUniqueSubsets(arr, result, subsets, idx + 1);
    }

}
