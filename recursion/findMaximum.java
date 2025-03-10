// TODO Find the maximum number in an array

//? If the index gets out of the array return the most minimum value exist which is Math.MIN_VALUE and at each index check which
//? value is greater and return that. 

package recursion;

public class findMaximum {
    public static void main(String[] args) {
        // Given Arraay
        int[] arr = { 5, 1, 4, 3, 6, 4 };

        // Find maxmimum
        int ans = findMaximumNumber(arr, 0);

        // Print maximum number
        System.out.println(ans);
    }

    public static int findMaximumNumber(int[] arr, int index) {

        // Base case
        if (index == arr.length)
            return Integer.MIN_VALUE;

        // Divide in sub problem
        int ans = findMaximumNumber(arr, index + 1);

        // Do your work
        return Math.max(ans, arr[index]);
    }
}
