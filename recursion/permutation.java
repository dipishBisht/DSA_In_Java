// TODO Find all permutations in the array.

//? 1. In the first way we have a array of nums, ans list, a temporary list to store each value and a boolean array to find if
//? the number already included in the list or not. Base case- wwhen the length of nums and temp array will equal, iterate each
//? value of nums array and send it in temp list is it is not visited and mark the value as visited in the boolean array else
//? continue and while returning from the recursion mark the num as false in visited array because to include in other list and
//? remove the last value of the temp list because it is extra else we will not get correct permutations.

//? 2. In the second way we have a array of nums, ans list, and index. Base case - when index is equal to nums.length. then create
//? a temp list and the nums each value in it and afterr that add that temp list in the ans list, after that iterate to each value
//? of nums and swap each value in each place and call the function and while coming back swap them again so they came back to 
//? their original place. 

package recursion;

import java.util.*;


public class permutation {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> ans = new ArrayList<>();

        // findPermutation1(nums, ans, new ArrayList<>(), new boolean[nums.length]);

        findPermutation2(nums, ans, 0);

        System.out.println(ans);

    }

    public static void findPermutation1(int[] nums, List<List<Integer>> ans, List<Integer> temp, boolean[] visited) {

        if (nums.length == temp.size()) {
            List<Integer> arr = new ArrayList<>(temp);

            ans.add(arr);
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i] == true)
                continue;

            visited[i] = true;
            temp.add(nums[i]);
            findPermutation1(nums, ans, temp, visited);
            visited[i] = false;
            temp.remove(temp.size() - 1);
        }
    }

    public static void findPermutation2(int[] nums, List<List<Integer>> ans, int idx) {

        if (idx == nums.length) {
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                temp.add(nums[i]);
            }

            ans.add(temp);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;

            findPermutation2(nums, ans, idx + 1);

            temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }
    }
}