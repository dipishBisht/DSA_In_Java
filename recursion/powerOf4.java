// TODO Find if the number is power of 4 or not

//? if number becomes 1 then return true, if number becomes <=0 or number % 4 !=0 return false then return fn(num/4) 

package recursion;

import java.util.Scanner;

public class powerOf4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");

        // Take input of the number
        int num = sc.nextInt();

        sc.close();

        // Find asnwer
        boolean ans = isPowerOf4(num);

        // Print answer
        System.out.println(ans);
    }

    public static boolean isPowerOf4(int n) {
        // Base case
        if (n == 1)
            return true;

        // Do your work
        if (n <= 0 || n % 4 != 0)
            return false;

        // Divide into sub problem
        return isPowerOf4(n / 4);
    }
}
