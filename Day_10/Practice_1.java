package Day_10;

public class Practice_1 {

    public static void main(String[] args) {

        /*
         * boolean ans = powerOfTwo(13);
         * System.out.println("ans -> " + ans);
         */

        int sum = sumOfFirstN(10);
        System.out.println(sum);

    }

    // + Function to find if the number is power of 2 or not.
    public static boolean powerOfTwo(int n) {

        if (n == 1)
            return true;

        if (n < 1 || n % 2 != 0)
            return false;

        return powerOfTwo(n / 2);

        /*
         * Here, the function powerOfTwo call itself with n/2 when its even number, and
         * for
         * space used is relative to n
         * 
         * So,
         * 
         * TC -> O(log n)
         * SC -> O(log n)
         */
    }

    public static int sumOfFirstN(int num) {

        if (num < 1)
            return 0;

        if (num == 1)
            return 1;
        return num + sumOfFirstN(num - 1);

        /*
         * Here, the function calls itself with num - 1, and space complexity is also
         * related with num.
         * 
         * So,
         * 
         * T.C -> O(N)
         * S.C -> O(N)
         */
    }
}
