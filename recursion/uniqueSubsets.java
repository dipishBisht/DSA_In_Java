// TODO Find all uniqe subsets of an array

// ?  We have already done for finding all subsets to find unique ones, first we will sort the array and then  for  calling the
// ?  function without passing a number that time we will runs a while loop and check if the current number is equal to its next
// ?  number so do idx++. 


import java.util.*;

public class uniqueSubsets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");

        // Enter array size
        int size = sc.nextInt();

        // Create array
        int[] arr = new int[size];

        System.out.println("Enter array numsbers :");

        // Input array numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // To store unique subsets
        List<List<Integer>> result = new ArrayList<>();

        // sort the array
        Arrays.sort(arr);

        // Find unique subsets
        findUniqueSubsets(arr, result, new ArrayList<>(), 0);

        // Print result
        System.out.println(result);
    }

    public static void findUniqueSubsets(int[] arr, List<List<Integer>> result, List<Integer> nums, int idx) {
        // Base case
        if (arr.length == idx) {
            result.add(new ArrayList<>(nums));
            return;
        }

        // Do your work and divide into sub problem
        nums.add(arr[idx]);
        findUniqueSubsets(arr, result, nums, idx + 1);
        nums.remove(nums.size() - 1);

        while (idx + 1 < arr.length && arr[idx] == arr[idx + 1]) {
            idx++;
        }

        findUniqueSubsets(arr, result, nums, idx + 1);
    }
}
