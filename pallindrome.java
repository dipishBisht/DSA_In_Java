//TODO In this question find is the given number is palindrome or not, if it is return true else return false.

//? Stored the number in the temp variable and then loop through the number gets its last digit and store it in first place at the
//? end return true if both the string matches else false. 

public class pallindrome {
    public static void main(String[] args) {
        int num = 121;
        boolean ans = isPallindrome(num);
        System.out.println(ans);
    }

    public static boolean isPallindrome(int num) {

        int ans = 0, temp = num;

        while (temp > 0) {
            int rem = temp % 10;
            ans = (ans * 10) + rem;
            temp /= 10;
        }
        return num == ans;
    }
}
