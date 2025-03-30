// TODO Find the num of n natural numbers.

//? If n ==1 return 1 and return number + func(n-1).


import java.util.Scanner;

public class sumOfNNaturalNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");

        // Input number
        int num = sc.nextInt();
        sc.close();

        // Find answer
        int ans = sumOfNaturalNumbers(num);

        // Print answer
        System.out.println(ans);
    }

    public static int sumOfNaturalNumbers(int n) {
        // Base case
        if (n == 1)
            return 1;

        // Divide in sub problem and return
        return n + sumOfNaturalNumbers(n - 1);
    }
}
