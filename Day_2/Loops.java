package Day_2;

public class Loops {
    public static void main(String args[]) {

        //? Simple for Loop
        /*
         * for (int i = 1; i <= 5; i++) {
         * System.out.println(i);
         * }
         */

        //? Loop with function
        /*
         * for (int i = 0; i < 5; i++) {
         * checkEvenOrOdd(i);
         * }
         */

        //? Loop with array
        /*
         * // int[] nums = new int[5];
         * int[] nums = { 1, 50, -8, 0, -453, 87 };
         * 
         * for (int i = 0; i < nums.length; i++) {
         * checkPositiveOrNegative(nums[i]);
         * }
         */

        //? While Loop
        /*
        * int i = 0;
        
        * while (i < 5) {
        *    System.out.println(i);
        *    
        *    i++;
        * }
        */
    }

    public static void checkPositiveOrNegative(int n) {
        if (n == 0)
            System.out.println(n + " is neither postive or negative");
        else if (n > 0)
            System.out.println(n + " is a postive number");
        else
            System.out.println(n + " is a negative number");

    }

    public static void checkEvenOrOdd(int n) {
        if (n == 0)
            System.out.println(n + " is neither even or odd");
        else if (n % 2 == 0)
            System.out.println(n + " is a even number");
        else
            System.out.println(n + " is a odd number");

    }
}
