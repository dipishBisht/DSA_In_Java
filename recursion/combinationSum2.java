// TODO In the array find the list whose sum is equal to the target.

// ? if the target == 0 that means we need that combination so we add that list in our result then loop the array with i = idx
// ? to array length and check if current and next number is same so skip and if number is greater than target so exit the loop
// ? then add the number in the list and call the function with i + 1 and target - current number than while back tracking remove
// ? the last number.

import java.util.*;

public class combinationSum2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");

        // Input size of array
        int size = sc.nextInt();

        // Create array of input size
        int[] candidates = new int[size];

        System.out.println("Enter array numbers :");

        // Input arrays numbers
        for (int i = 0; i < candidates.length; i++) {
            candidates[i] = sc.nextInt();
        }

        System.out.println("Enter target :");

        // Input target
        int target = sc.nextInt();
        sc.close();

        // Create list to store answer
        List<List<Integer>> result = new ArrayList<>();

        // Sort to get combinations in sorted order
        Arrays.sort(candidates);

        // Find combinations
        findCombination(candidates, result, new ArrayList<>(), target, 0);

        // Print combinations
        System.out.println(result);
    }

    public static void findCombination(int[] candidates, List<List<Integer>> result, List<Integer> combinations,
            int target, int idx) {

        // Base case
        if (target == 0) {
            result.add(new ArrayList<>(combinations));
            return;
        }

        // Do your work
        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1])
                continue;

            if (candidates[i] > target)
                break;

            combinations.add(candidates[i]);
            findCombination(candidates, result, combinations, target - candidates[i], i + 1);
            combinations.remove(combinations.size() - 1);
        }
    }
}
