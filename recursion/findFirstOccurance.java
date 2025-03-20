// TODO Find the first occurance of a number if not find then return -1.

// ? Take all inouts, in base case in the idx is equal to array length then return -1. Then check if the current number is the
// ? number to fnd then return index then return the function()with index+1.

package recursion;

import java.util.Scanner;

public class findFirstOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array :");

        // Input size of the array
        int size = sc.nextInt();

        // Create array
        int[] arr = new int[size];
        System.out.println("Enter array numbers :");

        // Inout of array numbers
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter number to find :");

        // Enter number to find
        int num = sc.nextInt();
        sc.close();

        // Find answer
        int ans = findFirstOccuranceOfNum(arr, num, 0);

        // Print answer
        System.out.println(ans);
    }

    public static int findFirstOccuranceOfNum(int[] arr, int num, int idx) {
        // Base case
        if (arr.length == idx)
            return -1;

        // Do your work
        if (arr[idx] == num)
            return idx;

        // Divide in sub problem
        return findFirstOccuranceOfNum(arr, num, idx + 1);
    }
}
