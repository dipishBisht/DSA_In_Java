// TODO Find total pairs whose numsber are equal to each other and their index
// TODO multiplication shouldbe divisible by k.

// ? Base case: when idx is out of length then return 0 then call the function and it will return the answer then loop the array
// ? and check if the current number is equal to the other numsbers and if it is equal and their index multiplication % gives 0
// ? then ans++ then at end return ans.

import java.util.*;

public class equalAndDivisible {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");

        // Input array size
        int size = sc.nextInt();

        System.out.println("Enter k value :");
        
        // Input k value
        int k = sc.nextInt();

        // Create array of size
        int[] arr = new int[size];
        System.out.println("Enter array numbers:");

        // Enter array numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // Find answer
        int ans = findNumber(arr, k, 0);

        // Print answer
        System.out.println(ans);
    }

    public static int findNumber(int[] arr, int k, int idx) {

        if (idx == arr.length)
            return 0;

        int ans = findNumber(arr, k, idx + 1);

        for (int i = idx + 1; i < arr.length; i++) {
            if (arr[i] == arr[idx] && (i * idx) % k == 0)
                ans++;
        }

        return ans;
    }
}
