// TODO Find combinations of k nunbers with sum of n and numners from 1 to 9.

// ? Base case when k == 0 and temp == 0 so add that combination in the result and return and if idx > 9 so then also stop, then
// ? 2 option add the number and call the function with k - 1, and temp - idx and idx + 1, and then with not including and calling
// ? with idx + 1.

import java.util.*;

public class combinationSum3 {
    public static void main(String[] args) {
        int k = 9, n = 45, idx = 1;

        List<Integer> comb = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        findCombinations(k, n, n, idx, comb, list);
        System.out.println(list);
    }

    public static void findCombinations(int k, int n, int temp, int idx, List<Integer> comb, List<List<Integer>> list) {

        if (k == 0) {
            if (temp == 0) {
                list.add(new ArrayList<>(comb));
            }
            return;
        }

        if (idx > 9)
            return;

        comb.add(idx);
        findCombinations(k - 1, n, temp - idx, idx + 1, comb, list);
        comb.remove(comb.size() - 1);

        findCombinations(k, n, temp, idx + 1, comb, list);
    }
}