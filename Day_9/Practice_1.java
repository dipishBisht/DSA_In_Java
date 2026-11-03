package Day_9;

public class Practice_1 {

    public static void main(String[] args) {

        /*
         * int ans = fact(5);
         * System.out.println(ans);
         */

        /*
         * int[] arr = { 1, 5, 4, 7, 2, 4, 5 };
         * int ans = sum(arr, arr.length - 1);
         * System.out.println(ans);
         */

        int[] arr = { 8, 1, 5, 3, 4, 7, 2, 4, 5 };
        int ans = sumOfOdd(arr, arr.length - 1);
        System.out.println(ans);

    }

    // + Function to calculate factorial of a number
    public static int fact(int num) {

        if (num == 1)
            return 1;

        return num * fact(num - 1);

        /*
         * Here, the function fact calls itself with n-1, and the space used is also
         * relative
         * to n in the call stack.
         * 
         * So,
         * 
         * T.C -> O(n)
         * S.C -> O(n)
         */
    }

    // + Function to calculate sum of an array
    public static int sum(int[] arr, int n) {

        if (n == 0)
            return arr[n];

        return arr[n] + sum(arr, n - 1);

        /*
         * Here, the function sum calls itself with n-1, and the space used is also
         * relative
         * to n in the call stack.
         * 
         * So,
         * 
         * T.C -> O(n)
         * S.C -> O(n)
         */
    }

    // + Function to calculate sum of odd numbers of an array
    public static int sumOfOdd(int[] arr, int n) {

        boolean isOdd = arr[n] % 2 != 0;

        if (n == 0)
            return isOdd ? arr[n] : 0;

        int sum = 0;

        if (isOdd)
            sum += arr[n];

        return sum + sumOfOdd(arr, n - 1);

        /*
         * Here, the function sumOfOdd calls itself with n-1, and the space used is also
         * relative to n in the call stack.
         * 
         * So,
         * 
         * T.C -> O(n)
         * S.C -> O(n)
         */

    }
}
