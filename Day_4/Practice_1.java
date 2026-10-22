package Day_4;

public class Practice_1 {

    public static void main(String[] args) {

        // int count = countNumbers(-6345);
        // System.out.println(count);

        // boolean check = isPalindrome(5435);
        // System.out.println(check);

        int reversedNumber = reverse(-1434343789);
        System.out.println(reversedNumber);

    }

    // Function to count numbers
    public static int countNumbers(int num) {

        if (num == 0)
            return 1;

        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count;
    }

    // Function to check if the number is pallindrome or not
    public static boolean isPalindrome(int num) {

        if (num < 0)
            return false;

        int ans = 0;
        int temp = num;
        while (temp != 0) {
            int rem = temp % 10;
            ans = ans * 10 + rem;
            temp = temp / 10;
        }

        return num == ans;
    }

    // Function to reverse a signed 32-bit integer number
    public static int reverse(int num) {

        long ans = 0;

        while (num != 0) {
            int rem = num % 10;
            ans = ans * 10 + rem;
            num = num / 10;
        }

        if (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE)
            return 0;

        return (int) ans;
    }
}
