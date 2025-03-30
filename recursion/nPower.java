// TODO Find power of the number.

//? Base case when n==0 return 1, cf(n, p/2) half and store in a varibale at end cheeck is the pow is even or odd if even return
// ? ans * ans else ans * ans * n.


import java.util.Scanner;

public class nPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input of number ans power
        System.out.println("Enter Number");
        int num = sc.nextInt();

        System.out.println("Enter Power");
        int pow = sc.nextInt();

        sc.close();

        // Find asnwer
        int ans = findNPower(num, pow);

        // Print answer
        System.out.println(ans);
    }

    public static int findNPower(int num, int pow) {
        // Base case
        if (pow == 0)
            return 1;

        // Do your work and call the function
        int ans = findNPower(num, pow / 2);

        return pow % 2 != 0 ? ans * ans * num : ans * ans;
    }
}
