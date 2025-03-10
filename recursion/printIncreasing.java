// TODO Print increasing number from 1 to n.

//? Take input and in function if n == 0 return then  call the function by passing n-1 and print the number. 

package recursion;

import java.util.Scanner;

public class printIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");

        // Enter number
        int num = sc.nextInt();

        // Print increasing number
        printHelper(num);

        sc.close();

    }

    public static void printHelper(int n) {
        // Base case
        if (n == 0)
            return;

        // Divide in sub problem
        printHelper(n - 1);

        // Do your work
        System.out.println(n);

    }
}
