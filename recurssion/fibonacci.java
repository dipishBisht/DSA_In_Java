// TODO Find the nth fibonacci number.

//? We know f(0)=0 and f(1)=1 and f(n)=f(n-1)+f(n-2) so if num is 0 then return 0, if num is 1 return 1 and if other number then
//? return the sum of f(n-1)+f(n-2)

package recurssion;

public class fibonacci {
    public static void main(String[] args) {
        int n = 5;

        int ans = helper(n);

        System.out.println((ans));
    }

    public static int helper(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;

        return helper(num - 1) + helper(num - 2);
    }
}