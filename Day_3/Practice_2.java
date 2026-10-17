package Day_3;

public class Practice_2 {
    public static void main(String[] args) {

        int n = 4;

        // pattern_1(n);
        // pattern_2(n);
        // pattern_3(n);
        // pattern_4(n);
        // pattern_5(n);
        // pattern_6(n);
        // pattern_7(n);
        // pattern_8(n);
        pattern_9(n);
    }

    static public void pattern_1(int n) {
        for (int i = 0; i < n; i++) {               // * * * *
            for (int j = 0; j < n; j++) {           // * * * *
                System.out.print("* ");             // * * * *
            }                                       // * * * *
            System.out.println();
        }
    }

    static public void pattern_2(int n) {
        for (int i = 0; i < n; i++) {               // *
            for (int j = 0; j < i + 1; j++) {       // * *
                System.out.print("* ");             // * * *
            }                                       // * * * *
            System.out.println();
        }
    }

    static public void pattern_3(int n) {
        for (int i = 0; i < n; i++) {               // 1
            for (int j = 0; j < i + 1; j++) {       // 1 2
                System.out.print(j + 1 + " ");      // 1 2 3
            }                                       // 1 2 3 4
            System.out.println();
        }
    }

    static public void pattern_4(int n) {
        for (int i = 0; i < n; i++) {               // 1
            for (int j = 0; j < i + 1; j++) {       // 2 2
                System.out.print(i + 1 + " ");      // 3 3 3
            }                                       // 4 4 4 4
            System.out.println();
        }
    }

    static public void pattern_5(int n) {
        for (int i = 0; i < n; i++) {               // 1 2 3 4
            for (int j = 0; j < n - i; j++) {       // 1 2 3
                System.out.print(j + 1);            // 1 2
            }                                       // 1
            System.out.println();
        }
    }

    static public void pattern_6(int n) {
        for (int i = 0; i < n; i++) {               // * * * *
            for (int j = 0; j < n - i; j++) {       // * * *
                System.out.print("* ");             // * *
            }                                       // *
            System.out.println();
        }
    }

    static public void pattern_7(int n) {
        for (int i = 0; i < n; i++) {               // *
            for (int j = 0; j < n - i - 1; j++) {   // * *
                System.out.print("  ");             // * * *
            }                                       // * * * *
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static public void pattern_8(int n) {
        for (int i = 0; i < n; i++) {               // 1
            for (int j = 0; j < i + 1; j++) {       // 1 0
                if (j % 2 == 0)                     // 1 0 1
                    System.out.print("1 ");         // 1 0 1 0
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    static public void pattern_9(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {               // 1
            for (int j = 0; j < i + 1; j++) {       // 0 1
                System.out.print(num);              // 0 1 0
                if (num == 0)                       // 1 0 1 0
                    num = 1;
                else
                    num = 0;
            }
            System.out.println();
        }
    }

}
