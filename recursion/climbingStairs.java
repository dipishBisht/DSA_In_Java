// TODO Find total possible ways to climb n stairs, can only climb 1 or 2 stairs.

//? Take inout of stairs, create array of size n+1 and store -1 in all places of array, base case when stimbed at top (n==0)
//? return 1, checking in array in the total possible way for that stirs is present or not if it is return the answer from the
//?  array, call the function to climb 1 stair function(arr, n-1), for climbing 2 stairs if n>=2 then function(arr, n-2), after
//? getting answer for that stirs store it in array arr[n]=ans, and at end return ans.

package recursion;

import java.util.*;

public class climbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter stairs number:");

        // Input number of stairs
        int n = sc.nextInt();

        // Array to store ans for dp
        int[] arr = new int[n + 1];

        // Putting -1 in all places of array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        sc.close();

        // Finding all possible ways
        int ans = climbHelper(arr, n);

        System.out.println(ans);
    }

    public static int climbHelper(int[] arr, int n) {
        // Base case
        if (n == 0)
            return 1;

        // Getting value from array
        if (arr[n] != -1)
            return arr[n];

        // Finding possible ways when climbing 1 stirs
        int ans = climbHelper(arr, n - 1);

        // Finding possible ways when climbing 2 stirs
        if (n >= 2)
            ans += climbHelper(arr, n - 2);

        // Storing all possible ways for n stairs in array
        arr[n] = ans;

        // Returing total possible ways
        return ans;
    }
}
