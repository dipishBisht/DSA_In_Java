package Day_6;

public class Practice_1 {

    public static void main(String[] args) {

        /*
         * int arr[] = { 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1 };
         * int total = findConsecutive1Enhanced(arr);
         * System.out.println(total);
         */

        int[] arr = { 0, 1, 0, 3, 12 };
        moveZeroesToEnd(arr);
        for (int i : arr) {
            System.out.println(i);
        }

    }

    // + My Version - It was a bit complex
    // + Function to find maximum consecutive 1
    public static int findConsecutive1(int[] arr) {

        int count = 0, store = 0;
        boolean isZero = false;

        for (int i = 0; i < arr.length; i++) {
            if (isZero) {
                if (store < count)
                    store = count;
                count = 0;
                isZero = false;
            }

            if (arr[i] == 1)
                count++;
            else
                isZero = true;

            if (store < count)
                store = count;
        }

        return store;
    }

    // + Enhanced version of previous question
    public static int findConsecutive1Enhanced(int[] arr) {

        int count = 0, store = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1)
                count++;
            else
                count = 0;

            store = Math.max(count, store);
        }

        return store;
    }

    // + Function to move zeroes to end
    public static void moveZeroesToEnd(int[] arr) {

        // ? T.C -> O(N2)
        /*
         * for (int i = 0; i < arr.length; i++) {
         * for (int j = 0; j < arr.length - 1; j++) {
         * if (arr[j] == 0) {
         * arr[j] = arr[j + 1];
         * arr[j + 1] = 0;
         * }
         * }
         * }
         */

        int track = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[track];
                arr[track++] = temp;
            }
        }
    }

}
