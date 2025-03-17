// TODO Find the nth fibonacci number.

//? We know f(0)=0 and f(1)=1 and f(n)=f(n-1)+f(n-2) so if num is 0 then return 0, if num is 1 return 1 and if other number then
//? return the sum of f(n-1)+f(n-2)

package recursion;

public class fibonacci {
    public static void main(String[] args) {
        // Number
        int n = 5;

        // Find Answer
        int ans = helper(n);

        // Print answer
        System.out.println(ans);
    }

    public static int helper(int num) {
        // Base case
        if (num == 1)
            return 0;
        if (num == 2)
            return 1;

        // Do your work and divide in sub problem
        return helper(num - 1) + helper(num - 2);
    }
}