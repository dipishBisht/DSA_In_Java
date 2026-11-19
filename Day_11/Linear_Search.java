package Day_11;

public class Linear_Search {

    public static void main(String[] args) {

        int arr[] = { 1, 4, 32, 54, 14, 26 };
        int target = 32;

        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    // + Find a number using linear search.
    public static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;

        /*
         * Here, the loop runs from 0 to length of arr and for extra space we have used 
         * single i variable.
         * 
         * So,
         * 
         * T.C -> O(N)
         * S.C -> O(1)
         */
    }
}
