package Day_3;

public class Nested_Loop {
    public static void main(String args[]) {

        int total = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                total++;
                // System.out.println("i=" + i + " j=" + j);
            }
        }
        System.out.println(total);
    }
}
