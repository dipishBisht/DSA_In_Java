package recurssion;

public class findMaximum {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 3, 6, 4 };
        int ans = findMaximumNumber(arr, 0);

        System.out.println(ans);
    }

    public static int findMaximumNumber(int[] arr, int index) {

        if (index == arr.length)
            return Integer.MIN_VALUE;

        int ans = findMaximumNumber(arr, index + 1);
        return Math.max(ans, arr[index]);
    }
}
