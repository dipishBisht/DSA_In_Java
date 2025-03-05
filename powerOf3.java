// TODO Find if the given number if the power of three of not.

//? If the number is 0 or less than 0 return false. divide the number by 3 untill it is divisible at the end if the number
//? becames 1 then return true else false.

public class powerOf3 {
    public static void main(String[] args) {
        int num = 9;
        if (num <= 0) {
            System.out.println(false);
            return;
        }

        while (num % 3 == 0) {
            num /= 3;
        }

        if (num == 1)
            System.out.print(true);
        else
            System.out.print(false);

    }
}
