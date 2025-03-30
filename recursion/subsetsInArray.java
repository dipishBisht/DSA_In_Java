// TODO Find all subsets of array of numbers.

// ? Base case - when idx is == array length then add the subsets in the result array then at each index of array we have two
// ? options first include the number and second dont include, so add number in subset and call the function with index +1, then
// ? remove the number while backtracking then call the function while not including number and index+1.

import java.util.*;

public class subsetsInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");

        // Take input of sixe of the array
        int size = sc.nextInt();

        // Create array
        int[] arr = new int[size];
        System.out.println("Enter array numbers");

        // Get array numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subSets = new ArrayList<>();

        // Find subsets
        findSubsets(arr, result, subSets, 0);

        // Print all subsets
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static void findSubsets(int[] arr, List<List<Integer>> result, List<Integer> subSets, int idx) {
        // Base case
        if (arr.length == idx) {
            result.add(new ArrayList<>(subSets));
            return;
        }

        // Do your work and divide into sub problems

        subSets.add(arr[idx]);
        findSubsets(arr, result, subSets, idx + 1);

        subSets.remove(subSets.size() - 1);
        findSubsets(arr, result, subSets, idx + 1);
    }
}