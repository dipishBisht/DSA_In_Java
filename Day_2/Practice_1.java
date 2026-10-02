package Day_2;

public class Practice_1 {

    public static void main(String[] args) {

        /*
         * int[] arr = { 1, 54, 6, 3, 76, 323, 97 };
         * int idx = searchElement(arr, 54);
         * System.out.println(idx);
         */

        /*
         * int[] arr2 = { 1, 5, -32, 40, -84, -23, 412 };
         * int count = countNegative(arr2);
         * System.out.println(count);
         */

        /*
        * int[] arr3 = { 12, 4, -65, 23, 35, 41 };
        * int largest = findLargestNumber(arr3);
        * int smallest = findSmallestNumber(arr3);
        * System.out.println(largest);
        * System.out.println(smallest);
        */
    }

    // Function that search for element in an array and return the index of it, if
    // number does not exist then return -1
    public static int searchElement(int[] arr, int element) {

        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i])
                return i;
        }

        return -1;
    }

    // Function that returns the number of negative numbers in an array
    public static int countNegative(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0)
                count++;
        }

        return count;
    }

    // Function that return the largest number in an array
    public static int findLargestNumber(int[] arr) {
        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
        }

        return largest;
    }

    // Function that return the smallest number in an array
    public static int findSmallestNumber(int[] arr) {
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest)
                smallest = arr[i];
        }

        return smallest;
    }
}
