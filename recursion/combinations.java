// TODO Find all combinations of k size from 1 to n.

// ? If k == 0 so add that combination in our result list, if idx > n or k > n-idx+1 then return because that is not valid
// ? combination then option 1 to include current number and call function with idx+1 and k-1 then while backtraking remove the
// ? number because in second case we not have to include the number then call the function.  

import java.util.*;

public class combinations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input of value n
        System.out.println("Enter n value :");
        int n = sc.nextInt();

        // Input of vaalue k
        System.out.println("Enter k value");
        int k = sc.nextInt();
        sc.close();

        // To store combinations
        List<List<Integer>> result = new ArrayList<>();

        // Find combinations
        findCombinationsOfSizeK(n, result, new ArrayList<>(), 1, k);

        // Print combinations
        System.out.println(result);
    }

    public static void findCombinationsOfSizeK(int n, List<List<Integer>> result, List<Integer> combinations,
            int idx, int k) {

        // Base cases

        if (k == 0) {
            result.add(new ArrayList<>(combinations));
            return;
        }

        if (idx > n || k > n - idx + 1)
            return;

        // Option 1: Add number
        combinations.add(idx);
        findCombinationsOfSizeK(n, result, combinations, idx + 1, k - 1);
        combinations.remove(combinations.size() - 1);

        // Option 2: Dont add number
        findCombinationsOfSizeK(n, result, combinations, idx + 1, k);
    }
}
