package recurssion;

public class findMinimum {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 15, 9, 7 };

        int ans = findMinimumNumber(arr, 0);

        System.out.println(ans);
    }

    public static int findMinimumNumber(int[] arr, int index) {
        if (index == arr.length)
            return Integer.MAX_VALUE;

        int ans = findMinimumNumber(arr, index + 1);

        return Math.min(ans, arr[index]);
    }
}
