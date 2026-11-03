package Day_9;

public class Recursion {

    public static void main(String[] args) {

        printCounting(5);
    }

    public static void printCounting(int num) {

        if (num == 0)
            return;

        printCounting(num - 1);

        System.out.println(num);
    }
}
