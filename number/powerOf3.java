// TODO Find if the given number if the power of three of not.

//? If the number is 0 or less than 0 return false. divide the number by 3 untill it is divisible at the end if the number
//? becames 1 then return true else false.


public class powerOf3 {
    public static void main(String[] args) {
        // Eg: number
        int num = 9;

        // Check if the number is 0 or negative
        if (num <= 0) {
            System.out.println(false);
            return;
        }

        // Check if the number is divisible by 3 or not
        while (num % 3 == 0) {
            // Divide it by 3 untill it is divisible
            num /= 3;
        }

        // If num is 1 then true else false
        if (num == 1)
            System.out.print(true);
        else
            System.out.print(false);

    }
}
