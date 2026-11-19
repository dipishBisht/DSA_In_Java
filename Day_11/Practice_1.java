package Day_11;

public class Practice_1 {

    public static void main(String[] args) {

        int ans = fibonacci(8);

        System.out.println(ans);
    }

    // + Find fibonacci number
    public static int fibonacci(int num) {

        if (num <= 1)
            return num;

        return fibonacci(num - 1) + fibonacci(num - 2);

        /*
         * Here, the each funtion call itself 2 times with n - 1 and n - 2 untill its <=1
         * and depth till it goes to is n.
         * 
         * So,
         * 
         * T.C -> O(2N)
         * S.c -> O(N)
         */
    }
}
