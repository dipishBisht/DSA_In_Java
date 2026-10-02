package Day_1;

public class IfElse {
    public static void main(String[] args) {

        /*
         * int num = -43;
         * isNegativeNumber(num);
         */

        /*
         * int age = 23;
         * isEligibleToVote(age);
         */
    }

    // Checks whether the given number is negative or not
    public static void isNegativeNumber(int num) {

        if (num < 0)
            System.out.println(num + " is a negative number");
        else
            System.out.println(num + " is not a negative number");

    }

    // Checks if the person with that age is eligible to vote or not
    public static void isEligibleToVote(int age) {

        if (age > 18)
            System.out.println("The person is eligible to vote.");
        else if (age < 0)
            System.out.println("Invalid age.");
        else
            System.out.println("Not eligible to vote.");
    }

}
