//TODO In this question find is the given number is palindrome or not, if it is return true else return false.

//? Stored the number in the temp variable and then loop through the number gets its last digit and store it in first place at the
//? end return true if both the string matches else false. 

public class pallindrome {
    public static void main(String[] args) {
        // Eg: number
        int num = 121;

        // Function to find isPallindrome or not
        boolean ans = isPallindrome(num);

        // Print result
        System.out.println(ans);
    }

    public static boolean isPallindrome(int num) {

        // Initialize the variables
        int ans = 0, temp = num;

        // Loop untill temp is greater than 0
        while (temp > 0) {
            // Find the reminder
            int rem = temp % 10;

            // Put the digit in front
            ans = (ans * 10) + rem;

            // Remove the last digit
            temp /= 10;
        }

        // Return whether its true/false
        return num == ans;
    }
}
