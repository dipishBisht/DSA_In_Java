// TODO Find all uniqe permutation in an array. 

// ? We have alreay done for finding all permutations now for unique permutations first we will sort the array then in function
// ? create a hash_set to store the values we have used then insdie the array before we swap we willcheck if the value has occured
// ? before or not if occured then course. if not then store the value in set and perform the other work we have dont before 


package recursion;

import java.util.*;

public class uniquePermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");

        // Input array size
        int size = sc.nextInt();

        // Create array
        int[] arr = new int[size];
        System.out.println("Enter array numbers :");

        // Input array numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        // Arraylist to store all unique permutations
        List<List<Integer>> result = new ArrayList<>();

        // Sort array to handle duplicates effectively
        Arrays.sort(arr);

        // Finding all unique permutations
        findUniquePermutation(arr, 0, result);

        // Printing result
        System.out.println(result);
    }

    public static void findUniquePermutation(int[] arr, int idx, List<List<Integer>> result) {

        // Base case
        if (idx == arr.length) {
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                temp.add(arr[i]);
            }

            result.add(temp);
            return;
        }

        // Set to track duplicates at the current recursive level
        HashSet<Integer> set = new HashSet<>();

        // Do your work and divide into sub problem
        for (int i = idx; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                continue;
            }
            set.add(arr[i]);

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;

            findUniquePermutation(arr, idx + 1, result);
            
            temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
}
