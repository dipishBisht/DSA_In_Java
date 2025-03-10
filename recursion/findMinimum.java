// TODO Find the minimum number in an array

//? If the index gets out of the array return the most largest value exist which is Math.MAX_VALUE and at each index check which
//? value is smaller and return that.

package recursion;

public class findMinimum {
    public static void main(String[] args) {
        // Given array
        int[] arr = { 4, 2, 15, 9, 7 };

        // Find minimum value
        int ans = findMinimumNumber(arr, 0);

        // Print answer
        System.out.println(ans);
    }

    public static int findMinimumNumber(int[] arr, int index) {
        // Base case
        if (index == arr.length)
            return Integer.MAX_VALUE;

        // Divide in sub problem
        int ans = findMinimumNumber(arr, index + 1);

        // Do your work
        return Math.min(ans, arr[index]);
    }
}
