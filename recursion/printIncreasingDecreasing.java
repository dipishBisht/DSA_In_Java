package recursion;

import java.util.Scanner;

public class printIncreasingDecreasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        sc.close();

        printIncDec(num);
    }

    public static void printIncDec(int num) {
        if (num == 0)
            return;

        System.out.println(num);
        printIncDec(num - 1);
        System.out.println(num);
    }
}
