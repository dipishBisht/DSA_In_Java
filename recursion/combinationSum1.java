// TODO Find all combination sum in an array, one number can come as many times.

// ? Base case 1 - when targert is 0 that means it is a combination so we will stor ein the result list, base case 2 - when target
// ? is less than 0 that means the combination is wrong or index == array length that means we have traverse the array so we have
// ? to stop then first call with not incrementing index and target - current index array value to get all possible outsomes which
// ? will have that number 1 or more than 1 times and send call not including that number and - from the target.   

import java.util.*;

public class combinationSum1 {

    public static void main(String[] args) {

        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;

        List<List<Integer>> list = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();

        helper(candidates, 0, temp, list, target);

        System.out.println(list);
    }

    public static void helper(int candidates[], int index, List<Integer> temp, List<List<Integer>> list, int target) {
        if (target == 0) {
            list.add(new ArrayList<>(temp));
            return;
        }

        if (target < 0 || index == candidates.length) {
            return;
        }

        // case-1
        temp.add(candidates[index]);
        helper(candidates, index, temp, list, target - candidates[index]);
        temp.remove(temp.size() - 1);

        // case-2
        helper(candidates, index + 1, temp, list, target);
    }
}