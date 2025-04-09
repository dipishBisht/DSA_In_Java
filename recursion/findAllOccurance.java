// TODO Find all occurance of number in an array  and return array of indexs.

// ? We will have variable fsf which will track how many occurance have came, then base case we know how many number jave came so
// ? we create a array of that size and then return the array and then check if the current number is the numberwe want or not if
// ? want then add increase + 1 in fsf and call the function also with index +1 and while backtracking put array[fsf] = idx and
// ? in else condition just call the function and increase ind + 1.  

import java.util.*;

public class findAllOccurance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");

        // Input size of array
        int size = sc.nextInt();
        System.out.println("Enter number to find :");

        // Input number to find
        int number = sc.nextInt();

        // Create array of size
        int[] nums = new int[size];
        System.out.println("Enter array numbers :");

        // Input array numbers
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        sc.close();

        // Create list to store answer
        List<Integer> result = new ArrayList<>();

        // Find answer
        findAllOccuranceHelper(nums, number, result, 0);

        // Find answer
        System.out.println(result);

        int[] result2 = findWithoutList(nums, number, 0, 0);
        for (int i = 0; i < result2.length; i++) {
            System.out.println(result2[i]);
        }
    }

    public static int[] findWithoutList(int[] nums, int number, int idx, int fsf) {

        if (nums.length == idx) {
            int[] arr = new int[fsf];
            return arr;
        }

        if (nums[idx] == number) {
            int[] arr = findWithoutList(nums, number, idx + 1, fsf + 1);
            arr[fsf] = idx;
            return arr;
        } else {
            int[] arr = findWithoutList(nums, number, idx + 1, fsf);
            return arr;
        }
    }

    public static void findAllOccuranceHelper(int[] nums, int number, List<Integer> result, int idx) {
        // Base case
        if (idx == nums.length)
            return;

        // Do your work
        if (nums[idx] == number)
            result.add(idx);

        // Divide into sub part
        findAllOccuranceHelper(nums, number, result, idx + 1);
    }
}