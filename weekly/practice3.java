import java.util.*;

public class practice3 {
    public static void main(String[] args) {

        // int n = 4, k = 2;
        // List<List<Integer>> result = new ArrayList<>();
        // findCombinations(n, k, result, new ArrayList<>(), 1);
        // System.out.println(result);

        // int[] candidates = { 2, 3, 6, 7 };
        // int target = 7;
        // List<List<Integer>> result = new ArrayList<>();
        // findCombinationSum1(candidates, target, result, new ArrayList<>(), 0);
        // System.out.println(result);

        // int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
        // int target = 8;
        // List<List<Integer>> result = new ArrayList<>();
        // Arrays.sort(candidates);
        // findCombinationSum2(candidates, target, result, new ArrayList<>(), 0);
        // System.out.println(result);

        // int k = 3, n = 7;
        // List<List<Integer>> result = new ArrayList<>();
        // findCombinationSum3(k, n, result, new ArrayList<>(), 1);
        // System.out.println(result);

        int[] digits = { 1, 2, 3, 4 };
        Set<Integer> result = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        boolean[] used = new boolean[digits.length];
        Arrays.sort(digits);
        findUniqueEvenNumbers(digits, result, sb, used, 0);
        System.out.println(result);
    }

    public static void findCombinations(int n, int k, List<List<Integer>> result, List<Integer> combinations, int idx) {

        if (k == 0) {
            result.add(new ArrayList<>(combinations));
            return;
        }

        if (idx > n || (k > n - idx + 1))
            return;

        combinations.add(idx);
        findCombinations(n, k - 1, result, combinations, idx + 1);
        combinations.remove(combinations.size() - 1);
        findCombinations(n, k, result, combinations, idx + 1);
    }

    public static void findCombinationSum1(int[] candidates, int target, List<List<Integer>> result,
            List<Integer> combinations, int idx) {

        if (target == 0) {
            result.add(new ArrayList<>(combinations));
            return;
        }

        if (target < 0 || candidates.length == idx)
            return;

        combinations.add(candidates[idx]);
        findCombinationSum1(candidates, target - candidates[idx], result, combinations, idx);
        combinations.remove(combinations.size() - 1);
        findCombinationSum1(candidates, target, result, combinations, idx + 1);
    }

    public static void findCombinationSum2(int[] candidates, int target, List<List<Integer>> result,
            List<Integer> combinations, int idx) {

        if (target == 0) {
            result.add(new ArrayList<>(combinations));
            return;
        }

        for (int i = idx; i < candidates.length; i++) {

            if (i > idx && candidates[i] == candidates[i - 1])
                continue;

            if (candidates[i] > target)
                break;

            combinations.add(candidates[i]);
            findCombinationSum2(candidates, target - candidates[i], result, combinations, i + 1);
            combinations.remove(combinations.size() - 1);
        }
    }

    public static void findCombinationSum3(int k, int n, List<List<Integer>> result, List<Integer> combinations,
            int idx) {

        if (k == 0 && n == 0) {
            result.add(new ArrayList<>(combinations));
            return;
        }

        if (k < 0 || n < 0 || idx > 9)
            return;

        combinations.add(idx);
        findCombinationSum3(k - 1, n - idx, result, combinations, idx + 1);
        combinations.remove(combinations.size() - 1);
        findCombinationSum3(k, n, result, combinations, idx + 1);
    }

    public static void findUniqueEvenNumbers(int[] digits, Set<Integer> result, StringBuilder s, boolean[] used,
            int idx) {

        if (s.length() == 3) {
            if (s.charAt(0) != '0') {
                int num = Integer.parseInt(s.toString());
                if (num % 2 == 0) {
                    result.add(num);
                }
            }
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (used[i])
                continue;
            if (i > 0 && digits[i] == digits[i - 1] && !used[i - 1])
                continue;
            used[i] = true;
            s.append(digits[i]);
            findUniqueEvenNumbers(digits, result, s, used, idx+1);
            s.deleteCharAt(s.length() - 1);
            used[i] = false;
        }
    }
}
