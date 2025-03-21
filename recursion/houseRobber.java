// TODO In this you can rob adjacent houses each house some amount give me maximum amount you can rob.

// ? Take all inputs and cal the funcation base case when index is out of bound. Then if answer is alreay there in dp array then
// ? return it. Then we have two option dont rob the house and idex+1 and rob the house get the money and rob next adjacent house
// ? and store the greater number between option1 and option2 and store it in dp array and return the arr[idx].

package recursion;

import java.util.*;

public class houseRobber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size :");

        // Enter array size
        int size = sc.nextInt();

        // Create array
        int[] arr = new int[size];

        System.out.println("Enter array numbers :");

        // Input array numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int[] dp = new int[size + 1];
        Arrays.fill(dp, -1);
        int ans = robTheHouse(arr, 0, dp);

        System.out.println(ans);
    }

    public static int robTheHouse(int[] arr, int idx, int[] dp) {
        if (idx >= arr.length)
            return 0;

        if (dp[idx] != -1)
            return dp[idx];

        int option1 = robTheHouse(arr, idx + 1, dp);

        int option2 = arr[idx] + robTheHouse(arr, idx + 2, dp);

        dp[idx] = Math.max(option1, option2);

        return dp[idx];
    }
}
