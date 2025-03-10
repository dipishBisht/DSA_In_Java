// TODO Print descreasing number from n to 1.

//? Take input and in function if n == 0 return then print the number and call the function by passing n-1. 

package recursion;

import java.util.Scanner;

public class printDecreasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");

        // Input of number
        int num = sc.nextInt();

        // Print decreasing numbers
        printHelper(num);

        sc.close();

    }

    public static void printHelper(int n) {
        // Bas case
        if (n == 0)
            return;

        // Do you work
        System.out.println(n);

        // Divide into sub problem
        printHelper(n - 1);
    }
}
