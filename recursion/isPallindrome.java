// TODO Check whether the given string is pallindrome or not.

//? Check if the pointers and met or cross each other ifit is then return true then check if the character at left and right
//? pointer are != then return false, and at return at fn(s, left, right). 


import java.util.Scanner;

public class isPallindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string :");

        // Take input
        String s = sc.next();

        sc.close();

        // Find answer
        boolean ans = findIsPallindrome(s, 0, s.length() - 1);

        // Find answer
        System.out.println(ans);
    }

    public static boolean findIsPallindrome(String s, int start, int end) {
        // Base case
        if (start >= end)
            return true;

        // Do your work
        if (s.charAt(start) != s.charAt(end))
            return false;

        // Divide in sub problem
        return findIsPallindrome(s, start + 1, end - 1);
    }
}